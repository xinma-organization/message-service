package com.xinma.base.datastore.model.tag;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.xinma.base.tag.CloudTag;

/**
 * 标签基本信息实体类
 * 
 * @author Alauda
 *
 * @date 2015年6月30日
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TagBasicInfoEO {

	private CloudTag meta;

	/**
	 * 组织Id
	 */
	private Integer organizationId;

	private Integer factoryId;

	private Integer productId;

	/**
	 * 分销商ID
	 */
	private Integer distributorId;

	private Date produceTime;

	/**
	 * 生产地址
	 */
	private String produceAddress;

	private String produceBatch;

	/**
	 * 父节点
	 */
	private Long parentNode;

	/**
	 * 子节点
	 */
	private Set<Long> childrenNode;

	public CloudTag getMeta() {
		return meta;
	}

	public void setMeta(CloudTag meta) {
		this.meta = meta;
	}

	public Integer getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}

	public Integer getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(Integer factoryId) {
		this.factoryId = factoryId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(Integer distributorId) {
		this.distributorId = distributorId;
	}

	public Date getProduceTime() {
		return produceTime;
	}

	public void setProduceTime(Date produceTime) {
		this.produceTime = produceTime;
	}

	public String getProduceAddress() {
		return produceAddress;
	}

	public void setProduceAddress(String produceAddress) {
		this.produceAddress = produceAddress;
	}

	public String getProduceBatch() {
		return produceBatch;
	}

	public void setProduceBatch(String produceBatch) {
		this.produceBatch = produceBatch;
	}

	public Long getParentNode() {
		return parentNode;
	}

	public void setParentNode(Long parentNode) {
		this.parentNode = parentNode;
	}

	public Set<Long> getChildrenNode() {
		return childrenNode;
	}

	public void setChildrenNode(Set<Long> childrenNode) {
		this.childrenNode = childrenNode;
	}
}
