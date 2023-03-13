package nswi145intermediary;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.xml.soap.MessageFactory;
import jakarta.xml.soap.Node;
import jakarta.xml.soap.SOAPConnection;
import jakarta.xml.soap.SOAPConnectionFactory;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.soap.SOAPHeaderElement;
import jakarta.xml.soap.SOAPMessage;

import java.io.IOException;
import java.util.Iterator;

import javax.xml.namespace.QName;

/**
 * Servlet implementation class DifficultyIntermediary
 */
public class DifficultyIntermediary extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String ns = "http://nswi145intermediary/";
	private static String prefix = "inter";
	private static String endpoint = "http://127.0.0.1:8000/Forum";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DifficultyIntermediary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {			
			MessageFactory mf = MessageFactory.newInstance();
			SOAPMessage msg = mf.createMessage(null, request.getInputStream());
			
			boolean containsHeader = detachDifficultyHeader(msg);
			SOAPConnection conn = SOAPConnectionFactory.newInstance().createConnection();
			SOAPMessage soapResp = conn.call(msg, endpoint);
			
			if (containsHeader && !soapResp.getSOAPBody().hasFault()) {
				soapResp
					.getSOAPHeader()
					.addHeaderElement(new QName(ns, "mapDifficulty", prefix))
					.addTextNode(calculateMapDifficulty(msg) + "");
			}
			
			soapResp.writeTo(response.getOutputStream());
			
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
	
	private boolean detachDifficultyHeader(SOAPMessage msg) throws Exception {
		SOAPHeader header = msg.getSOAPHeader();
        Iterator<Node> diffHeader = header.getChildElements(new QName(ns, "mapDifficulty", prefix));
        if (diffHeader.hasNext()) {
            ((SOAPHeaderElement) diffHeader.next()).detachNode();
            return true;
        }
        return false;
	}
	
	private double calculateMapDifficulty(SOAPMessage msg) {
		return 4.3;
	}

}
