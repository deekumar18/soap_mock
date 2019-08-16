package uk.gov.dwp.esbmock.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import uk.gov.dwp.esbmock.repository.ClientDetailsResponseDao;
import uk.gov.dwp.esbmock.service.EsbService;
import uk.gov.gsi.childmaintenance.futurescheme.bo.esb.eportal.cmecgetclientdetailsrequest.CmecEPortalContactDetails;
import uk.gov.gsi.childmaintenance.futurescheme.bo.esb.eportal.cmecgetclientdetailsrequest.CmecGetClientDetailsRequest;
import uk.gov.gsi.childmaintenance.futurescheme.bo.esb.eportal.cmecgetclientdetailsrequest.CmecGetClientDetailsResponse;

@Endpoint
public class EsbEndpoint {

	@Autowired
	ClientDetailsResponseDao clientDetailsResponseDao;

	@Autowired
	private EsbService esbService;

	// http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetClientDetailsWebService

	@PayloadRoot(namespace = "http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetClientDetailsWebService", localPart = "getClientDetails")
	@ResponsePayload
	public CmecGetClientDetailsResponse getClientDetails(@RequestPayload CmecGetClientDetailsRequest request) {
		CmecGetClientDetailsResponse response = new CmecGetClientDetailsResponse();
		CmecEPortalContactDetails cmecEPortalContactDetails = new CmecEPortalContactDetails();
		cmecEPortalContactDetails.setEmailAddress("a@b.com");
		response.setClientDetails(cmecEPortalContactDetails);
		
		System.out.println("***************************");
		System.out.println(clientDetailsResponseDao.findAll());
		
		return response;
	}

}
