/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.caelum.vraptor.blank;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import javax.servlet.http.HttpSession;

import java.net.InetAddress;

@Resource
public class IndexController {

	private final Result result;
  private HttpSession session;

  public IndexController(Result result, HttpSession session) {
    this.result = result;
    this.session = session;
  }

	@Path("/")
	public void index() {
    String host;
    try {
      host = InetAddress.getLocalHost().toString();
    } catch (Exception e) {
      host = "Could not get host/ip!. Check logs!";
      e.printStackTrace();
    }
    result.include("host", host);

    Integer counter = (Integer) session.getAttribute("counter");
    if (counter == null)
      counter = 0;
    else
      counter += 1;
    session.setAttribute("counter", counter);
    result.include("counter", counter);
	}
}
