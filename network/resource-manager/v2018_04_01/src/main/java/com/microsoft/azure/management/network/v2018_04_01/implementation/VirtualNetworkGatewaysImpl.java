/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2018_04_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2018_04_01.VirtualNetworkGateways;
import com.microsoft.azure.management.network.v2018_04_01.VirtualNetworkGateway;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2018_04_01.BgpPeerStatusListResult;
import com.microsoft.azure.management.network.v2018_04_01.GatewayRouteListResult;
import com.microsoft.azure.management.network.v2018_04_01.VpnClientIPsecParameters;
import com.microsoft.azure.management.network.v2018_04_01.VpnClientParameters;
import com.microsoft.azure.management.network.v2018_04_01.VirtualNetworkGatewayConnectionListEntity;
import com.microsoft.azure.management.network.v2018_04_01.VpnDeviceScriptParameters;

class VirtualNetworkGatewaysImpl extends GroupableResourcesCoreImpl<VirtualNetworkGateway, VirtualNetworkGatewayImpl, VirtualNetworkGatewayInner, VirtualNetworkGatewaysInner, NetworkManager>  implements VirtualNetworkGateways {
    protected VirtualNetworkGatewaysImpl(NetworkManager manager) {
        super(manager.inner().virtualNetworkGateways(), manager);
    }

    @Override
    protected Observable<VirtualNetworkGatewayInner> getInnerAsync(String resourceGroupName, String name) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<VirtualNetworkGateway> listByResourceGroup(String resourceGroupName) {
        VirtualNetworkGatewaysInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<VirtualNetworkGateway> listByResourceGroupAsync(String resourceGroupName) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<VirtualNetworkGatewayInner>, Iterable<VirtualNetworkGatewayInner>>() {
            @Override
            public Iterable<VirtualNetworkGatewayInner> call(Page<VirtualNetworkGatewayInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkGatewayInner, VirtualNetworkGateway>() {
            @Override
            public VirtualNetworkGateway call(VirtualNetworkGatewayInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public VirtualNetworkGatewayImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<VirtualNetworkGateway> resetAsync(String resourceGroupName, String virtualNetworkGatewayName) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.resetAsync(resourceGroupName, virtualNetworkGatewayName)
        .map(new Func1<VirtualNetworkGatewayInner, VirtualNetworkGateway>() {
            @Override
            public VirtualNetworkGateway call(VirtualNetworkGatewayInner inner) {
                return new VirtualNetworkGatewayImpl(inner.name(), inner, manager());
            }
        });
    }

    @Override
    public Observable<String> generatevpnclientpackageAsync(String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.generatevpnclientpackageAsync(resourceGroupName, virtualNetworkGatewayName, parameters)
    ;}

    @Override
    public Observable<String> generateVpnProfileAsync(String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.generateVpnProfileAsync(resourceGroupName, virtualNetworkGatewayName, parameters)
    ;}

    @Override
    public Observable<String> getVpnProfilePackageUrlAsync(String resourceGroupName, String virtualNetworkGatewayName) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.getVpnProfilePackageUrlAsync(resourceGroupName, virtualNetworkGatewayName)
    ;}

    @Override
    public Observable<BgpPeerStatusListResult> getBgpPeerStatusAsync(String resourceGroupName, String virtualNetworkGatewayName) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.getBgpPeerStatusAsync(resourceGroupName, virtualNetworkGatewayName)
        .map(new Func1<BgpPeerStatusListResultInner, BgpPeerStatusListResult>() {
            @Override
            public BgpPeerStatusListResult call(BgpPeerStatusListResultInner inner) {
                return new BgpPeerStatusListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<String> supportedVpnDevicesAsync(String resourceGroupName, String virtualNetworkGatewayName) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.supportedVpnDevicesAsync(resourceGroupName, virtualNetworkGatewayName)
    ;}

    @Override
    public Observable<GatewayRouteListResult> getLearnedRoutesAsync(String resourceGroupName, String virtualNetworkGatewayName) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.getLearnedRoutesAsync(resourceGroupName, virtualNetworkGatewayName)
        .map(new Func1<GatewayRouteListResultInner, GatewayRouteListResult>() {
            @Override
            public GatewayRouteListResult call(GatewayRouteListResultInner inner) {
                return new GatewayRouteListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<GatewayRouteListResult> getAdvertisedRoutesAsync(String resourceGroupName, String virtualNetworkGatewayName, String peer) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.getAdvertisedRoutesAsync(resourceGroupName, virtualNetworkGatewayName, peer)
        .map(new Func1<GatewayRouteListResultInner, GatewayRouteListResult>() {
            @Override
            public GatewayRouteListResult call(GatewayRouteListResultInner inner) {
                return new GatewayRouteListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<VpnClientIPsecParameters> setVpnclientIpsecParametersAsync(String resourceGroupName, String virtualNetworkGatewayName, VpnClientIPsecParametersInner vpnclientIpsecParams) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.setVpnclientIpsecParametersAsync(resourceGroupName, virtualNetworkGatewayName, vpnclientIpsecParams)
        .map(new Func1<VpnClientIPsecParametersInner, VpnClientIPsecParameters>() {
            @Override
            public VpnClientIPsecParameters call(VpnClientIPsecParametersInner inner) {
                return new VpnClientIPsecParametersImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<VpnClientIPsecParameters> getVpnclientIpsecParametersAsync(String resourceGroupName, String virtualNetworkGatewayName) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.getVpnclientIpsecParametersAsync(resourceGroupName, virtualNetworkGatewayName)
        .map(new Func1<VpnClientIPsecParametersInner, VpnClientIPsecParameters>() {
            @Override
            public VpnClientIPsecParameters call(VpnClientIPsecParametersInner inner) {
                return new VpnClientIPsecParametersImpl(inner, manager());
            }
        });
    }

    @Override
    protected VirtualNetworkGatewayImpl wrapModel(VirtualNetworkGatewayInner inner) {
        return  new VirtualNetworkGatewayImpl(inner.name(), inner, manager());
    }

    @Override
    protected VirtualNetworkGatewayImpl wrapModel(String name) {
        return new VirtualNetworkGatewayImpl(name, new VirtualNetworkGatewayInner(), this.manager());
    }

    private VirtualNetworkGatewayConnectionListEntityImpl wrapVirtualNetworkGatewayConnectionListEntityModel(VirtualNetworkGatewayConnectionListEntityInner inner) {
        return  new VirtualNetworkGatewayConnectionListEntityImpl(inner, manager());
    }

    @Override
    public Observable<VirtualNetworkGatewayConnectionListEntity> listConnectionsAsync(final String resourceGroupName, final String virtualNetworkGatewayName) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.listConnectionsAsync(resourceGroupName, virtualNetworkGatewayName)
        .flatMapIterable(new Func1<Page<VirtualNetworkGatewayConnectionListEntityInner>, Iterable<VirtualNetworkGatewayConnectionListEntityInner>>() {
            @Override
            public Iterable<VirtualNetworkGatewayConnectionListEntityInner> call(Page<VirtualNetworkGatewayConnectionListEntityInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkGatewayConnectionListEntityInner, VirtualNetworkGatewayConnectionListEntity>() {
            @Override
            public VirtualNetworkGatewayConnectionListEntity call(VirtualNetworkGatewayConnectionListEntityInner inner) {
                return wrapVirtualNetworkGatewayConnectionListEntityModel(inner);
            }
        });
    }

    @Override
    public Observable<String> vpnDeviceConfigurationScriptAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, VpnDeviceScriptParameters parameters) {
        VirtualNetworkGatewaysInner client = this.inner();
        return client.vpnDeviceConfigurationScriptAsync(resourceGroupName, virtualNetworkGatewayConnectionName, parameters)
    ;}

}
