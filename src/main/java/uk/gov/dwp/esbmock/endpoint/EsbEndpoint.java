package uk.gov.dwp.esbmock.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import uk.gov.dwp.esbmock.domain.ClientDetailsResponse;
import uk.gov.dwp.esbmock.repository.ClientDetailsResponseDao;
import uk.gov.gsi.childmaintenance.futurescheme.bo.esb.eportal.cmecgetclientdetailsrequest.CmecEPortalContactDetails;
import uk.gov.gsi.childmaintenance.futurescheme.bo.esb.eportal.cmecgetclientdetailsrequest.CmecGetClientDetailsRequest;
import uk.gov.gsi.childmaintenance.futurescheme.bo.esb.eportal.cmecgetclientdetailsrequest.CmecGetClientDetailsResponse;
import uk.gov.gsi.childmaintenance.futurescheme.bo.esb.eportal.cmecgetclientdetailsrequest.Response;

@Endpoint
public class EsbEndpoint {

	@Autowired
	ClientDetailsResponseDao clientDetailsResponseDao;
	
	@PayloadRoot(namespace = "http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetClientDetailsWebService", localPart = "getClientDetails")
	@ResponsePayload
	public CmecGetClientDetailsResponse getClientDetails(@RequestPayload CmecGetClientDetailsRequest request) {
		CmecGetClientDetailsResponse result = new CmecGetClientDetailsResponse();
		System.out.println("########################"+request);
		System.out.println("***********************"+request.getSCIN());
		ClientDetailsResponse mongoResponse = clientDetailsResponseDao.findByScin("12345678");
		
		CmecEPortalContactDetails cmeContactDetails = new CmecEPortalContactDetails();
		cmeContactDetails.setBirthDate(mongoResponse.getClientDetails().getBirthDate());
		cmeContactDetails.setContactPreference(mongoResponse.getClientDetails().getContactPreference());
		cmeContactDetails.setEmailAddress(mongoResponse.getClientDetails().getEmailAddress());
		cmeContactDetails.setFirstName(mongoResponse.getClientDetails().getFirstName());
		cmeContactDetails.setGender(mongoResponse.getClientDetails().getGender());
		cmeContactDetails.setJobRole(mongoResponse.getClientDetails().getJobRole());
		cmeContactDetails.setLanguagePreference(mongoResponse.getClientDetails().getLanguagePreference());
		cmeContactDetails.setLastName(mongoResponse.getClientDetails().getLastName());
		cmeContactDetails.setMiddleName(mongoResponse.getClientDetails().getMiddleName());
		cmeContactDetails.setNINO(mongoResponse.getClientDetails().getNino());
		cmeContactDetails.setPersonID(mongoResponse.getClientDetails().getPersonID());
		cmeContactDetails.setPrimaryContactFlag(mongoResponse.getClientDetails().getPrimaryContactFlag());
		cmeContactDetails.setReferenceCode(mongoResponse.getClientDetails().getReferenceCode());
		cmeContactDetails.setSCIN(mongoResponse.getClientDetails().getScin());
		cmeContactDetails.setTitle(mongoResponse.getClientDetails().getTitle());
		result.setClientDetails(cmeContactDetails);
		
		Response response = new Response();
		response.setResponseCode(mongoResponse.getResponseHeader().getResponseCode());
		response.setResponseMessage(mongoResponse.getResponseHeader().getResponseMessage());
		response.setSRNumber(mongoResponse.getResponseHeader().getSrNumber());		
		result.setResponseHeader(response);
		
		return result;
	}

}
