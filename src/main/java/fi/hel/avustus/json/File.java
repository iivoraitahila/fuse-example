
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
    "description",
    "fileType",
    "required",
    "descriptionEditable"
})
public class File {

    @JsonProperty("description")
    private String description;
    @JsonProperty("fileType")
    private Integer fileType;
    @JsonProperty("required")
    private Boolean required;
    @JsonProperty("descriptionEditable")
    private Boolean descriptionEditable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("fileType")
    public Integer getFileType() {
        return fileType;
    }

    @JsonProperty("fileType")
    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    @JsonProperty("required")
    public void setRequired(Boolean required) {
        this.required = required;
    }

    @JsonProperty("descriptionEditable")
    public Boolean getDescriptionEditable() {
        return descriptionEditable;
    }

    @JsonProperty("descriptionEditable")
    public void setDescriptionEditable(Boolean descriptionEditable) {
        this.descriptionEditable = descriptionEditable;
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
