//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.14 at 11:16:02 AM BST 
//


package uk.gov.gsi.childmaintenance.futurescheme.bo.esb.eportal.cmecgetclientdetailsrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CmecGetClientDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmecGetClientDetailsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestHeader" type="{http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/CMECHeader.xsd}CMECHeader" minOccurs="0"/>
 *         &lt;element name="SCIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmecGetClientDetailsRequest", propOrder = {
    "requestHeader",
    "scin"
})
public class CmecGetClientDetailsRequest {

    @XmlElement(name = "RequestHeader")
    protected CMECHeader requestHeader;
    @XmlElement(name = "SCIN", required = true)
    protected String scin;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link CMECHeader }
     *     
     */
    public CMECHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMECHeader }
     *     
     */
    public void setRequestHeader(CMECHeader value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the scin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCIN() {
        return scin;
    }

    /**
     * Sets the value of the scin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCIN(String value) {
        this.scin = value;
    }

}
