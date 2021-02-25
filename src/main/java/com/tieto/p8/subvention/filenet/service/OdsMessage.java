
package com.tieto.p8.subvention.filenet.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * &lt;p&gt;Java class for odsMessage complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="odsMessage"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sentBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odsMessage", propOrder = {
    "body",
    "sendDateTime",
    "sentBy"
})
public class OdsMessage implements Serializable {

    protected String body;
    protected String sendDateTime;
    protected String sentBy;

    /**
     * Gets the value of the body property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the sendDateTime property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSendDateTime() {
        return sendDateTime;
    }

    /**
     * Sets the value of the sendDateTime property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSendDateTime(String value) {
        this.sendDateTime = value;
    }

    /**
     * Gets the value of the sentBy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSentBy() {
        return sentBy;
    }

    /**
     * Sets the value of the sentBy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSentBy(String value) {
        this.sentBy = value;
    }

}
