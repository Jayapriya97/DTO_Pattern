package com.example.dtopractice;

import java.io.Serializable;

public class CtiResponseDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1847203905688054007L;
	
	private String ruleName;
	private Integer dataCount;
	private String status;
	private String serviceName;
	
	public CtiResponseDTO(String ruleName, Integer dataCount, String status, String serviceName) {
		this.ruleName = ruleName;
		this.dataCount = dataCount;
		this.status = status;
		this.serviceName = serviceName;
	}
	
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public Integer getDataCount() {
		return dataCount;
	}
	public void setDataCount(Integer dataCount) {
		this.dataCount = dataCount;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	@Override
	public String toString() {
		return "CtiResponseDTO [ruleName=" + ruleName + ", dataCount=" + dataCount + ", status=" + status
				+ ", serviceName=" + serviceName + "]";
	}
	


}
