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
 * $Id$
 */

package com.sun.ts.tests.ejb30.common.ejblink;

import com.sun.ts.tests.ejb30.common.helper.TestFailedException;

public interface CommonIF {
  public void remove(); // for sfsb only

  public void call() throws TestFailedException;

  public void callOne() throws TestFailedException;

  public void callTwo() throws TestFailedException;

  public void callThree() throws TestFailedException;

  public void callOneLocal() throws TestFailedException;

  public void localCall(int[] f) throws TestFailedException;
}
