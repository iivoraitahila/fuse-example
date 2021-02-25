
package fi.hel.avustus.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "applicationYear",
    "newCompany",
    "organization",
    "privatePerson",
    "termsAccepted"
})
public class ContactInformation {

    @JsonProperty("applicationYear")
    private Integer applicationYear;
    @JsonProperty("newCompany")
    private Boolean newCompany;
    @JsonProperty("organization")
    private Organization organization;
    @JsonProperty("privatePerson")
    private PrivatePerson privatePerson;
    @JsonProperty("termsAccepted")
    private Boolean termsAccepted;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("applicationYear")
    public Integer getApplicationYear() {
        return applicationYear;
    }

    @JsonProperty("applicationYear")
    public void setApplicationYear(Integer applicationYear) {
        this.applicationYear = applicationYear;
    }

    @JsonProperty("newCompany")
    public Boolean getNewCompany() {
        return newCompany;
    }

    @JsonProperty("newCompany")
    public void setNewCompany(Boolean newCompany) {
        this.newCompany = newCompany;
    }

    @JsonProperty("organization")
    public Organization getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @JsonProperty("privatePerson")
    public PrivatePerson getPrivatePerson() {
        return privatePerson;
    }

    @JsonProperty("privatePerson")
    public void setPrivatePerson(PrivatePerson privatePerson) {
        this.privatePerson = privatePerson;
    }

    @JsonProperty("termsAccepted")
    public Boolean getTermsAccepted() {
        return termsAccepted;
    }

    @JsonProperty("termsAccepted")
    public void setTermsAccepted(Boolean termsAccepted) {
        this.termsAccepted = termsAccepted;
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
