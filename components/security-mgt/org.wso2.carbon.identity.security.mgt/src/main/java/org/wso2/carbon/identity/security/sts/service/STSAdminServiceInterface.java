/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.security.sts.service;

import org.wso2.carbon.identity.security.SecurityConfigException;
import org.wso2.carbon.identity.security.sts.service.util.TrustedServiceData;

public interface STSAdminServiceInterface {

    /**
     * Add a the given service end-point as a trusted end-point address
     *
     * @param serviceAddress Address of the service end-point
     * @param certAlias      Alias of the service certificate
     * @throws SecurityConfigException
     */
    public void addTrustedService(String serviceAddress, String certAlias)
            throws SecurityConfigException;

    /**
     * @return
     * @throws SecurityConfigException
     */
    public TrustedServiceData[] getTrustedServices() throws SecurityConfigException;

    /**
     * @return
     * @throws SecurityConfigException
     */
    public String getProofKeyType() throws SecurityConfigException;

    /**
     * @param keyType
     * @throws SecurityConfigException
     */
    public void setProofKeyType(String keyType) throws SecurityConfigException;

    /**
     * @return
     * @throws SecurityConfigException
     */
    public String[] getCertAliasOfPrimaryKeyStore() throws SecurityConfigException;

}
