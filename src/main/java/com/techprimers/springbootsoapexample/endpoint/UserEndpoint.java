package com.techprimers.springbootsoapexample.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.techprimers.spring_boot_soap_example.GetUserRequest;
import com.techprimers.spring_boot_soap_example.GetUserResponse;
import com.techprimers.springbootsoapexample.service.UserService;

import uk.gov.gsi.childmaintenance.futurescheme.bo.esb.eportal.cmecgetclientdetailsrequest.CmecEPortalContactDetails;
import uk.gov.gsi.childmaintenance.futurescheme.bo.esb.eportal.cmecgetclientdetailsrequest.CmecGetClientDetailsRequest;
import uk.gov.gsi.childmaintenance.futurescheme.bo.esb.eportal.cmecgetclientdetailsrequest.CmecGetClientDetailsResponse;

@Endpoint
public class UserEndpoint {

    @Autowired
    private UserService userService;


    @PayloadRoot(namespace = "http://github.com/deekumar18/soap_mock",
            localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.getUsers(request.getName()));
        return response;
    }
    
    //http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetClientDetailsWebService
    
    @PayloadRoot(namespace = "http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetClientDetailsWebService",
            localPart = "getClientDetails")
    @ResponsePayload
    public CmecGetClientDetailsResponse getClientDetails(@RequestPayload CmecGetClientDetailsRequest request) {    											 
    	CmecGetClientDetailsResponse response = new CmecGetClientDetailsResponse();
    	CmecEPortalContactDetails cmecEPortalContactDetails=  new CmecEPortalContactDetails();
    	cmecEPortalContactDetails.setEmailAddress("a@b.com");
    	response.setClientDetails(cmecEPortalContactDetails);
        return response;
    }
    
}
