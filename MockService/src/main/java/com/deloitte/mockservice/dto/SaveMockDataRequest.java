package com.deloitte.mockservice.dto;

public class SaveMockDataRequest {
	
	private String request;

	private String response;
	
	private String contenttype;	
	
	private String client;
	
	private String description;	
	
	private String serviceName;
	
	private Long id; 
	
	private Boolean isStaticMock;
	
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getContenttype() {
		return contenttype;
	}

	public void setContenttype(String contenttype) {
		this.contenttype = contenttype;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsStaticMock() {
		return isStaticMock;
	}

	public void setIsStaticMock(Boolean isStaticMock) {
		this.isStaticMock = isStaticMock;
	}
		
}
