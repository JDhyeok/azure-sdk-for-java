/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import java.util.List;
import com.microsoft.azure.management.compute.v2020_12_01.DiskSku;
import com.microsoft.azure.management.compute.v2020_12_01.ExtendedLocation;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2020_12_01.OperatingSystemTypes;
import com.microsoft.azure.management.compute.v2020_12_01.HyperVGeneration;
import com.microsoft.azure.management.compute.v2020_12_01.PurchasePlan;
import com.microsoft.azure.management.compute.v2020_12_01.CreationData;
import com.microsoft.azure.management.compute.v2020_12_01.EncryptionSettingsCollection;
import com.microsoft.azure.management.compute.v2020_12_01.DiskState;
import com.microsoft.azure.management.compute.v2020_12_01.Encryption;
import com.microsoft.azure.management.compute.v2020_12_01.ShareInfoElement;
import com.microsoft.azure.management.compute.v2020_12_01.NetworkAccessPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Disk resource.
 */
@JsonFlatten
public class DiskInner extends Resource {
    /**
     * A relative URI containing the ID of the VM that has the disk attached.
     */
    @JsonProperty(value = "managedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String managedBy;

    /**
     * List of relative URIs containing the IDs of the VMs that have the disk
     * attached. maxShares should be set to a value greater than one for disks
     * to allow attaching them to multiple VMs.
     */
    @JsonProperty(value = "managedByExtended", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> managedByExtended;

    /**
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private DiskSku sku;

    /**
     * The Logical zone list for Disk.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * The extended location where the disk will be created. Extended location
     * cannot be changed.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /**
     * The time when the disk was created.
     */
    @JsonProperty(value = "properties.timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timeCreated;

    /**
     * The Operating System type. Possible values include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "properties.osType")
    private OperatingSystemTypes osType;

    /**
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only. Possible values include: 'V1', 'V2'.
     */
    @JsonProperty(value = "properties.hyperVGeneration")
    private HyperVGeneration hyperVGeneration;

    /**
     * Purchase plan information for the the image from which the OS disk was
     * created. E.g. - {name: 2019-Datacenter, publisher:
     * MicrosoftWindowsServer, product: WindowsServer}.
     */
    @JsonProperty(value = "properties.purchasePlan")
    private PurchasePlan purchasePlan;

    /**
     * Disk source information. CreationData information cannot be changed
     * after the disk has been created.
     */
    @JsonProperty(value = "properties.creationData", required = true)
    private CreationData creationData;

    /**
     * If creationData.createOption is Empty, this field is mandatory and it
     * indicates the size of the disk to create. If this field is present for
     * updates or creation with other options, it indicates a resize. Resizes
     * are only allowed if the disk is not attached to a running VM, and can
     * only increase the disk's size.
     */
    @JsonProperty(value = "properties.diskSizeGB")
    private Integer diskSizeGB;

    /**
     * The size of the disk in bytes. This field is read only.
     */
    @JsonProperty(value = "properties.diskSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long diskSizeBytes;

    /**
     * Unique Guid identifying the resource.
     */
    @JsonProperty(value = "properties.uniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueId;

    /**
     * Encryption settings collection used for Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     */
    @JsonProperty(value = "properties.encryptionSettingsCollection")
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /**
     * The disk provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The number of IOPS allowed for this disk; only settable for UltraSSD
     * disks. One operation can transfer between 4k and 256k bytes.
     */
    @JsonProperty(value = "properties.diskIOPSReadWrite")
    private Long diskIOPSReadWrite;

    /**
     * The bandwidth allowed for this disk; only settable for UltraSSD disks.
     * MBps means millions of bytes per second - MB here uses the ISO notation,
     * of powers of 10.
     */
    @JsonProperty(value = "properties.diskMBpsReadWrite")
    private Long diskMBpsReadWrite;

    /**
     * The total number of IOPS that will be allowed across all VMs mounting
     * the shared disk as ReadOnly. One operation can transfer between 4k and
     * 256k bytes.
     */
    @JsonProperty(value = "properties.diskIOPSReadOnly")
    private Long diskIOPSReadOnly;

    /**
     * The total throughput (MBps) that will be allowed across all VMs mounting
     * the shared disk as ReadOnly. MBps means millions of bytes per second -
     * MB here uses the ISO notation, of powers of 10.
     */
    @JsonProperty(value = "properties.diskMBpsReadOnly")
    private Long diskMBpsReadOnly;

    /**
     * The state of the disk. Possible values include: 'Unattached',
     * 'Attached', 'Reserved', 'ActiveSAS', 'ReadyToUpload', 'ActiveUpload'.
     */
    @JsonProperty(value = "properties.diskState")
    private DiskState diskState;

    /**
     * Encryption property can be used to encrypt data at rest with customer
     * managed keys or platform managed keys.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /**
     * The maximum number of VMs that can attach to the disk at the same time.
     * Value greater than one indicates a disk that can be mounted on multiple
     * VMs at the same time.
     */
    @JsonProperty(value = "properties.maxShares")
    private Integer maxShares;

    /**
     * Details of the list of all VMs that have the disk attached. maxShares
     * should be set to a value greater than one for disks to allow attaching
     * them to multiple VMs.
     */
    @JsonProperty(value = "properties.shareInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<ShareInfoElement> shareInfo;

    /**
     * Possible values include: 'AllowAll', 'AllowPrivate', 'DenyAll'.
     */
    @JsonProperty(value = "properties.networkAccessPolicy")
    private NetworkAccessPolicy networkAccessPolicy;

    /**
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     */
    @JsonProperty(value = "properties.diskAccessId")
    private String diskAccessId;

    /**
     * Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does
     * not apply to Ultra disks.
     */
    @JsonProperty(value = "properties.tier")
    private String tier;

    /**
     * Set to true to enable bursting beyond the provisioned performance target
     * of the disk. Bursting is disabled by default. Does not apply to Ultra
     * disks.
     */
    @JsonProperty(value = "properties.burstingEnabled")
    private Boolean burstingEnabled;

    /**
     * Get a relative URI containing the ID of the VM that has the disk attached.
     *
     * @return the managedBy value
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Get list of relative URIs containing the IDs of the VMs that have the disk attached. maxShares should be set to a value greater than one for disks to allow attaching them to multiple VMs.
     *
     * @return the managedByExtended value
     */
    public List<String> managedByExtended() {
        return this.managedByExtended;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public DiskSku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withSku(DiskSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the Logical zone list for Disk.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the Logical zone list for Disk.
     *
     * @param zones the zones value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the extended location where the disk will be created. Extended location cannot be changed.
     *
     * @return the extendedLocation value
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extended location where the disk will be created. Extended location cannot be changed.
     *
     * @param extendedLocation the extendedLocation value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the time when the disk was created.
     *
     * @return the timeCreated value
     */
    public DateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get the Operating System type. Possible values include: 'Windows', 'Linux'.
     *
     * @return the osType value
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the Operating System type. Possible values include: 'Windows', 'Linux'.
     *
     * @param osType the osType value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the hypervisor generation of the Virtual Machine. Applicable to OS disks only. Possible values include: 'V1', 'V2'.
     *
     * @return the hyperVGeneration value
     */
    public HyperVGeneration hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hypervisor generation of the Virtual Machine. Applicable to OS disks only. Possible values include: 'V1', 'V2'.
     *
     * @param hyperVGeneration the hyperVGeneration value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get purchase plan information for the the image from which the OS disk was created. E.g. - {name: 2019-Datacenter, publisher: MicrosoftWindowsServer, product: WindowsServer}.
     *
     * @return the purchasePlan value
     */
    public PurchasePlan purchasePlan() {
        return this.purchasePlan;
    }

    /**
     * Set purchase plan information for the the image from which the OS disk was created. E.g. - {name: 2019-Datacenter, publisher: MicrosoftWindowsServer, product: WindowsServer}.
     *
     * @param purchasePlan the purchasePlan value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withPurchasePlan(PurchasePlan purchasePlan) {
        this.purchasePlan = purchasePlan;
        return this;
    }

    /**
     * Get disk source information. CreationData information cannot be changed after the disk has been created.
     *
     * @return the creationData value
     */
    public CreationData creationData() {
        return this.creationData;
    }

    /**
     * Set disk source information. CreationData information cannot be changed after the disk has been created.
     *
     * @param creationData the creationData value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withCreationData(CreationData creationData) {
        this.creationData = creationData;
        return this;
    }

    /**
     * Get if creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     *
     * @return the diskSizeGB value
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set if creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     *
     * @param diskSizeGB the diskSizeGB value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the size of the disk in bytes. This field is read only.
     *
     * @return the diskSizeBytes value
     */
    public Long diskSizeBytes() {
        return this.diskSizeBytes;
    }

    /**
     * Get unique Guid identifying the resource.
     *
     * @return the uniqueId value
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Get encryption settings collection used for Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }

    /**
     * Set encryption settings collection used for Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     *
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get the disk provisioning state.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the number of IOPS allowed for this disk; only settable for UltraSSD disks. One operation can transfer between 4k and 256k bytes.
     *
     * @return the diskIOPSReadWrite value
     */
    public Long diskIOPSReadWrite() {
        return this.diskIOPSReadWrite;
    }

    /**
     * Set the number of IOPS allowed for this disk; only settable for UltraSSD disks. One operation can transfer between 4k and 256k bytes.
     *
     * @param diskIOPSReadWrite the diskIOPSReadWrite value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskIOPSReadWrite(Long diskIOPSReadWrite) {
        this.diskIOPSReadWrite = diskIOPSReadWrite;
        return this;
    }

    /**
     * Get the bandwidth allowed for this disk; only settable for UltraSSD disks. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @return the diskMBpsReadWrite value
     */
    public Long diskMBpsReadWrite() {
        return this.diskMBpsReadWrite;
    }

    /**
     * Set the bandwidth allowed for this disk; only settable for UltraSSD disks. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @param diskMBpsReadWrite the diskMBpsReadWrite value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskMBpsReadWrite(Long diskMBpsReadWrite) {
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        return this;
    }

    /**
     * Get the total number of IOPS that will be allowed across all VMs mounting the shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     *
     * @return the diskIOPSReadOnly value
     */
    public Long diskIOPSReadOnly() {
        return this.diskIOPSReadOnly;
    }

    /**
     * Set the total number of IOPS that will be allowed across all VMs mounting the shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     *
     * @param diskIOPSReadOnly the diskIOPSReadOnly value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskIOPSReadOnly(Long diskIOPSReadOnly) {
        this.diskIOPSReadOnly = diskIOPSReadOnly;
        return this;
    }

    /**
     * Get the total throughput (MBps) that will be allowed across all VMs mounting the shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @return the diskMBpsReadOnly value
     */
    public Long diskMBpsReadOnly() {
        return this.diskMBpsReadOnly;
    }

    /**
     * Set the total throughput (MBps) that will be allowed across all VMs mounting the shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @param diskMBpsReadOnly the diskMBpsReadOnly value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskMBpsReadOnly(Long diskMBpsReadOnly) {
        this.diskMBpsReadOnly = diskMBpsReadOnly;
        return this;
    }

    /**
     * Get the state of the disk. Possible values include: 'Unattached', 'Attached', 'Reserved', 'ActiveSAS', 'ReadyToUpload', 'ActiveUpload'.
     *
     * @return the diskState value
     */
    public DiskState diskState() {
        return this.diskState;
    }

    /**
     * Set the state of the disk. Possible values include: 'Unattached', 'Attached', 'Reserved', 'ActiveSAS', 'ReadyToUpload', 'ActiveUpload'.
     *
     * @param diskState the diskState value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskState(DiskState diskState) {
        this.diskState = diskState;
        return this;
    }

    /**
     * Get encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     *
     * @return the encryption value
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     *
     * @param encryption the encryption value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the maximum number of VMs that can attach to the disk at the same time. Value greater than one indicates a disk that can be mounted on multiple VMs at the same time.
     *
     * @return the maxShares value
     */
    public Integer maxShares() {
        return this.maxShares;
    }

    /**
     * Set the maximum number of VMs that can attach to the disk at the same time. Value greater than one indicates a disk that can be mounted on multiple VMs at the same time.
     *
     * @param maxShares the maxShares value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withMaxShares(Integer maxShares) {
        this.maxShares = maxShares;
        return this;
    }

    /**
     * Get details of the list of all VMs that have the disk attached. maxShares should be set to a value greater than one for disks to allow attaching them to multiple VMs.
     *
     * @return the shareInfo value
     */
    public List<ShareInfoElement> shareInfo() {
        return this.shareInfo;
    }

    /**
     * Get possible values include: 'AllowAll', 'AllowPrivate', 'DenyAll'.
     *
     * @return the networkAccessPolicy value
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.networkAccessPolicy;
    }

    /**
     * Set possible values include: 'AllowAll', 'AllowPrivate', 'DenyAll'.
     *
     * @param networkAccessPolicy the networkAccessPolicy value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        this.networkAccessPolicy = networkAccessPolicy;
        return this;
    }

    /**
     * Get aRM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @return the diskAccessId value
     */
    public String diskAccessId() {
        return this.diskAccessId;
    }

    /**
     * Set aRM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @param diskAccessId the diskAccessId value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskAccessId(String diskAccessId) {
        this.diskAccessId = diskAccessId;
        return this;
    }

    /**
     * Get performance tier of the disk (e.g, P4, S10) as described here: https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set performance tier of the disk (e.g, P4, S10) as described here: https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     *
     * @param tier the tier value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get set to true to enable bursting beyond the provisioned performance target of the disk. Bursting is disabled by default. Does not apply to Ultra disks.
     *
     * @return the burstingEnabled value
     */
    public Boolean burstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * Set set to true to enable bursting beyond the provisioned performance target of the disk. Bursting is disabled by default. Does not apply to Ultra disks.
     *
     * @param burstingEnabled the burstingEnabled value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }

}