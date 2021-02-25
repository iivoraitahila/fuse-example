
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
    "businessDescription",
    "communityMembersSubAssociationCitizens",
    "communityMembersSubdivisionAll",
    "communityMembersSubdivisionCitizens",
    "isBusiness",
    "personMembersCommunityAll",
    "personMembersCommunityCitizens",
    "personMembersSubAssociationAll",
    "personMembersSubdivisionCitizens",
    "personMembershipFee"
})
public class Business {

    @JsonProperty("businessDescription")
    private String businessDescription;
    @JsonProperty("communityMembersSubAssociationCitizens")
    private Integer communityMembersSubAssociationCitizens;
    @JsonProperty("communityMembersSubdivisionAll")
    private Integer communityMembersSubdivisionAll;
    @JsonProperty("communityMembersSubdivisionCitizens")
    private Integer communityMembersSubdivisionCitizens;
    @JsonProperty("isBusiness")
    private String isBusiness;
    @JsonProperty("personMembersCommunityAll")
    private Integer personMembersCommunityAll;
    @JsonProperty("personMembersCommunityCitizens")
    private Integer personMembersCommunityCitizens;
    @JsonProperty("personMembersSubAssociationAll")
    private Integer personMembersSubAssociationAll;
    @JsonProperty("personMembersSubdivisionCitizens")
    private Integer personMembersSubdivisionCitizens;
    @JsonProperty("personMembershipFee")
    private Double personMembershipFee;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("businessDescription")
    public String getBusinessDescription() {
        return businessDescription;
    }

    @JsonProperty("businessDescription")
    public void setBusinessDescription(String businessDescription) {
        this.businessDescription = businessDescription;
    }

    @JsonProperty("communityMembersSubAssociationCitizens")
    public Integer getCommunityMembersSubAssociationCitizens() {
        return communityMembersSubAssociationCitizens;
    }

    @JsonProperty("communityMembersSubAssociationCitizens")
    public void setCommunityMembersSubAssociationCitizens(Integer communityMembersSubAssociationCitizens) {
        this.communityMembersSubAssociationCitizens = communityMembersSubAssociationCitizens;
    }

    @JsonProperty("communityMembersSubdivisionAll")
    public Integer getCommunityMembersSubdivisionAll() {
        return communityMembersSubdivisionAll;
    }

    @JsonProperty("communityMembersSubdivisionAll")
    public void setCommunityMembersSubdivisionAll(Integer communityMembersSubdivisionAll) {
        this.communityMembersSubdivisionAll = communityMembersSubdivisionAll;
    }

    @JsonProperty("communityMembersSubdivisionCitizens")
    public Integer getCommunityMembersSubdivisionCitizens() {
        return communityMembersSubdivisionCitizens;
    }

    @JsonProperty("communityMembersSubdivisionCitizens")
    public void setCommunityMembersSubdivisionCitizens(Integer communityMembersSubdivisionCitizens) {
        this.communityMembersSubdivisionCitizens = communityMembersSubdivisionCitizens;
    }

    @JsonProperty("isBusiness")
    public String getIsBusiness() {
        return isBusiness;
    }

    @JsonProperty("isBusiness")
    public void setIsBusiness(String isBusiness) {
        this.isBusiness = isBusiness;
    }

    @JsonProperty("personMembersCommunityAll")
    public Integer getPersonMembersCommunityAll() {
        return personMembersCommunityAll;
    }

    @JsonProperty("personMembersCommunityAll")
    public void setPersonMembersCommunityAll(Integer personMembersCommunityAll) {
        this.personMembersCommunityAll = personMembersCommunityAll;
    }

    @JsonProperty("personMembersCommunityCitizens")
    public Integer getPersonMembersCommunityCitizens() {
        return personMembersCommunityCitizens;
    }

    @JsonProperty("personMembersCommunityCitizens")
    public void setPersonMembersCommunityCitizens(Integer personMembersCommunityCitizens) {
        this.personMembersCommunityCitizens = personMembersCommunityCitizens;
    }

    @JsonProperty("personMembersSubAssociationAll")
    public Integer getPersonMembersSubAssociationAll() {
        return personMembersSubAssociationAll;
    }

    @JsonProperty("personMembersSubAssociationAll")
    public void setPersonMembersSubAssociationAll(Integer personMembersSubAssociationAll) {
        this.personMembersSubAssociationAll = personMembersSubAssociationAll;
    }

    @JsonProperty("personMembersSubdivisionCitizens")
    public Integer getPersonMembersSubdivisionCitizens() {
        return personMembersSubdivisionCitizens;
    }

    @JsonProperty("personMembersSubdivisionCitizens")
    public void setPersonMembersSubdivisionCitizens(Integer personMembersSubdivisionCitizens) {
        this.personMembersSubdivisionCitizens = personMembersSubdivisionCitizens;
    }

    @JsonProperty("personMembershipFee")
    public Double getPersonMembershipFee() {
        return personMembershipFee;
    }

    @JsonProperty("personMembershipFee")
    public void setPersonMembershipFee(Double personMembershipFee) {
        this.personMembershipFee = personMembershipFee;
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
