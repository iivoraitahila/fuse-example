
package com.tieto.p8.subvention.filenet.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tieto.p8.subvention.filenet.service package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tieto.p8.subvention.filenet.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactInformationDTO }
     * 
     */
    public ContactInformationDTO createContactInformationDTO() {
        return new ContactInformationDTO();
    }

    /**
     * Create an instance of {@link OrganizationDTO }
     * 
     */
    public OrganizationDTO createOrganizationDTO() {
        return new OrganizationDTO();
    }

    /**
     * Create an instance of {@link PersonContactDTO }
     * 
     */
    public PersonContactDTO createPersonContactDTO() {
        return new PersonContactDTO();
    }

    /**
     * Create an instance of {@link BankAccountDTO }
     * 
     */
    public BankAccountDTO createBankAccountDTO() {
        return new BankAccountDTO();
    }

    /**
     * Create an instance of {@link Subvention }
     * 
     */
    public Subvention createSubvention() {
        return new Subvention();
    }

    /**
     * Create an instance of {@link OdsMessage }
     * 
     */
    public OdsMessage createOdsMessage() {
        return new OdsMessage();
    }

    /**
     * Create an instance of {@link ResultOfService }
     * 
     */
    public ResultOfService createResultOfService() {
        return new ResultOfService();
    }

}
