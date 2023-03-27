/*
 * Copyright 2001-2010 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.apache.juddi.example;

import javax.jws.WebService;

import org.apache.juddi.v3.annotations.UDDIService;
import org.apache.juddi.v3.annotations.UDDIServiceBinding;

/**
 * This example show you how to use UDDI Annotations to decorate a class.
 * When the Servlet Listener
 * 
 */

@UDDIService(
		businessKey="uddi:nswi145:6f619d74-87db-4453-88c8-b9b440752fe1",
		serviceKey="uddi:${keyDomain}:services-forumservice${department}", 
		description = "Forum service")
@UDDIServiceBinding(
		bindingKey="uddi:${keyDomain}:${serverName}-${serverPort}-forumservice${department}-wsdl",
	    description="WSDL endpoint for the forum${department} Service",
	    accessPointType="wsdlDeployment",
	    accessPoint="http://${serverName}:${serverPort}/uddi-annotations/services/forumservice?wsdl")
@WebService(
		endpointInterface = "org.apache.juddi.example.ForumService",
        serviceName = "ForumService")

public class ForumServiceImpl implements ForumService {
    
	private boolean ThreadExists(int id) {
		return true;
	}

	public int CreateThread(String name, int userId) {
		int threadId = 42;
		return threadId;
	}

	public int WritePost(String post, int threadId, int userId) throws Exception {
		if (!ThreadExists(threadId)) {
			throw new Exception("thread does not exist");
		}
		int postId = 123;
		return postId;
	}
	
}
