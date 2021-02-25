
package com.ibm.odsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &amp;lt;element name="updateCitizenCaseStatusReturn" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
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
    "updateCitizenCaseStatusReturn"
})
@XmlRootElement(name = "updateCitizenCaseStatusResponse")
public class UpdateCitizenCaseStatusResponse implements Serializable {

    protected int updateCitizenCaseStatusReturn;

    /**
     * Gets the value of the updateCitizenCaseStatusReturn property.
     * 
     */
    public int getUpdateCitizenCaseStatusReturn() {
        return updateCitizenCaseStatusReturn;
    }

    /**
     * Sets the value of the updateCitizenCaseStatusReturn property.
     * 
     */
    public void setUpdateCitizenCaseStatusReturn(int value) {
        this.updateCitizenCaseStatusReturn = value;
    }

}
