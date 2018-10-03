/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Client script details for file / folder restore.
 */
public class ClientScriptForConnect {
    /**
     * File content of the client script for file / folder restore.
     */
    @JsonProperty(value = "scriptContent")
    private String scriptContent;

    /**
     * File extension of the client script for file / folder restore - .ps1 ,
     * .sh , etc.
     */
    @JsonProperty(value = "scriptExtension")
    private String scriptExtension;

    /**
     * OS type - Windows, Linux etc. for which this file / folder restore
     * client script works.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /**
     * URL of Executable from where to source the content. If this is not null
     * then ScriptContent should not be used.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Mandator suffix that should be added to the name of script that is given
     * for download to user.
     * If its null or empty then , ignore it.
     */
    @JsonProperty(value = "scriptNameSuffix")
    private String scriptNameSuffix;

    /**
     * Get file content of the client script for file / folder restore.
     *
     * @return the scriptContent value
     */
    public String scriptContent() {
        return this.scriptContent;
    }

    /**
     * Set file content of the client script for file / folder restore.
     *
     * @param scriptContent the scriptContent value to set
     * @return the ClientScriptForConnect object itself.
     */
    public ClientScriptForConnect withScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }

    /**
     * Get file extension of the client script for file / folder restore - .ps1 , .sh , etc.
     *
     * @return the scriptExtension value
     */
    public String scriptExtension() {
        return this.scriptExtension;
    }

    /**
     * Set file extension of the client script for file / folder restore - .ps1 , .sh , etc.
     *
     * @param scriptExtension the scriptExtension value to set
     * @return the ClientScriptForConnect object itself.
     */
    public ClientScriptForConnect withScriptExtension(String scriptExtension) {
        this.scriptExtension = scriptExtension;
        return this;
    }

    /**
     * Get oS type - Windows, Linux etc. for which this file / folder restore client script works.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set oS type - Windows, Linux etc. for which this file / folder restore client script works.
     *
     * @param osType the osType value to set
     * @return the ClientScriptForConnect object itself.
     */
    public ClientScriptForConnect withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get uRL of Executable from where to source the content. If this is not null then ScriptContent should not be used.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set uRL of Executable from where to source the content. If this is not null then ScriptContent should not be used.
     *
     * @param url the url value to set
     * @return the ClientScriptForConnect object itself.
     */
    public ClientScriptForConnect withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get mandator suffix that should be added to the name of script that is given for download to user.
                 If its null or empty then , ignore it.
     *
     * @return the scriptNameSuffix value
     */
    public String scriptNameSuffix() {
        return this.scriptNameSuffix;
    }

    /**
     * Set mandator suffix that should be added to the name of script that is given for download to user.
                 If its null or empty then , ignore it.
     *
     * @param scriptNameSuffix the scriptNameSuffix value to set
     * @return the ClientScriptForConnect object itself.
     */
    public ClientScriptForConnect withScriptNameSuffix(String scriptNameSuffix) {
        this.scriptNameSuffix = scriptNameSuffix;
        return this;
    }

}
