
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
    "attachments",
    "business",
    "contactInformation",
    "formAvailableByDate",
    "subsidies"
})
public class Application {

    @JsonProperty("attachments")
    private Attachments attachments;
    @JsonProperty("business")
    private Business business;
    @JsonProperty("contactInformation")
    private ContactInformation contactInformation;
    @JsonProperty("formAvailableByDate")
    private Boolean formAvailableByDate;
    @JsonProperty("subsidies")
    private Subsidies subsidies;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("attachments")
    public Attachments getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("business")
    public Business getBusiness() {
        return business;
    }

    @JsonProperty("business")
    public void setBusiness(Business business) {
        this.business = business;
    }

    @JsonProperty("contactInformation")
    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    @JsonProperty("contactInformation")
    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    @JsonProperty("formAvailableByDate")
    public Boolean getFormAvailableByDate() {
        return formAvailableByDate;
    }

    @JsonProperty("formAvailableByDate")
    public void setFormAvailableByDate(Boolean formAvailableByDate) {
        this.formAvailableByDate = formAvailableByDate;
    }

    @JsonProperty("subsidies")
    public Subsidies getSubsidies() {
        return subsidies;
    }

    @JsonProperty("subsidies")
    public void setSubsidies(Subsidies subsidies) {
        this.subsidies = subsidies;
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
