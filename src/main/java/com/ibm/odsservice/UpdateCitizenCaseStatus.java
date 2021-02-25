
package com.ibm.odsservice;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="accessUserId" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="citizenCaseStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="eventCode" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="eventSource" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="eventDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="eventDescription_EN" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="eventDescription_SV" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="timeUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="timeCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accessUserId",
    "caseId",
    "citizenCaseStatus",
    "eventType",
    "eventCode",
    "eventSource",
    "eventDescription",
    "eventDescriptionEN",
    "eventDescriptionSV",
    "timeUpdated",
    "timeCreated"
})
@XmlRootElement(name = "updateCitizenCaseStatus")
public class UpdateCitizenCaseStatus implements Serializable {

    @XmlElement(required = true, nillable = true)
    protected String accessUserId;
    @XmlElement(required = true, nillable = true)
    protected String caseId;
    @XmlElement(required = true, nillable = true)
    protected String citizenCaseStatus;
    @XmlElement(required = true, nillable = true)
    protected String eventType;
    @XmlElement(required = true, nillable = true)
    protected String eventCode;
    @XmlElement(required = true, nillable = true)
    protected String eventSource;
    @XmlElement(required = true, nillable = true)
    protected String eventDescription;
    @XmlElement(name = "eventDescription_EN", required = true, nillable = true)
    protected String eventDescriptionEN;
    @XmlElement(name = "eventDescription_SV", required = true, nillable = true)
    protected String eventDescriptionSV;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeUpdated;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeCreated;

    /**
     * Gets the value of the accessUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessUserId() {
        return accessUserId;
    }

    /**
     * Sets the value of the accessUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessUserId(String value) {
        this.accessUserId = value;
    }

    /**
     * Gets the value of the caseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseId(String value) {
        this.caseId = value;
    }

    /**
     * Gets the value of the citizenCaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenCaseStatus() {
        return citizenCaseStatus;
    }

    /**
     * Sets the value of the citizenCaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenCaseStatus(String value) {
        this.citizenCaseStatus = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCode() {
        return eventCode;
    }

    /**
     * Sets the value of the eventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCode(String value) {
        this.eventCode = value;
    }

    /**
     * Gets the value of the eventSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventSource(String value) {
        this.eventSource = value;
    }

    /**
     * Gets the value of the eventDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * Sets the value of the eventDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDescription(String value) {
        this.eventDescription = value;
    }

    /**
     * Gets the value of the eventDescriptionEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDescriptionEN() {
        return eventDescriptionEN;
    }

    /**
     * Sets the value of the eventDescriptionEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDescriptionEN(String value) {
        this.eventDescriptionEN = value;
    }

    /**
     * Gets the value of the eventDescriptionSV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDescriptionSV() {
        return eventDescriptionSV;
    }

    /**
     * Sets the value of the eventDescriptionSV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDescriptionSV(String value) {
        this.eventDescriptionSV = value;
    }

    /**
     * Gets the value of the timeUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Sets the value of the timeUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeUpdated(XMLGregorianCalendar value) {
        this.timeUpdated = value;
    }

    /**
     * Gets the value of the timeCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeCreated() {
        return timeCreated;
    }

    /**
     * Sets the value of the timeCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeCreated(XMLGregorianCalendar value) {
        this.timeCreated = value;
    }

}
