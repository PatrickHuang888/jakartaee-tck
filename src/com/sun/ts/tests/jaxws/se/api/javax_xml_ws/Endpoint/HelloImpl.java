/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

/*
 * $Id: HelloImpl.java 51058 2006-02-11 20:00:31Z adf $
 */

package com.sun.ts.tests.jaxws.se.api.javax_xml_ws.Endpoint;

import javax.jws.WebService;

@WebService(name = "Hello", portName = "HelloPort", serviceName = "HelloService", targetNamespace = "http://helloservice.org/wsdl")
public class HelloImpl {
  public String hello(String who) {
    return "Hello, " + who;
  }
}
