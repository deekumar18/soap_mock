package uk.gov.dwp.esbmock.domain;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientdetailsresponse")
public class ClientDetailsResponse {

	private List<CientHLSCaseDetail> cientHLSCaseDetails = null;
	private List<ClientAddress> clientAddress = null;
	private ClientDetails clientDetails;
	private ResponseHeader responseHeader;

	public List<CientHLSCaseDetail> getCientHLSCaseDetails() {
		return cientHLSCaseDetails;
	}

	public List<ClientAddress> getClientAddress() {
		return clientAddress;
	}

	public ClientDetails getClientDetails() {
		return clientDetails;
	}

	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setCientHLSCaseDetails(List<CientHLSCaseDetail> cientHLSCaseDetails) {
		this.cientHLSCaseDetails = cientHLSCaseDetails;
	}

	public void setClientAddress(List<ClientAddress> clientAddress) {
		this.clientAddress = clientAddress;
	}

	public void setClientDetails(ClientDetails clientDetails) {
		this.clientDetails = clientDetails;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}

	@Override
	public String toString() {
		return "ClientDetailsResponse [responseHeader=" + responseHeader + ", clientDetails=" + clientDetails
				+ ", clientAddress=" + clientAddress + ", cientHLSCaseDetails=" + cientHLSCaseDetails + "]";
	}

}
