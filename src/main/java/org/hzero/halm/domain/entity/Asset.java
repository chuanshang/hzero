package org.hzero.halm.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hzero.export.annotation.ExcelColumn;
import org.hzero.export.annotation.ExcelSheet;

import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

//import javax.validation.constraints.NotBlank;
//增加此NotBlank

/**
 * 
 *
 * @author shuailong.tan@hand-china.com 2019-06-14 09:50:23
 */
@ApiModel("")
@VersionAudit
@ModifyAudit
@Table(name = "aafm_asset")
@ExcelSheet(zh = "收货记录", en = "Receiving record")
public class Asset extends AuditDomain {

    public static final String FIELD_ASSET_ID = "assetId";
    public static final String FIELD_ASSET_NUM = "assetNum";
    public static final String FIELD_ASSET_DESC = "assetDesc";
    public static final String FIELD_SPECIAL_ASSET_CODE = "specialAssetCode";
    public static final String FIELD_BRAND = "brand";
    public static final String FIELD_MODEL = "model";
    public static final String FIELD_NAME_RULE_CODE = "nameRuleCode";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_SERIAL_NUM = "serialNum";
    public static final String FIELD_TRACKING_NUM = "trackingNum";
    public static final String FIELD_MAINTAIN_FLAG = "maintainFlag";
    public static final String FIELD_ASSET_NAME = "assetName";
    public static final String FIELD_DESCRIPTION = "description";
    public static final String FIELD_ASSET_ICON = "assetIcon";
    public static final String FIELD_ATTRIBUTE_VALUES = "attributeValues";
    public static final String FIELD_LINEAR_NAME = "linearName";
    public static final String FIELD_LINEAR_START_MEASURE = "linearStartMeasure";
    public static final String FIELD_LINEAR_END_MEASURE = "linearEndMeasure";
    public static final String FIELD_LINEAR_START_DESC = "linearStartDesc";
    public static final String FIELD_LINEAR_END_DESC = "linearEndDesc";
    public static final String FIELD_CAR_NUM = "carNum";
    public static final String FIELD_VIN_NUM = "vinNum";
    public static final String FIELD_ENGINE_NUM = "engineNum";
    public static final String FIELD_ASSET_SOURCE_DETAIL = "assetSourceDetail";
    public static final String FIELD_CURRENCY_CODE = "currencyCode";
    public static final String FIELD_RECEIVED_DATE = "receivedDate";
    public static final String FIELD_START_DATE = "startDate";
    public static final String FIELD_WARRANTY_TYPE_CODE = "warrantyTypeCode";
    public static final String FIELD_WARRANTY_TYPE_RULE = "warrantyTypeRule";
    public static final String FIELD_WARRANTY_START_DATE = "warrantyStartDate";
    public static final String FIELD_WARRANTY_EXPIRE_DATE = "warrantyExpireDate";
    public static final String FIELD_PARENT_ASSET_ID = "parentAssetId";
    public static final String FIELD_ASSET_CRITICALITY = "assetCriticality";
    public static final String FIELD_ASSET_LOCATION_ID = "assetLocationId";
    public static final String FIELD_ASSET_LOCATION_DESC = "assetLocationDesc";
    public static final String FIELD_MAP_SOURCE = "mapSource";
    public static final String FIELD_OWNING_ORG_DETAIL = "owningOrgDetail";
    public static final String FIELD_USING_ORG_DETAIL = "usingOrgDetail";
    public static final String FIELD_TENANT_ID = "tenantId";
    public static final String FIELD_ASSET_SOURCE_ID = "assetSourceId";
    public static final String FIELD_AOS_RECEIVING_REPORT_ID = "aosReceivingReportId";
    public static final String FIELD_SOURCE_CONTRACT_ID = "sourceContractId";
    public static final String FIELD_SOURCE_PROJECT_ID = "sourceProjectId";
    public static final String FIELD_USING_ORG_ID = "usingOrgId";
    public static final String FIELD_OWNING_ORG_ID = "owningOrgId";
    public static final String FIELD_USER_PERSON_ID = "userPersonId";
    public static final String FIELD_OWNING_PERSON_ID = "owningPersonId";
    public static final String FIELD_ASSET_SOURCE_TYPE_CODE = "assetSourceTypeCode";
    public static final String FIELD_ASSET_SPECIALTY_ID = "assetSpecialtyId";
    public static final String FIELD_ASSET_CLASS_ID = "assetClassId";
    public static final String FIELD_ASSETS_SET_ID = "assetsSetId";
    public static final String FIELD_ORIGINAL_COST = "originalCost";
    public static final String FIELD_SUPPLIER_ORG_ID = "supplierOrgId";
    public static final String FIELD_COST_CENTER_ID = "costCenterId";
    public static final String FIELD_ASSET_STATUS_ID = "assetStatusId";

    //
    // 业务方法(按public protected private顺序排列)
    // ------------------------------------------------------------------------------

    //
    // 数据库字段
    // ------------------------------------------------------------------------------


    @ApiModelProperty("表ID，主键，供其他表做外键")
    @Id
    @GeneratedValue
    @ExcelColumn(zh = "资产id", en = "moveReason")
    private Long assetId;
    @ApiModelProperty(value = "资产编号",required = true)
    @NotBlank
    @ExcelColumn(zh = "资产编号", en = "moveReason")
    private String assetNum;
    @ApiModelProperty(value = "资产全称",required = true)
    @NotBlank
    @ExcelColumn(zh = "资产全称", en = "moveReason")
    private String assetDesc;
   @ApiModelProperty(value = "所属特殊资产")
   @ExcelColumn(zh = "资产全称", en = "moveReason")
    private String specialAssetCode;
   @ApiModelProperty(value = "品牌/厂商")
   @ExcelColumn(zh = "资产全称", en = "moveReason")
    private String brand;
   @ApiModelProperty(value = "规格型号")
   @ExcelColumn(zh = "资产全称", en = "moveReason")
    private String model;
    @ApiModelProperty(value = "资产标签/铭牌规则",required = true)
    @NotBlank
    @ExcelColumn(zh = "资产全称", en = "moveReason")
    private String nameRuleCode;
    @ApiModelProperty(value = "可视标签/铭牌",required = true)
    @NotBlank
    @ExcelColumn(zh = "资产全称", en = "moveReason")
    private String name;
   @ApiModelProperty(value = "序列号,非中文")
   @ExcelColumn(zh = "资产全称", en = "moveReason")
    private String serialNum;
   @ApiModelProperty(value = "其他跟踪编号")
   @ExcelColumn(zh = "资产全称", en = "moveReason")
    private String trackingNum;
    @ApiModelProperty(value = "是否可维修",required = true)
    @NotNull
    private Long maintainFlag;
    @ApiModelProperty(value = "产品名称",required = true)
    @NotBlank
    private String assetName;
   @ApiModelProperty(value = "描述")    
    private String description;
   @ApiModelProperty(value = "图标")    
    private String assetIcon;
   @ApiModelProperty(value = "属性行值")    
    private String attributeValues;
   @ApiModelProperty(value = "线性描述-长度")    
    private Long linearName;
   @ApiModelProperty(value = "线性描述-开始端(A)计量位")    
    private Long linearStartMeasure;
   @ApiModelProperty(value = "线性描述-结束端(B)端计量位")    
    private Long linearEndMeasure;
   @ApiModelProperty(value = "线性描述-开始端(A)描述")    
    private String linearStartDesc;
   @ApiModelProperty(value = "线性描述-开始端(B)描述")    
    private String linearEndDesc;
   @ApiModelProperty(value = "车牌号")    
    private String carNum;
   @ApiModelProperty(value = "车架号")    
    private String vinNum;
   @ApiModelProperty(value = "发动机号")    
    private String engineNum;
   @ApiModelProperty(value = "来源明细")    
    private String assetSourceDetail;
   @ApiModelProperty(value = "货币")    
    private String currencyCode;
    @ApiModelProperty(value = "交付日期",required = true)
    @NotNull
    private Date receivedDate;
    @ApiModelProperty(value = "启用日期",required = true)
    @NotNull
    private Date startDate;
   @ApiModelProperty(value = "质保类型")    
    private String warrantyTypeCode;
   @ApiModelProperty(value = "质保起始日规则")    
    private String warrantyTypeRule;
    @ApiModelProperty(value = "质保起始日",required = true)
    @NotNull
    private Date warrantyStartDate;
    @ApiModelProperty(value = "质保终止日",required = true)
    @NotNull
    private Date warrantyExpireDate;
   @ApiModelProperty(value = "父资产")    
    private String parentAssetId;
   @ApiModelProperty(value = "资产重要性")    
    private String assetCriticality;
    @ApiModelProperty(value = "资产位置",required = true)
    @NotNull
    private Long assetLocationId;
   @ApiModelProperty(value = "资产位置详细说明")    
    private String assetLocationDesc;
    @ApiModelProperty(value = "地图来源",required = true)
    @NotBlank
    private String mapSource;
   @ApiModelProperty(value = "所属组织明细")    
    private String owningOrgDetail;
   @ApiModelProperty(value = "使用组织明细")    
    private String usingOrgDetail;
    @ApiModelProperty(value = "租户ID",required = true)
    @NotNull
    private Long tenantId;
   @ApiModelProperty(value = "其他来源相关文档号")    
    private Long assetSourceId;
   @ApiModelProperty(value = "来源验收单")    
    private Long aosReceivingReportId;
   @ApiModelProperty(value = "来源合同")    
    private Long sourceContractId;
   @ApiModelProperty(value = "来源项目")    
    private Long sourceProjectId;
   @ApiModelProperty(value = "使用组织")    
    private Long usingOrgId;
   @ApiModelProperty(value = "所属组织")    
    private Long owningOrgId;
   @ApiModelProperty(value = "使用人")    
    private Long userPersonId;
   @ApiModelProperty(value = "资产管理员")    
    private Long owningPersonId;
    @ApiModelProperty(value = "资产来源",required = true)
    @NotBlank
    private String assetSourceTypeCode;
   @ApiModelProperty(value = "所属资产专业分类")    
    private Long assetSpecialtyId;
    @ApiModelProperty(value = "产品类别/资产分类",required = true)
    @NotNull
    private Long assetClassId;
    @ApiModelProperty(value = "产品组/资产组",required = true)
    @NotNull
    private Long assetsSetId;
   @ApiModelProperty(value = "获取价格")    
    private BigDecimal originalCost;
   @ApiModelProperty(value = "供应商")    
    private Long supplierOrgId;
   @ApiModelProperty(value = "成本中心")    
    private Long costCenterId;
    @ApiModelProperty(value = "资产状态",required = true)
    @NotNull
    private Long assetStatusId;
    @ApiModelProperty(value = "是否已处理",required = true)
    @NotNull
    private Boolean dealFlag;

	//
    // 非数据库字段
    // ------------------------------------------------------------------------------


    @Transient
    private String productCategoryode;
    @Transient
    private String assetStatusCode;
    @Transient
    private String costCenterCode;
    //
    // getter/setter
    // ------------------------------------------------------------------------------

    /**
     * @return 表ID，主键，供其他表做外键
     */
	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}
    /**
     * @return 资产编号
     */
	public String getAssetNum() {
		return assetNum;
	}

	public void setAssetNum(String assetNum) {
		this.assetNum = assetNum;
	}
    /**
     * @return 资产全称
     */
	public String getAssetDesc() {
		return assetDesc;
	}

	public void setAssetDesc(String assetDesc) {
		this.assetDesc = assetDesc;
	}
    /**
     * @return 所属特殊资产
     */
	public String getSpecialAssetCode() {
		return specialAssetCode;
	}

	public void setSpecialAssetCode(String specialAssetCode) {
		this.specialAssetCode = specialAssetCode;
	}
    /**
     * @return 品牌/厂商
     */
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
    /**
     * @return 规格型号
     */
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
    /**
     * @return 资产标签/铭牌规则
     */
	public String getNameRuleCode() {
		return nameRuleCode;
	}

	public void setNameRuleCode(String nameRuleCode) {
		this.nameRuleCode = nameRuleCode;
	}
    /**
     * @return 可视标签/铭牌
     */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    /**
     * @return 序列号,非中文
     */
	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
    /**
     * @return 其他跟踪编号
     */
	public String getTrackingNum() {
		return trackingNum;
	}

	public void setTrackingNum(String trackingNum) {
		this.trackingNum = trackingNum;
	}
    /**
     * @return 是否可维修
     */
	public Long getMaintainFlag() {
		return maintainFlag;
	}

	public void setMaintainFlag(Long maintainFlag) {
		this.maintainFlag = maintainFlag;
	}
    /**
     * @return 产品名称
     */
	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
    /**
     * @return 描述
     */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    /**
     * @return 图标
     */
	public String getAssetIcon() {
		return assetIcon;
	}

	public void setAssetIcon(String assetIcon) {
		this.assetIcon = assetIcon;
	}
    /**
     * @return 属性行值
     */
	public String getAttributeValues() {
		return attributeValues;
	}

	public void setAttributeValues(String attributeValues) {
		this.attributeValues = attributeValues;
	}
    /**
     * @return 线性描述-长度
     */
	public Long getLinearName() {
		return linearName;
	}

	public void setLinearName(Long linearName) {
		this.linearName = linearName;
	}
    /**
     * @return 线性描述-开始端(A)计量位
     */
	public Long getLinearStartMeasure() {
		return linearStartMeasure;
	}

	public void setLinearStartMeasure(Long linearStartMeasure) {
		this.linearStartMeasure = linearStartMeasure;
	}
    /**
     * @return 线性描述-结束端(B)端计量位
     */
	public Long getLinearEndMeasure() {
		return linearEndMeasure;
	}

	public void setLinearEndMeasure(Long linearEndMeasure) {
		this.linearEndMeasure = linearEndMeasure;
	}
    /**
     * @return 线性描述-开始端(A)描述
     */
	public String getLinearStartDesc() {
		return linearStartDesc;
	}

	public void setLinearStartDesc(String linearStartDesc) {
		this.linearStartDesc = linearStartDesc;
	}
    /**
     * @return 线性描述-开始端(B)描述
     */
	public String getLinearEndDesc() {
		return linearEndDesc;
	}

	public void setLinearEndDesc(String linearEndDesc) {
		this.linearEndDesc = linearEndDesc;
	}
    /**
     * @return 车牌号
     */
	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
    /**
     * @return 车架号
     */
	public String getVinNum() {
		return vinNum;
	}

	public void setVinNum(String vinNum) {
		this.vinNum = vinNum;
	}
    /**
     * @return 发动机号
     */
	public String getEngineNum() {
		return engineNum;
	}

	public void setEngineNum(String engineNum) {
		this.engineNum = engineNum;
	}
    /**
     * @return 来源明细
     */
	public String getAssetSourceDetail() {
		return assetSourceDetail;
	}

	public void setAssetSourceDetail(String assetSourceDetail) {
		this.assetSourceDetail = assetSourceDetail;
	}
    /**
     * @return 货币
     */
	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
    /**
     * @return 交付日期
     */
	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}
    /**
     * @return 启用日期
     */
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
    /**
     * @return 质保类型
     */
	public String getWarrantyTypeCode() {
		return warrantyTypeCode;
	}

	public void setWarrantyTypeCode(String warrantyTypeCode) {
		this.warrantyTypeCode = warrantyTypeCode;
	}
    /**
     * @return 质保起始日规则
     */
	public String getWarrantyTypeRule() {
		return warrantyTypeRule;
	}

	public void setWarrantyTypeRule(String warrantyTypeRule) {
		this.warrantyTypeRule = warrantyTypeRule;
	}
    /**
     * @return 质保起始日
     */
	public Date getWarrantyStartDate() {
		return warrantyStartDate;
	}

	public void setWarrantyStartDate(Date warrantyStartDate) {
		this.warrantyStartDate = warrantyStartDate;
	}
    /**
     * @return 质保终止日
     */
	public Date getWarrantyExpireDate() {
		return warrantyExpireDate;
	}

	public void setWarrantyExpireDate(Date warrantyExpireDate) {
		this.warrantyExpireDate = warrantyExpireDate;
	}
    /**
     * @return 父资产
     */
	public String getParentAssetId() {
		return parentAssetId;
	}

	public void setParentAssetId(String parentAssetId) {
		this.parentAssetId = parentAssetId;
	}
    /**
     * @return 资产重要性
     */
	public String getAssetCriticality() {
		return assetCriticality;
	}

	public void setAssetCriticality(String assetCriticality) {
		this.assetCriticality = assetCriticality;
	}
    /**
     * @return 资产位置
     */
	public Long getAssetLocationId() {
		return assetLocationId;
	}

	public void setAssetLocationId(Long assetLocationId) {
		this.assetLocationId = assetLocationId;
	}
    /**
     * @return 资产位置详细说明
     */
	public String getAssetLocationDesc() {
		return assetLocationDesc;
	}

	public void setAssetLocationDesc(String assetLocationDesc) {
		this.assetLocationDesc = assetLocationDesc;
	}
    /**
     * @return 地图来源
     */
	public String getMapSource() {
		return mapSource;
	}

	public void setMapSource(String mapSource) {
		this.mapSource = mapSource;
	}
    /**
     * @return 所属组织明细
     */
	public String getOwningOrgDetail() {
		return owningOrgDetail;
	}

	public void setOwningOrgDetail(String owningOrgDetail) {
		this.owningOrgDetail = owningOrgDetail;
	}
    /**
     * @return 使用组织明细
     */
	public String getUsingOrgDetail() {
		return usingOrgDetail;
	}

	public void setUsingOrgDetail(String usingOrgDetail) {
		this.usingOrgDetail = usingOrgDetail;
	}
    /**
     * @return 租户ID
     */
	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}
    /**
     * @return 其他来源相关文档号
     */
	public Long getAssetSourceId() {
		return assetSourceId;
	}

	public void setAssetSourceId(Long assetSourceId) {
		this.assetSourceId = assetSourceId;
	}
    /**
     * @return 来源验收单
     */
	public Long getAosReceivingReportId() {
		return aosReceivingReportId;
	}

	public void setAosReceivingReportId(Long aosReceivingReportId) {
		this.aosReceivingReportId = aosReceivingReportId;
	}
    /**
     * @return 来源合同
     */
	public Long getSourceContractId() {
		return sourceContractId;
	}

	public void setSourceContractId(Long sourceContractId) {
		this.sourceContractId = sourceContractId;
	}
    /**
     * @return 来源项目
     */
	public Long getSourceProjectId() {
		return sourceProjectId;
	}

	public void setSourceProjectId(Long sourceProjectId) {
		this.sourceProjectId = sourceProjectId;
	}
    /**
     * @return 使用组织
     */
	public Long getUsingOrgId() {
		return usingOrgId;
	}

	public void setUsingOrgId(Long usingOrgId) {
		this.usingOrgId = usingOrgId;
	}
    /**
     * @return 所属组织
     */
	public Long getOwningOrgId() {
		return owningOrgId;
	}

	public void setOwningOrgId(Long owningOrgId) {
		this.owningOrgId = owningOrgId;
	}
    /**
     * @return 使用人
     */
	public Long getUserPersonId() {
		return userPersonId;
	}

	public void setUserPersonId(Long userPersonId) {
		this.userPersonId = userPersonId;
	}
    /**
     * @return 资产管理员
     */
	public Long getOwningPersonId() {
		return owningPersonId;
	}

	public void setOwningPersonId(Long owningPersonId) {
		this.owningPersonId = owningPersonId;
	}
    /**
     * @return 资产来源
     */
	public String getAssetSourceTypeCode() {
		return assetSourceTypeCode;
	}

	public void setAssetSourceTypeCode(String assetSourceTypeCode) {
		this.assetSourceTypeCode = assetSourceTypeCode;
	}
    /**
     * @return 所属资产专业分类
     */
	public Long getAssetSpecialtyId() {
		return assetSpecialtyId;
	}

	public void setAssetSpecialtyId(Long assetSpecialtyId) {
		this.assetSpecialtyId = assetSpecialtyId;
	}
    /**
     * @return 产品类别/资产分类
     */
	public Long getAssetClassId() {
		return assetClassId;
	}

	public void setAssetClassId(Long assetClassId) {
		this.assetClassId = assetClassId;
	}
    /**
     * @return 产品组/资产组
     */
	public Long getAssetsSetId() {
		return assetsSetId;
	}

	public void setAssetsSetId(Long assetsSetId) {
		this.assetsSetId = assetsSetId;
	}
    /**
     * @return 获取价格
     */
	public BigDecimal getOriginalCost() {
		return originalCost;
	}

	public void setOriginalCost(BigDecimal originalCost) {
		this.originalCost = originalCost;
	}
    /**
     * @return 供应商
     */
	public Long getSupplierOrgId() {
		return supplierOrgId;
	}

	public void setSupplierOrgId(Long supplierOrgId) {
		this.supplierOrgId = supplierOrgId;
	}
    /**
     * @return 成本中心
     */
	public Long getCostCenterId() {
		return costCenterId;
	}

	public void setCostCenterId(Long costCenterId) {
		this.costCenterId = costCenterId;
	}
    /**
     * @return 资产状态
     */
	public Long getAssetStatusId() {
		return assetStatusId;
	}

	public void setAssetStatusId(Long assetStatusId) {
		this.assetStatusId = assetStatusId;
	}

    public Boolean getDealFlag() {
        return dealFlag;
    }

    public void setDealFlag(Boolean dealFlag) {
        this.dealFlag = dealFlag;
    }

    public String getProductCategoryode() {
        return productCategoryode;
    }

    public void setProductCategoryode(String productCategoryode) {
        this.productCategoryode = productCategoryode;
    }

    public String getAssetStatusCode() {
        return assetStatusCode;
    }

    public void setAssetStatusCode(String assetStatusCode) {
        this.assetStatusCode = assetStatusCode;
    }

    public String getCostCenterCode() {
        return costCenterCode;
    }

    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }
}
