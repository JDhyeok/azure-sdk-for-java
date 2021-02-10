/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.AppServiceManager;
import java.util.List;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.StaticSiteARMResourceInner;

/**
 * Type representing StaticSiteARMResource.
 */
public interface StaticSiteARMResource extends HasInner<StaticSiteARMResourceInner>, Resource, GroupableResourceCore<AppServiceManager, StaticSiteARMResourceInner>, HasResourceGroup, Refreshable<StaticSiteARMResource>, Updatable<StaticSiteARMResource.Update>, HasManager<AppServiceManager> {
    /**
     * @return the branch value.
     */
    String branch();

    /**
     * @return the buildProperties value.
     */
    StaticSiteBuildProperties buildProperties();

    /**
     * @return the customDomains value.
     */
    List<String> customDomains();

    /**
     * @return the defaultHostname value.
     */
    String defaultHostname();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the repositoryToken value.
     */
    String repositoryToken();

    /**
     * @return the repositoryUrl value.
     */
    String repositoryUrl();

    /**
     * @return the sku value.
     */
    SkuDescription sku();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * The entirety of the StaticSiteARMResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StaticSiteARMResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StaticSiteARMResource definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the StaticSiteARMResource definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the staticsitearmresource definition allowing to specify Branch.
         */
        interface WithBranch {
            /**
             * Specifies branch.
             * @param branch The target branch in the repository
             * @return the next definition stage
             */
            WithCreate withBranch(String branch);
        }

        /**
         * The stage of the staticsitearmresource definition allowing to specify BuildProperties.
         */
        interface WithBuildProperties {
            /**
             * Specifies buildProperties.
             * @param buildProperties Build properties to configure on the repository
             * @return the next definition stage
             */
            WithCreate withBuildProperties(StaticSiteBuildProperties buildProperties);
        }

        /**
         * The stage of the staticsitearmresource definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next definition stage
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the staticsitearmresource definition allowing to specify RepositoryToken.
         */
        interface WithRepositoryToken {
            /**
             * Specifies repositoryToken.
             * @param repositoryToken A user's github repository token. This is used to setup the Github Actions workflow file and API secrets
             * @return the next definition stage
             */
            WithCreate withRepositoryToken(String repositoryToken);
        }

        /**
         * The stage of the staticsitearmresource definition allowing to specify RepositoryUrl.
         */
        interface WithRepositoryUrl {
            /**
             * Specifies repositoryUrl.
             * @param repositoryUrl URL for the repository of the static site
             * @return the next definition stage
             */
            WithCreate withRepositoryUrl(String repositoryUrl);
        }

        /**
         * The stage of the staticsitearmresource definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku the sku parameter value
             * @return the next definition stage
             */
            WithCreate withSku(SkuDescription sku);
        }

        /**
         * The stage of the staticsitearmresource definition allowing to specify SystemData.
         */
        interface WithSystemData {
            /**
             * Specifies systemData.
             * @param systemData The system metadata relating to this resource
             * @return the next definition stage
             */
            WithCreate withSystemData(SystemData systemData);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StaticSiteARMResource>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithBranch, DefinitionStages.WithBuildProperties, DefinitionStages.WithKind, DefinitionStages.WithRepositoryToken, DefinitionStages.WithRepositoryUrl, DefinitionStages.WithSku, DefinitionStages.WithSystemData {
        }
    }
    /**
     * The template for a StaticSiteARMResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StaticSiteARMResource>, Resource.UpdateWithTags<Update>, UpdateStages.WithBranch, UpdateStages.WithBuildProperties, UpdateStages.WithKind, UpdateStages.WithRepositoryToken, UpdateStages.WithRepositoryUrl, UpdateStages.WithSystemData {
    }

    /**
     * Grouping of StaticSiteARMResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the staticsitearmresource update allowing to specify Branch.
         */
        interface WithBranch {
            /**
             * Specifies branch.
             * @param branch The target branch in the repository
             * @return the next update stage
             */
            Update withBranch(String branch);
        }

        /**
         * The stage of the staticsitearmresource update allowing to specify BuildProperties.
         */
        interface WithBuildProperties {
            /**
             * Specifies buildProperties.
             * @param buildProperties Build properties to configure on the repository
             * @return the next update stage
             */
            Update withBuildProperties(StaticSiteBuildProperties buildProperties);
        }

        /**
         * The stage of the staticsitearmresource update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next update stage
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the staticsitearmresource update allowing to specify RepositoryToken.
         */
        interface WithRepositoryToken {
            /**
             * Specifies repositoryToken.
             * @param repositoryToken A user's github repository token. This is used to setup the Github Actions workflow file and API secrets
             * @return the next update stage
             */
            Update withRepositoryToken(String repositoryToken);
        }

        /**
         * The stage of the staticsitearmresource update allowing to specify RepositoryUrl.
         */
        interface WithRepositoryUrl {
            /**
             * Specifies repositoryUrl.
             * @param repositoryUrl URL for the repository of the static site
             * @return the next update stage
             */
            Update withRepositoryUrl(String repositoryUrl);
        }

        /**
         * The stage of the staticsitearmresource update allowing to specify SystemData.
         */
        interface WithSystemData {
            /**
             * Specifies systemData.
             * @param systemData The system metadata relating to this resource
             * @return the next update stage
             */
            Update withSystemData(SystemData systemData);
        }

    }
}