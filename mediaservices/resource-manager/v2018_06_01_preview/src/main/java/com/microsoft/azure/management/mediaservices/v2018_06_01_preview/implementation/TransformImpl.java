/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.Transform;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.TransformOutput;

class TransformImpl extends CreatableUpdatableImpl<Transform, TransformInner, TransformImpl> implements Transform, Transform.Definition, Transform.Update {
    private final MediaManager manager;
    private String resourceGroupName;
    private String accountName;
    private String transformName;

    TransformImpl(String name, MediaManager manager) {
        super(name, new TransformInner());
        this.manager = manager;
        // Set resource name
        this.transformName = name;
        //
    }

    TransformImpl(TransformInner inner, MediaManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.transformName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "mediaServices");
        this.transformName = IdParsingUtils.getValueFromIdByName(inner.id(), "transforms");
        //
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Transform> createResourceAsync() {
        TransformsInner client = this.manager().inner().transforms();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName, this.transformName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Transform> updateResourceAsync() {
        TransformsInner client = this.manager().inner().transforms();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.transformName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<TransformInner> getInnerAsync() {
        TransformsInner client = this.manager().inner().transforms();
        return client.getAsync(this.resourceGroupName, this.accountName, this.transformName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime created() {
        return this.inner().created();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime lastModified() {
        return this.inner().lastModified();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<TransformOutput> outputs() {
        return this.inner().outputs();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public TransformImpl withExistingMediaservice(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public TransformImpl withOutputs(List<TransformOutput> outputs) {
        this.inner().withOutputs(outputs);
        return this;
    }

    @Override
    public TransformImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

}
