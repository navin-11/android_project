package com.abyantra.product.trip_2.Model.dao.Pojo;

import java.math.BigDecimal;
import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Task {

    @Id
    public Integer taskId;
    public Integer companyId;
    public Integer categoriesId;
    public String taskDescription;
    public Integer initiatorByUserId;
    public Integer ownerByUserId;
    public Integer supporter1UserId;
    public Integer supporter2UserId;
    public Integer supporter1Status;
    public Integer supporter2Status;
    public Date plannedStartDate;
    public Date plannedEndDate;
    public Date actualStartDate;
    public Date actualEndDate;
    public Long plannedStartDateMs;
    public Long plannedEndDateMs;
    public Long actualStartDateMs;
    public Long actualEndDateMs;
    public String taskLocation;
    public BigDecimal taskLocationLatitude;
    public BigDecimal taskLocationLongitude;
    public BigDecimal startLocationLatitude;
    public BigDecimal startLocationLongitude;
    public Integer taskStatus;
    public Double rewardPoints;
    public String deleteFlag;
    public Integer lastRemarkId ;
    public Integer createdByUserId;
    public Integer updatedByUserId;
    public Date createdTimestamp;
    public Date updatedTimestamp;
    public String taskName;
    public BigDecimal distance;
    public BigDecimal endLocationLatitude;
    public BigDecimal endLocationLongitude;
    public BigDecimal endLocationDistance;
    public String clientMobileNumber;
    public String countryCode;
    public String isItemsRequired;
    public String disableAcceptS1;
    public String disableAcceptS2;
    public String floorNumber;
    public String apartmentNumber;
    public String buildingName;
    public String blockName;
    public String additionalLocationDetail;
    public String customerName;
    public String taskType;
    public Integer customerProductId;
    public Integer customerId;
    public Integer addressId;
    private Integer inventoryLocationId;
    private String materialIssued;
    private String materialReturn;
    private String parameterDeviation;
    private String materialReturnPending;
    private String problemObserved;
    private String actionTaken;
    private String engineApplication;
    private String additionalInformation;
    private String customerRemarks;
    private String serviceEngineerRecommendation;
    private String presentConditionMachine;
    private Integer organisationId;
    private Integer customerPhoto;
    private String taskContactPersonName;
    private String taskContactPersonNumber;
    private Integer preEnginePhoto;
    private Integer postEnginePhoto;
    private Integer productId;
    private Integer modelId;
    private String hmr;
    private Date machineInspectDate;
    private Date machineRecommissionedDate;
    private String hasCustomerAgreed;
    private String typeOfVisit;
    private String ratings;
    private String oldMaterialReturnFlag;
    private Integer customerSignature;
    private Integer technicianSignature;
    public String serviceProvider;
    public String subContractor;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(Integer categoriesId) {
        this.categoriesId = categoriesId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Integer getInitiatorByUserId() {
        return initiatorByUserId;
    }

    public void setInitiatorByUserId(Integer initiatorByUserId) {
        this.initiatorByUserId = initiatorByUserId;
    }

    public Integer getOwnerByUserId() {
        return ownerByUserId;
    }

    public void setOwnerByUserId(Integer ownerByUserId) {
        this.ownerByUserId = ownerByUserId;
    }

    public Integer getSupporter1UserId() {
        return supporter1UserId;
    }

    public void setSupporter1UserId(Integer supporter1UserId) {
        this.supporter1UserId = supporter1UserId;
    }

    public Integer getSupporter2UserId() {
        return supporter2UserId;
    }

    public void setSupporter2UserId(Integer supporter2UserId) {
        this.supporter2UserId = supporter2UserId;
    }

    public Integer getSupporter1Status() {
        return supporter1Status;
    }

    public void setSupporter1Status(Integer supporter1Status) {
        this.supporter1Status = supporter1Status;
    }

    public Integer getSupporter2Status() {
        return supporter2Status;
    }

    public void setSupporter2Status(Integer supporter2Status) {
        this.supporter2Status = supporter2Status;
    }

    public Date getPlannedStartDate() {
        return plannedStartDate;
    }

    public void setPlannedStartDate(Date plannedStartDate) {
        this.plannedStartDate = plannedStartDate;
    }

    public Date getPlannedEndDate() {
        return plannedEndDate;
    }

    public void setPlannedEndDate(Date plannedEndDate) {
        this.plannedEndDate = plannedEndDate;
    }

    public Date getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Date actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public Date getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(Date actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    public Long getPlannedStartDateMs() {
        return plannedStartDateMs;
    }

    public void setPlannedStartDateMs(Long plannedStartDateMs) {
        this.plannedStartDateMs = plannedStartDateMs;
    }

    public Long getPlannedEndDateMs() {
        return plannedEndDateMs;
    }

    public void setPlannedEndDateMs(Long plannedEndDateMs) {
        this.plannedEndDateMs = plannedEndDateMs;
    }

    public Long getActualStartDateMs() {
        return actualStartDateMs;
    }

    public void setActualStartDateMs(Long actualStartDateMs) {
        this.actualStartDateMs = actualStartDateMs;
    }

    public Long getActualEndDateMs() {
        return actualEndDateMs;
    }

    public void setActualEndDateMs(Long actualEndDateMs) {
        this.actualEndDateMs = actualEndDateMs;
    }

    public String getTaskLocation() {
        return taskLocation;
    }

    public void setTaskLocation(String taskLocation) {
        this.taskLocation = taskLocation;
    }

    public BigDecimal getTaskLocationLatitude() {
        return taskLocationLatitude;
    }

    public void setTaskLocationLatitude(BigDecimal taskLocationLatitude) {
        this.taskLocationLatitude = taskLocationLatitude;
    }

    public BigDecimal getTaskLocationLongitude() {
        return taskLocationLongitude;
    }

    public void setTaskLocationLongitude(BigDecimal taskLocationLongitude) {
        this.taskLocationLongitude = taskLocationLongitude;
    }

    public BigDecimal getStartLocationLatitude() {
        return startLocationLatitude;
    }

    public void setStartLocationLatitude(BigDecimal startLocationLatitude) {
        this.startLocationLatitude = startLocationLatitude;
    }

    public BigDecimal getStartLocationLongitude() {
        return startLocationLongitude;
    }

    public void setStartLocationLongitude(BigDecimal startLocationLongitude) {
        this.startLocationLongitude = startLocationLongitude;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Double getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(Double rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getLastRemarkId() {
        return lastRemarkId;
    }

    public void setLastRemarkId(Integer lastRemarkId) {
        this.lastRemarkId = lastRemarkId;
    }

    public Integer getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(Integer createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public Integer getUpdatedByUserId() {
        return updatedByUserId;
    }

    public void setUpdatedByUserId(Integer updatedByUserId) {
        this.updatedByUserId = updatedByUserId;
    }

    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public Date getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public void setUpdatedTimestamp(Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    public BigDecimal getEndLocationLatitude() {
        return endLocationLatitude;
    }

    public void setEndLocationLatitude(BigDecimal endLocationLatitude) {
        this.endLocationLatitude = endLocationLatitude;
    }

    public BigDecimal getEndLocationLongitude() {
        return endLocationLongitude;
    }

    public void setEndLocationLongitude(BigDecimal endLocationLongitude) {
        this.endLocationLongitude = endLocationLongitude;
    }

    public BigDecimal getEndLocationDistance() {
        return endLocationDistance;
    }

    public void setEndLocationDistance(BigDecimal endLocationDistance) {
        this.endLocationDistance = endLocationDistance;
    }

    public String getClientMobileNumber() {
        return clientMobileNumber;
    }

    public void setClientMobileNumber(String clientMobileNumber) {
        this.clientMobileNumber = clientMobileNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getIsItemsRequired() {
        return isItemsRequired;
    }

    public void setIsItemsRequired(String isItemsRequired) {
        this.isItemsRequired = isItemsRequired;
    }

    public String getDisableAcceptS1() {
        return disableAcceptS1;
    }

    public void setDisableAcceptS1(String disableAcceptS1) {
        this.disableAcceptS1 = disableAcceptS1;
    }

    public String getDisableAcceptS2() {
        return disableAcceptS2;
    }

    public void setDisableAcceptS2(String disableAcceptS2) {
        this.disableAcceptS2 = disableAcceptS2;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public String getAdditionalLocationDetail() {
        return additionalLocationDetail;
    }

    public void setAdditionalLocationDetail(String additionalLocationDetail) {
        this.additionalLocationDetail = additionalLocationDetail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public Integer getCustomerProductId() {
        return customerProductId;
    }

    public void setCustomerProductId(Integer customerProductId) {
        this.customerProductId = customerProductId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getInventoryLocationId() {
        return inventoryLocationId;
    }

    public void setInventoryLocationId(Integer inventoryLocationId) {
        this.inventoryLocationId = inventoryLocationId;
    }

    public String getMaterialIssued() {
        return materialIssued;
    }

    public void setMaterialIssued(String materialIssued) {
        this.materialIssued = materialIssued;
    }

    public String getMaterialReturn() {
        return materialReturn;
    }

    public void setMaterialReturn(String materialReturn) {
        this.materialReturn = materialReturn;
    }

    public String getParameterDeviation() {
        return parameterDeviation;
    }

    public void setParameterDeviation(String parameterDeviation) {
        this.parameterDeviation = parameterDeviation;
    }

    public String getMaterialReturnPending() {
        return materialReturnPending;
    }

    public void setMaterialReturnPending(String materialReturnPending) {
        this.materialReturnPending = materialReturnPending;
    }

    public String getProblemObserved() {
        return problemObserved;
    }

    public void setProblemObserved(String problemObserved) {
        this.problemObserved = problemObserved;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    public String getEngineApplication() {
        return engineApplication;
    }

    public void setEngineApplication(String engineApplication) {
        this.engineApplication = engineApplication;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getCustomerRemarks() {
        return customerRemarks;
    }

    public void setCustomerRemarks(String customerRemarks) {
        this.customerRemarks = customerRemarks;
    }

    public String getServiceEngineerRecommendation() {
        return serviceEngineerRecommendation;
    }

    public void setServiceEngineerRecommendation(String serviceEngineerRecommendation) {
        this.serviceEngineerRecommendation = serviceEngineerRecommendation;
    }

    public String getPresentConditionMachine() {
        return presentConditionMachine;
    }

    public void setPresentConditionMachine(String presentConditionMachine) {
        this.presentConditionMachine = presentConditionMachine;
    }

    public Integer getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(Integer organisationId) {
        this.organisationId = organisationId;
    }

    public Integer getCustomerPhoto() {
        return customerPhoto;
    }

    public void setCustomerPhoto(Integer customerPhoto) {
        this.customerPhoto = customerPhoto;
    }

    public String getTaskContactPersonName() {
        return taskContactPersonName;
    }

    public void setTaskContactPersonName(String taskContactPersonName) {
        this.taskContactPersonName = taskContactPersonName;
    }

    public String getTaskContactPersonNumber() {
        return taskContactPersonNumber;
    }

    public void setTaskContactPersonNumber(String taskContactPersonNumber) {
        this.taskContactPersonNumber = taskContactPersonNumber;
    }

    public Integer getPreEnginePhoto() {
        return preEnginePhoto;
    }

    public void setPreEnginePhoto(Integer preEnginePhoto) {
        this.preEnginePhoto = preEnginePhoto;
    }

    public Integer getPostEnginePhoto() {
        return postEnginePhoto;
    }

    public void setPostEnginePhoto(Integer postEnginePhoto) {
        this.postEnginePhoto = postEnginePhoto;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getHmr() {
        return hmr;
    }

    public void setHmr(String hmr) {
        this.hmr = hmr;
    }

    public Date getMachineInspectDate() {
        return machineInspectDate;
    }

    public void setMachineInspectDate(Date machineInspectDate) {
        this.machineInspectDate = machineInspectDate;
    }

    public Date getMachineRecommissionedDate() {
        return machineRecommissionedDate;
    }

    public void setMachineRecommissionedDate(Date machineRecommissionedDate) {
        this.machineRecommissionedDate = machineRecommissionedDate;
    }

    public String getHasCustomerAgreed() {
        return hasCustomerAgreed;
    }

    public void setHasCustomerAgreed(String hasCustomerAgreed) {
        this.hasCustomerAgreed = hasCustomerAgreed;
    }

    public String getTypeOfVisit() {
        return typeOfVisit;
    }

    public void setTypeOfVisit(String typeOfVisit) {
        this.typeOfVisit = typeOfVisit;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getOldMaterialReturnFlag() {
        return oldMaterialReturnFlag;
    }

    public void setOldMaterialReturnFlag(String oldMaterialReturnFlag) {
        this.oldMaterialReturnFlag = oldMaterialReturnFlag;
    }

    public Integer getCustomerSignature() {
        return customerSignature;
    }

    public void setCustomerSignature(Integer customerSignature) {
        this.customerSignature = customerSignature;
    }

    public Integer getTechnicianSignature() {
        return technicianSignature;
    }

    public void setTechnicianSignature(Integer technicianSignature) {
        this.technicianSignature = technicianSignature;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getSubContractor() {
        return subContractor;
    }

    public void setSubContractor(String subContractor) {
        this.subContractor = subContractor;
    }

}
