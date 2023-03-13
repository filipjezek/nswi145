package nswi145client;

import javax.xml.namespace.QName;
import jakarta.xml.soap.MessageFactory;
import jakarta.xml.soap.SOAPBody;
import jakarta.xml.soap.SOAPBodyElement;
import jakarta.xml.soap.SOAPConnection;
import jakarta.xml.soap.SOAPConnectionFactory;
import jakarta.xml.soap.SOAPElement;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.soap.SOAPPart;

public class ForumClient {
	private static SOAPConnection conn;
	private static String ns = "http://nswi145/";
	private static String prefix = "nswi";
	private static String endpoint = "http://127.0.0.1:8000/Forum";

	public static void main(String[] args) throws Exception {
		connect();
	    int threadId = createThread("Offtopic");
	    writePost("How was everyone's weekend?", threadId);
	    close();
	}
	
	private static void connect() throws Exception {
		SOAPConnectionFactory soapcf = SOAPConnectionFactory.newInstance();
		conn = soapcf.createConnection();
	}
	
	private static void close() throws Exception {
		conn.close();
	}
	
	private static int createThread(String name) throws Exception {
		MessageFactory mf = MessageFactory.newInstance();
		SOAPMessage msg = mf.createMessage();
			
		SOAPPart soapp = msg.getSOAPPart();
		SOAPEnvelope envelope = soapp.getEnvelope();
		SOAPBody body = envelope.getBody();
		SOAPElement params = body.addBodyElement(new QName(ns, "CreateThread", prefix));

		params.addChildElement(
		    new QName(ns, "name", prefix)).addTextNode(name);
		params.addChildElement(
		    new QName(ns, "userId", prefix)).addTextNode("0");
		SOAPMessage response = conn.call(msg, endpoint);
		
		SOAPBody responseBody = response.getSOAPBody();
		if (responseBody.hasFault()) {
		    throw new Exception(responseBody.getFault().getFaultString()); 
		}

        return Integer.parseInt(
			((SOAPBodyElement)responseBody
				.getChildElements(new QName(ns, "CreateThreadResponse"))
	       		.next())
	       		.getChildElements(new QName("", "return"))
		       	.next()
		       	.getValue()
       );
	}

	private static int writePost(String content, int threadId) throws Exception {
		MessageFactory mf = MessageFactory.newInstance();
		SOAPMessage msg = mf.createMessage();
			
		SOAPPart soapp = msg.getSOAPPart();
		SOAPEnvelope envelope = soapp.getEnvelope();
		SOAPBody body = envelope.getBody();
		SOAPElement params = body.addBodyElement(new QName(ns, "WritePost", prefix));

		params.addChildElement(
		    new QName(ns, "post", prefix)).addTextNode(content);
		params.addChildElement(
		    new QName(ns, "userId", prefix)).addTextNode("0");
		params.addChildElement(
			    new QName(ns, "threadId", prefix)).addTextNode(threadId + "");
		SOAPMessage response = conn.call(msg, endpoint);
		
		SOAPBody responseBody = response.getSOAPBody();
		if (responseBody.hasFault()) {
		    throw new Exception(responseBody.getFault().getFaultString()); 
		}


        return Integer.parseInt(
			((SOAPBodyElement)responseBody
				.getChildElements(new QName(ns, "WritePostResponse"))
	       		.next())
	       		.getChildElements(new QName("", "return"))
		       	.next()
		       	.getValue()
       );
	}

}
