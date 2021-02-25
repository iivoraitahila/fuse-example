
package fi.hel.avustus.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "abbreviation",
    "bankAccounts",
    "contactPersons",
    "email",
    "employees",
    "homeTown",
    "name",
    "organizationCode",
    "registerDate",
    "registrationYear",
    "webPages"
})
public class Organization {

    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("bankAccounts")
    private List<BankAccount> bankAccounts = null;
    @JsonProperty("contactPersons")
    private List<ContactPerson> contactPersons = null;
    @JsonProperty("email")
    private String email;
    @JsonProperty("employees")
    private List<Employee> employees = null;
    @JsonProperty("homeTown")
    private String homeTown;
    @JsonProperty("name")
    private String name;
    @JsonProperty("organizationCode")
    private String organizationCode;
    @JsonProperty("registerDate")
    private String registerDate;
    @JsonProperty("registrationYear")
    private Integer registrationYear;
    @JsonProperty("webPages")
    private String webPages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("bankAccounts")
    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    @JsonProperty("bankAccounts")
    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @JsonProperty("contactPersons")
    public List<ContactPerson> getContactPersons() {
        return contactPersons;
    }

    @JsonProperty("contactPersons")
    public void setContactPersons(List<ContactPerson> contactPersons) {
        this.contactPersons = contactPersons;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("employees")
    public List<Employee> getEmployees() {
        return employees;
    }

    @JsonProperty("employees")
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @JsonProperty("homeTown")
    public String getHomeTown() {
        return homeTown;
    }

    @JsonProperty("homeTown")
    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("organizationCode")
    public String getOrganizationCode() {
        return organizationCode;
    }

    @JsonProperty("organizationCode")
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    @JsonProperty("registerDate")
    public String getRegisterDate() {
        return registerDate;
    }

    @JsonProperty("registerDate")
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    @JsonProperty("registrationYear")
    public Integer getRegistrationYear() {
        return registrationYear;
    }

    @JsonProperty("registrationYear")
    public void setRegistrationYear(Integer registrationYear) {
        this.registrationYear = registrationYear;
    }

    @JsonProperty("webPages")
    public String getWebPages() {
        return webPages;
    }

    @JsonProperty("webPages")
    public void setWebPages(String webPages) {
        this.webPages = webPages;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
