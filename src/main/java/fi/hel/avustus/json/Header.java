
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
    "serviceId",
    "caseId",
    "status",
    "formTimestamp",
    "callbackUrl",
    "properties"
})
public class Header {

    @JsonProperty("serviceId")
    private String serviceId;
    @JsonProperty("caseId")
    private String caseId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("formTimestamp")
    private String formTimestamp;
    @JsonProperty("callbackUrl")
    private String callbackUrl;
    @JsonProperty("properties")
    private List<Property> properties = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("serviceId")
    public String getServiceId() {
        return serviceId;
    }

    @JsonProperty("serviceId")
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @JsonProperty("caseId")
    public String getCaseId() {
        return caseId;
    }

    @JsonProperty("caseId")
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("formTimestamp")
    public String getFormTimestamp() {
        return formTimestamp;
    }

    @JsonProperty("formTimestamp")
    public void setFormTimestamp(String formTimestamp) {
        this.formTimestamp = formTimestamp;
    }

    @JsonProperty("callbackUrl")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    @JsonProperty("callbackUrl")
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    @JsonProperty("properties")
    public List<Property> getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(List<Property> properties) {
        this.properties = properties;
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
