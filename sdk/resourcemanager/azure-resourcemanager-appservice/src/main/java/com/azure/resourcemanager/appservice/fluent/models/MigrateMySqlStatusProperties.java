// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.appservice.models.OperationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MigrateMySqlStatus resource specific properties. */
@Immutable
public final class MigrateMySqlStatusProperties {
    /*
     * Status of the migration task.
     */
    @JsonProperty(value = "migrationOperationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private OperationStatus migrationOperationStatus;

    /*
     * Operation ID for the migration task.
     */
    @JsonProperty(value = "operationId", access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /*
     * True if the web app has in app MySql enabled
     */
    @JsonProperty(value = "localMySqlEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean localMySqlEnabled;

    /** Creates an instance of MigrateMySqlStatusProperties class. */
    public MigrateMySqlStatusProperties() {
    }

    /**
     * Get the migrationOperationStatus property: Status of the migration task.
     *
     * @return the migrationOperationStatus value.
     */
    public OperationStatus migrationOperationStatus() {
        return this.migrationOperationStatus;
    }

    /**
     * Get the operationId property: Operation ID for the migration task.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Get the localMySqlEnabled property: True if the web app has in app MySql enabled.
     *
     * @return the localMySqlEnabled value.
     */
    public Boolean localMySqlEnabled() {
        return this.localMySqlEnabled;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
