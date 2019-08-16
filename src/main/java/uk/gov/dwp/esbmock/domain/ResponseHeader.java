package uk.gov.dwp.esbmock.domain;

public class ResponseHeader {

	private Integer responseCode;
	private String responseMessage;
	private String srNumber;
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public String getSrNumber() {
		return srNumber;
	}
	public void setSrNumber(String srNumber) {
		this.srNumber = srNumber;
	}
	@Override
	public String toString() {
		return "ResponseHeader [responseCode=" + responseCode + ", responseMessage=" + responseMessage + ", srNumber="
				+ srNumber + "]";
	}
	
}
