// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.Backend;
import com.azure.resourcemanager.frontdoor.models.BackendEnabledState;
import org.junit.jupiter.api.Assertions;

public final class BackendTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Backend model =
            BinaryData
                .fromString(
                    "{\"address\":\"tujitcjedft\",\"privateLinkAlias\":\"ae\",\"privateLinkResourceId\":\"ojvdcpzfoqo\",\"privateLinkLocation\":\"cybxa\",\"privateEndpointStatus\":\"Approved\",\"privateLinkApprovalMessage\":\"zuf\",\"httpPort\":122630062,\"httpsPort\":95404001,\"enabledState\":\"Enabled\",\"priority\":1015925448,\"weight\":1109207713,\"backendHostHeader\":\"ciodhkhaz\"}")
                .toObject(Backend.class);
        Assertions.assertEquals("tujitcjedft", model.address());
        Assertions.assertEquals("ae", model.privateLinkAlias());
        Assertions.assertEquals("ojvdcpzfoqo", model.privateLinkResourceId());
        Assertions.assertEquals("cybxa", model.privateLinkLocation());
        Assertions.assertEquals("zuf", model.privateLinkApprovalMessage());
        Assertions.assertEquals(122630062, model.httpPort());
        Assertions.assertEquals(95404001, model.httpsPort());
        Assertions.assertEquals(BackendEnabledState.ENABLED, model.enabledState());
        Assertions.assertEquals(1015925448, model.priority());
        Assertions.assertEquals(1109207713, model.weight());
        Assertions.assertEquals("ciodhkhaz", model.backendHostHeader());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Backend model =
            new Backend()
                .withAddress("tujitcjedft")
                .withPrivateLinkAlias("ae")
                .withPrivateLinkResourceId("ojvdcpzfoqo")
                .withPrivateLinkLocation("cybxa")
                .withPrivateLinkApprovalMessage("zuf")
                .withHttpPort(122630062)
                .withHttpsPort(95404001)
                .withEnabledState(BackendEnabledState.ENABLED)
                .withPriority(1015925448)
                .withWeight(1109207713)
                .withBackendHostHeader("ciodhkhaz");
        model = BinaryData.fromObject(model).toObject(Backend.class);
        Assertions.assertEquals("tujitcjedft", model.address());
        Assertions.assertEquals("ae", model.privateLinkAlias());
        Assertions.assertEquals("ojvdcpzfoqo", model.privateLinkResourceId());
        Assertions.assertEquals("cybxa", model.privateLinkLocation());
        Assertions.assertEquals("zuf", model.privateLinkApprovalMessage());
        Assertions.assertEquals(122630062, model.httpPort());
        Assertions.assertEquals(95404001, model.httpsPort());
        Assertions.assertEquals(BackendEnabledState.ENABLED, model.enabledState());
        Assertions.assertEquals(1015925448, model.priority());
        Assertions.assertEquals(1109207713, model.weight());
        Assertions.assertEquals("ciodhkhaz", model.backendHostHeader());
    }
}
