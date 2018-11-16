/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import java.util.List;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.CommandPropertiesInner;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for all types of DMS task properties. If task is not supported by
 * current client, this object is returned.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("Unknown")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Migrate.Sync.Complete.Database", value = MigrateSyncCompleteCommandProperties.class),
    @JsonSubTypes.Type(name = "PostgreSqlConnectionInfo", value = PostgreSqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "MySqlConnectionInfo", value = MySqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "MongoDbConnectionInfo", value = MongoDbConnectionInfo.class),
    @JsonSubTypes.Type(name = "SqlConnectionInfo", value = SqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "GetTDECertificates.Sql", value = GetTdeCertificatesSqlTaskProperties.class),
    @JsonSubTypes.Type(name = "Validate.MongoDb", value = ValidateMongoDbTaskProperties.class),
    @JsonSubTypes.Type(name = "ValidateMigrationInput.SqlServer.AzureSqlDbMI", value = ValidateMigrationInputSqlServerSqlMITaskProperties.class),
    @JsonSubTypes.Type(name = "ValidateMigrationInput.SqlServer.SqlDb.Sync", value = ValidateMigrationInputSqlServerSqlDbSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.PostgreSql.AzureDbForPostgreSql.Sync", value = MigratePostgreSqlAzureDbForPostgreSqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.MySql.AzureDbForMySql.Sync", value = MigrateMySqlAzureDbForMySqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.SqlServer.AzureSqlDb.Sync", value = MigrateSqlServerSqlDbSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.SqlServer.SqlDb", value = MigrateSqlServerSqlDbTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.SqlServer.AzureSqlDbMI", value = MigrateSqlServerSqlMITaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.MongoDb", value = MigrateMongoDbTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.AzureDbForMySql", value = ConnectToTargetAzureDbForMySqlTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.AzureSqlDbMI", value = ConnectToTargetSqlMITaskProperties.class),
    @JsonSubTypes.Type(name = "GetUserTables.AzureSqlDb.Sync", value = GetUserTablesSqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "GetUserTables.Sql", value = GetUserTablesSqlTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.SqlDb.Sync", value = ConnectToTargetSqlSqlDbSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.SqlDb", value = ConnectToTargetSqlDbTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToSource.SqlServer.Sync", value = ConnectToSourceSqlServerSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToSource.SqlServer", value = ConnectToSourceSqlServerTaskProperties.class),
    @JsonSubTypes.Type(name = "Connect.MongoDb", value = ConnectToMongoDbTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToSource.MySql", value = ConnectToSourceMySqlTaskProperties.class),
    @JsonSubTypes.Type(name = "MigrateSchemaSqlServerSqlDb", value = MigrateSchemaSqlServerSqlDbTaskProperties.class),
    @JsonSubTypes.Type(name = "cancel", value = MongoDbCancelCommand.class),
    @JsonSubTypes.Type(name = "finish", value = MongoDbFinishCommand.class),
    @JsonSubTypes.Type(name = "restart", value = MongoDbRestartCommand.class)
})
public class ProjectTaskProperties {
    /**
     * Array of errors. This is ignored if submitted.
     */
    @JsonProperty(value = "errors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ODataError> errors;

    /**
     * The state of the task. This is ignored if submitted. Possible values
     * include: 'Unknown', 'Queued', 'Running', 'Canceled', 'Succeeded',
     * 'Failed', 'FailedInputValidation', 'Faulted'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private TaskState state;

    /**
     * Array of command properties.
     */
    @JsonProperty(value = "commands", access = JsonProperty.Access.WRITE_ONLY)
    private List<CommandPropertiesInner> commands;

    /**
     * Key value pairs of client data to attach meta data information to task.
     */
    @JsonProperty(value = "clientData")
    private Map<String, String> clientData;

    /**
     * Get array of errors. This is ignored if submitted.
     *
     * @return the errors value
     */
    public List<ODataError> errors() {
        return this.errors;
    }

    /**
     * Get the state of the task. This is ignored if submitted. Possible values include: 'Unknown', 'Queued', 'Running', 'Canceled', 'Succeeded', 'Failed', 'FailedInputValidation', 'Faulted'.
     *
     * @return the state value
     */
    public TaskState state() {
        return this.state;
    }

    /**
     * Get array of command properties.
     *
     * @return the commands value
     */
    public List<CommandPropertiesInner> commands() {
        return this.commands;
    }

    /**
     * Get key value pairs of client data to attach meta data information to task.
     *
     * @return the clientData value
     */
    public Map<String, String> clientData() {
        return this.clientData;
    }

    /**
     * Set key value pairs of client data to attach meta data information to task.
     *
     * @param clientData the clientData value to set
     * @return the ProjectTaskProperties object itself.
     */
    public ProjectTaskProperties withClientData(Map<String, String> clientData) {
        this.clientData = clientData;
        return this;
    }

}
