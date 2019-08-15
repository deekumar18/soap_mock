//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.15 at 01:35:12 PM BST 
//


package uk.gov.gsi.childmaintenance.futurescheme.bo.esb.eportal.cmecgetclientdetailsrequest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CmecGetClientDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmecGetClientDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseHeader" type="{http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/Response.xsd}Response" minOccurs="0"/>
 *         &lt;element name="ClientDetails" type="{http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalContactDetails}CmecEPortalContactDetails" minOccurs="0"/>
 *         &lt;element name="ClientAddress" type="{http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalAddress}CmecEPortalAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CientHLSCaseDetails" type="{http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalHLSCaseDetails}CmecEPortalHLSCaseDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmecGetClientDetailsResponse", namespace = "http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetClientDetailsResponse", propOrder = {
    "responseHeader",
    "clientDetails",
    "clientAddress",
    "cientHLSCaseDetails"
})
public class CmecGetClientDetailsResponse {

    @XmlElement(name = "ResponseHeader")
    protected Response responseHeader;
    @XmlElement(name = "ClientDetails")
    protected CmecEPortalContactDetails clientDetails;
    @XmlElement(name = "ClientAddress")
    protected List<CmecEPortalAddress> clientAddress;
    @XmlElement(name = "CientHLSCaseDetails")
    protected List<CmecEPortalHLSCaseDetails> cientHLSCaseDetails;

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponseHeader(Response value) {
        this.responseHeader = value;
    }

    /**
     * Gets the value of the clientDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CmecEPortalContactDetails }
     *     
     */
    public CmecEPortalContactDetails getClientDetails() {
        return clientDetails;
    }

    /**
     * Sets the value of the clientDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmecEPortalContactDetails }
     *     
     */
    public void setClientDetails(CmecEPortalContactDetails value) {
        this.clientDetails = value;
    }

    /**
     * Gets the value of the clientAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmecEPortalAddress }
     * 
     * 
     */
    public List<CmecEPortalAddress> getClientAddress() {
        if (clientAddress == null) {
            clientAddress = new ArrayList<CmecEPortalAddress>();
        }
        return this.clientAddress;
    }

    /**
     * Gets the value of the cientHLSCaseDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cientHLSCaseDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCientHLSCaseDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmecEPortalHLSCaseDetails }
     * 
     * 
     */
    public List<CmecEPortalHLSCaseDetails> getCientHLSCaseDetails() {
        if (cientHLSCaseDetails == null) {
            cientHLSCaseDetails = new ArrayList<CmecEPortalHLSCaseDetails>();
        }
        return this.cientHLSCaseDetails;
    }

}
