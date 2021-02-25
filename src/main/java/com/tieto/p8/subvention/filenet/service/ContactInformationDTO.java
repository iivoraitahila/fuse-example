
package com.tieto.p8.subvention.filenet.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for contactInformationDTO complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="contactInformationDTO"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="applicantType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="applicantTypeOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="applicationYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="bankOwnerHetu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="bankOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dataPopulated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="groupCount1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="groupCount2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="loadedOrganization" type="{http://service.filenet.subvention.p8.tieto.com}organizationDTO" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="newCompany" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="organization" type="{http://service.filenet.subvention.p8.tieto.com}organizationDTO" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="privatePerson" type="{http://service.filenet.subvention.p8.tieto.com}personContactDTO" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="projectNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="selectedBankAccountsMap" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="selectedEmployeesMap" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="selectedPersonContactsMap" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="termsAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="webpages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactInformationDTO", propOrder = {
    "applicantType",
    "applicantTypeOther",
    "applicationYear",
    "bankOwnerHetu",
    "bankOwnerName",
    "dataPopulated",
    "email",
    "fax",
    "groupCount1",
    "groupCount2",
    "loadedOrganization",
    "newCompany",
    "organization",
    "privatePerson",
    "projectName",
    "projectNumber",
    "selectedBankAccountsMap",
    "selectedEmployeesMap",
    "selectedPersonContactsMap",
    "termsAccepted",
    "webpages"
})
public class ContactInformationDTO {

    protected String applicantType;
    protected String applicantTypeOther;
    protected Integer applicationYear;
    protected String bankOwnerHetu;
    protected String bankOwnerName;
    protected boolean dataPopulated;
    protected String email;
    protected String fax;
    protected Integer groupCount1;
    protected Integer groupCount2;
    protected OrganizationDTO loadedOrganization;
    protected boolean newCompany;
    protected OrganizationDTO organization;
    protected PersonContactDTO privatePerson;
    protected String projectName;
    protected Integer projectNumber;
    @XmlElement(nillable = true)
    protected List<Boolean> selectedBankAccountsMap;
    @XmlElement(nillable = true)
    protected List<Boolean> selectedEmployeesMap;
    @XmlElement(nillable = true)
    protected List<Boolean> selectedPersonContactsMap;
    protected boolean termsAccepted;
    protected String webpages;

    /**
     * Gets the value of the applicantType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantType() {
        return applicantType;
    }

    /**
     * Sets the value of the applicantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantType(String value) {
        this.applicantType = value;
    }

    /**
     * Gets the value of the applicantTypeOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantTypeOther() {
        return applicantTypeOther;
    }

    /**
     * Sets the value of the applicantTypeOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantTypeOther(String value) {
        this.applicantTypeOther = value;
    }

    /**
     * Gets the value of the applicationYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicationYear() {
        return applicationYear;
    }

    /**
     * Sets the value of the applicationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicationYear(Integer value) {
        this.applicationYear = value;
    }

    /**
     * Gets the value of the bankOwnerHetu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankOwnerHetu() {
        return bankOwnerHetu;
    }

    /**
     * Sets the value of the bankOwnerHetu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankOwnerHetu(String value) {
        this.bankOwnerHetu = value;
    }

    /**
     * Gets the value of the bankOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankOwnerName() {
        return bankOwnerName;
    }

    /**
     * Sets the value of the bankOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankOwnerName(String value) {
        this.bankOwnerName = value;
    }

    /**
     * Gets the value of the dataPopulated property.
     * 
     */
    public boolean isDataPopulated() {
        return dataPopulated;
    }

    /**
     * Sets the value of the dataPopulated property.
     * 
     */
    public void setDataPopulated(boolean value) {
        this.dataPopulated = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the groupCount1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupCount1() {
        return groupCount1;
    }

    /**
     * Sets the value of the groupCount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupCount1(Integer value) {
        this.groupCount1 = value;
    }

    /**
     * Gets the value of the groupCount2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupCount2() {
        return groupCount2;
    }

    /**
     * Sets the value of the groupCount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupCount2(Integer value) {
        this.groupCount2 = value;
    }

    /**
     * Gets the value of the loadedOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDTO }
     *     
     */
    public OrganizationDTO getLoadedOrganization() {
        return loadedOrganization;
    }

    /**
     * Sets the value of the loadedOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDTO }
     *     
     */
    public void setLoadedOrganization(OrganizationDTO value) {
        this.loadedOrganization = value;
    }

    /**
     * Gets the value of the newCompany property.
     * 
     */
    public boolean isNewCompany() {
        return newCompany;
    }

    /**
     * Sets the value of the newCompany property.
     * 
     */
    public void setNewCompany(boolean value) {
        this.newCompany = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDTO }
     *     
     */
    public OrganizationDTO getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDTO }
     *     
     */
    public void setOrganization(OrganizationDTO value) {
        this.organization = value;
    }

    /**
     * Gets the value of the privatePerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonContactDTO }
     *     
     */
    public PersonContactDTO getPrivatePerson() {
        return privatePerson;
    }

    /**
     * Sets the value of the privatePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonContactDTO }
     *     
     */
    public void setPrivatePerson(PersonContactDTO value) {
        this.privatePerson = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the projectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectNumber() {
        return projectNumber;
    }

    /**
     * Sets the value of the projectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectNumber(Integer value) {
        this.projectNumber = value;
    }

    /**
     * Gets the value of the selectedBankAccountsMap property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the selectedBankAccountsMap property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSelectedBankAccountsMap().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getSelectedBankAccountsMap() {
        if (selectedBankAccountsMap == null) {
            selectedBankAccountsMap = new ArrayList<Boolean>();
        }
        return this.selectedBankAccountsMap;
    }

    /**
     * Gets the value of the selectedEmployeesMap property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the selectedEmployeesMap property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSelectedEmployeesMap().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getSelectedEmployeesMap() {
        if (selectedEmployeesMap == null) {
            selectedEmployeesMap = new ArrayList<Boolean>();
        }
        return this.selectedEmployeesMap;
    }

    /**
     * Gets the value of the selectedPersonContactsMap property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the selectedPersonContactsMap property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSelectedPersonContactsMap().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getSelectedPersonContactsMap() {
        if (selectedPersonContactsMap == null) {
            selectedPersonContactsMap = new ArrayList<Boolean>();
        }
        return this.selectedPersonContactsMap;
    }

    /**
     * Gets the value of the termsAccepted property.
     * 
     */
    public boolean isTermsAccepted() {
        return termsAccepted;
    }

    /**
     * Sets the value of the termsAccepted property.
     * 
     */
    public void setTermsAccepted(boolean value) {
        this.termsAccepted = value;
    }

    /**
     * Gets the value of the webpages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebpages() {
        return webpages;
    }

    /**
     * Sets the value of the webpages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebpages(String value) {
        this.webpages = value;
    }

}
