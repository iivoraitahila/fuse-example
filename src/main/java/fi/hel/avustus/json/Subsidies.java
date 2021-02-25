
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
    "grantYear1",
    "grantYear2",
    "grantYear3",
    "loans",
    "otherSubsidies",
    "premises",
    "appliedSubsidies",
    "usage",
    "useOfPrevious"
})
public class Subsidies {

    @JsonProperty("grantYear1")
    private Integer grantYear1;
    @JsonProperty("grantYear2")
    private Integer grantYear2;
    @JsonProperty("grantYear3")
    private Integer grantYear3;
    @JsonProperty("loans")
    private String loans;
    @JsonProperty("otherSubsidies")
    private List<OtherSubsidy> otherSubsidies = null;
    @JsonProperty("premises")
    private String premises;
    @JsonProperty("appliedSubsidies")
    private List<AppliedSubsidy> appliedSubsidies = null;
    @JsonProperty("usage")
    private String usage;
    @JsonProperty("useOfPrevious")
    private String useOfPrevious;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("grantYear1")
    public Integer getGrantYear1() {
        return grantYear1;
    }

    @JsonProperty("grantYear1")
    public void setGrantYear1(Integer grantYear1) {
        this.grantYear1 = grantYear1;
    }

    @JsonProperty("grantYear2")
    public Integer getGrantYear2() {
        return grantYear2;
    }

    @JsonProperty("grantYear2")
    public void setGrantYear2(Integer grantYear2) {
        this.grantYear2 = grantYear2;
    }

    @JsonProperty("grantYear3")
    public Integer getGrantYear3() {
        return grantYear3;
    }

    @JsonProperty("grantYear3")
    public void setGrantYear3(Integer grantYear3) {
        this.grantYear3 = grantYear3;
    }

    @JsonProperty("loans")
    public String getLoans() {
        return loans;
    }

    @JsonProperty("loans")
    public void setLoans(String loans) {
        this.loans = loans;
    }

    @JsonProperty("otherSubsidies")
    public List<OtherSubsidy> getOtherSubsidies() {
        return otherSubsidies;
    }

    @JsonProperty("otherSubsidies")
    public void setOtherSubsidies(List<OtherSubsidy> otherSubsidies) {
        this.otherSubsidies = otherSubsidies;
    }

    @JsonProperty("premises")
    public String getPremises() {
        return premises;
    }

    @JsonProperty("premises")
    public void setPremises(String premises) {
        this.premises = premises;
    }

    @JsonProperty("appliedSubsidies")
    public List<AppliedSubsidy> getAppliedSubsidies() {
        return appliedSubsidies;
    }

    @JsonProperty("appliedSubsidies")
    public void setAppliedSubsidies(List<AppliedSubsidy> appliedSubsidies) {
        this.appliedSubsidies = appliedSubsidies;
    }

    @JsonProperty("usage")
    public String getUsage() {
        return usage;
    }

    @JsonProperty("usage")
    public void setUsage(String usage) {
        this.usage = usage;
    }

    @JsonProperty("useOfPrevious")
    public String getUseOfPrevious() {
        return useOfPrevious;
    }

    @JsonProperty("useOfPrevious")
    public void setUseOfPrevious(String useOfPrevious) {
        this.useOfPrevious = useOfPrevious;
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
