// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.IdentityProperties;
import com.azure.resourcemanager.databox.models.UserAssignedProperties;
import org.junit.jupiter.api.Assertions;

public final class IdentityPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IdentityProperties model =
            BinaryData
                .fromString("{\"type\":\"zrkgqhcjrefovg\",\"userAssigned\":{\"resourceId\":\"sle\"}}")
                .toObject(IdentityProperties.class);
        Assertions.assertEquals("zrkgqhcjrefovg", model.type());
        Assertions.assertEquals("sle", model.userAssigned().resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IdentityProperties model =
            new IdentityProperties()
                .withType("zrkgqhcjrefovg")
                .withUserAssigned(new UserAssignedProperties().withResourceId("sle"));
        model = BinaryData.fromObject(model).toObject(IdentityProperties.class);
        Assertions.assertEquals("zrkgqhcjrefovg", model.type());
        Assertions.assertEquals("sle", model.userAssigned().resourceId());
    }
}
