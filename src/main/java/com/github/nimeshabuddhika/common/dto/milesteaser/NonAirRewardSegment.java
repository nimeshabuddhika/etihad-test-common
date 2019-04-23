package com.github.nimeshabuddhika.common.dto.milesteaser;

import java.io.Serializable;

public class NonAirRewardSegment implements Serializable {



    private boolean rewardDirectLinkSpecified;






    /**
     * field for RewardId
     */
    protected String rewardId;

    /**
     * field for RewardName
     */
    protected String rewardName;

    /**
     * field for RewardDescription
     */
    protected String rewardDescription;

    /**
     * field for RewardDirectLink
     */
    protected String rewardDirectLink;


    /**
     * field for PriceInMiles
     */
    protected long priceInMiles;

    /**
     * field for PriceInCash
     */
    protected double priceInCash;

    /**
     * field for MemberCurrencyCode
     */
    protected String memberCurrencyCode;

    /**
     * field for Image
     * This was an Array!
     */
    protected Image[] image;

    public String getRewardId() {
        return rewardId;
    }

    public void setRewardId(String rewardId) {
        this.rewardId = rewardId;
    }

    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String rewardName) {
        this.rewardName = rewardName;
    }

    public String getRewardDescription() {
        return rewardDescription;
    }

    public void setRewardDescription(String rewardDescription) {
        this.rewardDescription = rewardDescription;
    }

    public String getRewardDirectLink() {
        return rewardDirectLink;
    }

    public void setRewardDirectLink(String rewardDirectLink) {
        this.rewardDirectLink = rewardDirectLink;
    }

    public long getPriceInMiles() {
        return priceInMiles;
    }

    public void setPriceInMiles(long priceInMiles) {
        this.priceInMiles = priceInMiles;
    }

    public double getPriceInCash() {
        return priceInCash;
    }

    public void setPriceInCash(double priceInCash) {
        this.priceInCash = priceInCash;
    }

    public String getMemberCurrencyCode() {
        return memberCurrencyCode;
    }

    public void setMemberCurrencyCode(String memberCurrencyCode) {
        this.memberCurrencyCode = memberCurrencyCode;
    }

    public Image[] getImage() {
        return image;
    }

    public void setImage(Image[] image) {
        this.image = image;
    }

    public boolean isRewardDirectLinkSpecified() {
        return rewardDirectLinkSpecified;
    }

    public void setRewardDirectLinkSpecified(boolean rewardDirectLinkSpecified) {
        this.rewardDirectLinkSpecified = rewardDirectLinkSpecified;
    }
}
