// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ConnectableResource;

public final class ConnectableResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectableResource model =
            BinaryData
                .fromString(
                    "{\"id\":\"lsismjqfrd\",\"inboundConnectedResources\":[{\"connectedResourceId\":\"quhiosrsjuivf\",\"tcpPorts\":\"is\",\"udpPorts\":\"rnxzh\"}],\"outboundConnectedResources\":[{\"connectedResourceId\":\"rxzbujr\",\"tcpPorts\":\"hqvwrevkhgnlnzon\",\"udpPorts\":\"rpiqywncv\"},{\"connectedResourceId\":\"szcofizeht\",\"tcpPorts\":\"gbjkvreljeamur\",\"udpPorts\":\"mlovuanashcxl\"},{\"connectedResourceId\":\"jerbdkelvidizozs\",\"tcpPorts\":\"ccxjm\",\"udpPorts\":\"fdgnwncypuuwwlt\"},{\"connectedResourceId\":\"qjctzenkeif\",\"tcpPorts\":\"hmkdasvfl\",\"udpPorts\":\"bxcudchx\"}]}")
                .toObject(ConnectableResource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectableResource model = new ConnectableResource();
        model = BinaryData.fromObject(model).toObject(ConnectableResource.class);
    }
}
