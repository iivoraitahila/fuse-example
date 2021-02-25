
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
    "readOnlyWhenSaved"
})
public class PrivatePerson {

    @JsonProperty("readOnlyWhenSaved")
    private Boolean readOnlyWhenSaved;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("readOnlyWhenSaved")
    public Boolean getReadOnlyWhenSaved() {
        return readOnlyWhenSaved;
    }

    @JsonProperty("readOnlyWhenSaved")
    public void setReadOnlyWhenSaved(Boolean readOnlyWhenSaved) {
        this.readOnlyWhenSaved = readOnlyWhenSaved;
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
