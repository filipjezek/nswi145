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

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ForumService {
	
	@WebMethod
	public int CreateThread(
			@WebParam(name="name") String name, 
			@WebParam(name="userId") int userId
		);
	
	@WebMethod
	public int WritePost(
			@WebParam(name="post") String post,
			@WebParam(name="threadId") int threadId,
			@WebParam(name="userId") int userId
		) throws Exception;
}

