/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.openejb.test.entity.cmr.onetoone;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
import javax.ejb.FinderException;

/**
 * @version $Revision: 1608563 $ $Date: 2014-07-07 21:07:41 +0200 (Mon, 07 Jul 2014) $
 */
public interface LicenseLocalHome extends EJBLocalHome {

    // Create
    public LicenseLocal create(Integer field1) throws CreateException;

    public LicenseLocal create(LicensePk primaryKey) throws CreateException;

    // Finder
    public LicenseLocal findByPrimaryKey(Integer primaryKey) throws FinderException;

    public LicenseLocal findByPrimaryKey(LicensePk primaryKey) throws FinderException;
}