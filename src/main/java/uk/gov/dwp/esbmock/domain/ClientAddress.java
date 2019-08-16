package uk.gov.dwp.esbmock.domain;

public class ClientAddress {

	private String addressID;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String addressLine4;
	private String addressLine5;
	private String addressSource;
	private String addressType;
	private String city;
	private String country;
	private String county;
	private String deliveryPointSuffix;
	private String endDate;
	private String isPrimary;
	private String location;
	private String postCode;
	private String startDate;
	private String state;

	public String getAddressID() {
		return addressID;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public String getAddressLine5() {
		return addressLine5;
	}

	public String getAddressSource() {
		return addressSource;
	}

	public String getAddressType() {
		return addressType;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getCounty() {
		return county;
	}

	public String getDeliveryPointSuffix() {
		return deliveryPointSuffix;
	}

	public String getEndDate() {
		return endDate;
	}

	public String getIsPrimary() {
		return isPrimary;
	}

	public String getLocation() {
		return location;
	}

	public String getPostCode() {
		return postCode;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getState() {
		return state;
	}

	public void setAddressID(String addressID) {
		this.addressID = addressID;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public void setAddressLine5(String addressLine5) {
		this.addressLine5 = addressLine5;
	}

	public void setAddressSource(String addressSource) {
		this.addressSource = addressSource;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public void setDeliveryPointSuffix(String deliveryPointSuffix) {
		this.deliveryPointSuffix = deliveryPointSuffix;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "ClientAddress [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", addressLine3="
				+ addressLine3 + ", addressLine4=" + addressLine4 + ", addressLine5=" + addressLine5 + ", county="
				+ county + ", country=" + country + ", addressType=" + addressType + ", postCode=" + postCode
				+ ", isPrimary=" + isPrimary + ", addressID=" + addressID + ", state=" + state + ", city=" + city
				+ ", addressSource=" + addressSource + ", deliveryPointSuffix=" + deliveryPointSuffix + ", startDate="
				+ startDate + ", endDate=" + endDate + ", location=" + location + "]";
	}

}
