package com.durgadashaldar.genericnotificationsystem.entities;

import java.util.List;

import com.durgadashaldar.genericnotificationsystem.entities.enums.ErrorCodeEnum;

public class ResponseContext {
	
	private ErrorCodeEnum errorCodes;
	private boolean executionResponse;
	private List<Object> entities;
	public ErrorCodeEnum getErrorCodes() {
		return errorCodes;
	}
	public void setErrorCodes(ErrorCodeEnum errorCodes) {
		this.errorCodes = errorCodes;
	}
	public boolean isExecutionResponse() {
		return executionResponse;
	}
	public void setExecutionResponse(boolean executionResponse) {
		this.executionResponse = executionResponse;
	}
	public List<Object> getEntities() {
		return entities;
	}
	public void setEntities(List<Object> entities) {
		this.entities = entities;
	}
	public StackTraceElement getStackTraceElement() {
		return stackTraceElement;
	}
	public void setStackTraceElement(StackTraceElement stackTraceElement) {
		this.stackTraceElement = stackTraceElement;
	}
	private StackTraceElement stackTraceElement;

}
