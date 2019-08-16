package uk.gov.dwp.esbmock.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import uk.gov.gsi.childmaintenance.futurescheme.bo.esb.eportal.cmecgetclientdetailsrequest.CmecGetClientDetailsResponse;

@Service
public class ClientDetailsService {

	@PostConstruct
	public void initialize() {
		CmecGetClientDetailsResponse clientDetails = new CmecGetClientDetailsResponse();
		// clientDetails.setClientDetails(value);

	}

}
