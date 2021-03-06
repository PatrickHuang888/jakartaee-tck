/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2002 International Business Machines Corp. All rights reserved.
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

package com.sun.ts.tests.webservices.handler.uniqueness;

import java.rmi.RemoteException;
import javax.xml.rpc.handler.*;
import javax.xml.rpc.server.*;

public class HelloImpl implements Hello, ServiceLifecycle {
  private ServletEndpointContext ctx;

  private MessageContext context;

  public void init(Object c) {
    ctx = (ServletEndpointContext) c;
  }

  public void destroy() {
  }

  public String hello() throws RemoteException {
    if (ctx == null)
      return "***Null ServletEndpointContext obj!";
    context = ctx.getMessageContext();
    if (context == null)
      return "***Null MessageContext obj!";

    String s1 = (String) context.getProperty("ClientParam1");
    String s2 = (String) context.getProperty("ServerParam1");
    if (s1 == null || s1.equals(""))
      s1 = "***";
    if (s2 == null || s2.equals(""))
      s2 = "***";

    return s1 + s2;
  }
}
