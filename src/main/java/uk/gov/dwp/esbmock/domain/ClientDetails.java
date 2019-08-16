package uk.gov.dwp.esbmock.domain;

public class ClientDetails {
	private String birthDate;
	private String contactPreference;
	private String emailAddress;
	private String firstName;
	private String gender;
	private String jobRole;
	private String languagePreference;
	private String lastName;
	private String middleName;
	private String nino;
	private String personID;
	private String primaryContactFlag;
	private String referenceCode;
	private String scin;
	private String smsFlag;
	private String title;

	public String getBirthDate() {
		return birthDate;
	}

	public String getContactPreference() {
		return contactPreference;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getGender() {
		return gender;
	}

	public String getJobRole() {
		return jobRole;
	}

	public String getLanguagePreference() {
		return languagePreference;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getNino() {
		return nino;
	}

	public String getPersonID() {
		return personID;
	}

	public String getPrimaryContactFlag() {
		return primaryContactFlag;
	}

	public String getReferenceCode() {
		return referenceCode;
	}

	public String getScin() {
		return scin;
	}

	public String getSmsFlag() {
		return smsFlag;
	}

	public String getTitle() {
		return title;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public void setContactPreference(String contactPreference) {
		this.contactPreference = contactPreference;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public void setLanguagePreference(String languagePreference) {
		this.languagePreference = languagePreference;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setNino(String nino) {
		this.nino = nino;
	}

	public void setPersonID(String personID) {
		this.personID = personID;
	}

	public void setPrimaryContactFlag(String primaryContactFlag) {
		this.primaryContactFlag = primaryContactFlag;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	public void setScin(String scin) {
		this.scin = scin;
	}

	public void setSmsFlag(String smsFlag) {
		this.smsFlag = smsFlag;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "ClientDetails [primaryContactFlag=" + primaryContactFlag + ", emailAddress=" + emailAddress
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", referenceCode=" + referenceCode
				+ ", middleName=" + middleName + ", birthDate=" + birthDate + ", jobRole=" + jobRole + ", gender="
				+ gender + ", title=" + title + ", contactPreference=" + contactPreference + ", personID=" + personID
				+ ", scin=" + scin + ", nino=" + nino + ", languagePreference=" + languagePreference + ", smsFlag="
				+ smsFlag + "]";
	}

}
