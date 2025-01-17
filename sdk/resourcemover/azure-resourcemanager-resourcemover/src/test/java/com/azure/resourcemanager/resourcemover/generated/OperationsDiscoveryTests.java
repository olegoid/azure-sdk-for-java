// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.Display;
import com.azure.resourcemanager.resourcemover.models.OperationsDiscovery;
import org.junit.jupiter.api.Assertions;

public final class OperationsDiscoveryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationsDiscovery model =
            BinaryData
                .fromString(
                    "{\"name\":\"pusuesn\",\"isDataAction\":false,\"display\":{\"provider\":\"bavo\",\"resource\":\"zdmohctbqvu\",\"operation\":\"xdn\",\"description\":\"vo\"},\"origin\":\"ujjugwdkcglh\",\"properties\":\"dataazjdyggd\"}")
                .toObject(OperationsDiscovery.class);
        Assertions.assertEquals("pusuesn", model.name());
        Assertions.assertEquals(false, model.isDataAction());
        Assertions.assertEquals("bavo", model.display().provider());
        Assertions.assertEquals("zdmohctbqvu", model.display().resource());
        Assertions.assertEquals("xdn", model.display().operation());
        Assertions.assertEquals("vo", model.display().description());
        Assertions.assertEquals("ujjugwdkcglh", model.origin());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationsDiscovery model =
            new OperationsDiscovery()
                .withName("pusuesn")
                .withIsDataAction(false)
                .withDisplay(
                    new Display()
                        .withProvider("bavo")
                        .withResource("zdmohctbqvu")
                        .withOperation("xdn")
                        .withDescription("vo"))
                .withOrigin("ujjugwdkcglh")
                .withProperties("dataazjdyggd");
        model = BinaryData.fromObject(model).toObject(OperationsDiscovery.class);
        Assertions.assertEquals("pusuesn", model.name());
        Assertions.assertEquals(false, model.isDataAction());
        Assertions.assertEquals("bavo", model.display().provider());
        Assertions.assertEquals("zdmohctbqvu", model.display().resource());
        Assertions.assertEquals("xdn", model.display().operation());
        Assertions.assertEquals("vo", model.display().description());
        Assertions.assertEquals("ujjugwdkcglh", model.origin());
    }
}
