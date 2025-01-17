// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** QueueDescription for the new queue. */
@JacksonXmlRootElement(localName = "CreateQueueBodyContent", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class CreateQueueBodyContentImpl {

    /*
     * MIME type of content.
     */
    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    /*
     * Properties of the new queue.
     */
    @JacksonXmlProperty(
            localName = "QueueDescription",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private QueueDescriptionImpl queueDescription;

    /** Creates an instance of CreateQueueBodyContent class. */
    public CreateQueueBodyContentImpl() {}

    /**
     * Get the type property: MIME type of content.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: MIME type of content.
     *
     * @param type the type value to set.
     * @return the CreateQueueBodyContent object itself.
     */
    public CreateQueueBodyContentImpl setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the queueDescription property: Properties of the new queue.
     *
     * @return the queueDescription value.
     */
    public QueueDescriptionImpl getQueueDescription() {
        return this.queueDescription;
    }

    /**
     * Set the queueDescription property: Properties of the new queue.
     *
     * @param queueDescription the queueDescription value to set.
     * @return the CreateQueueBodyContent object itself.
     */
    public CreateQueueBodyContentImpl setQueueDescription(QueueDescriptionImpl queueDescription) {
        this.queueDescription = queueDescription;
        return this;
    }
}
