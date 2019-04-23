package bff.eygm.common.dto.cardStore;

import java.io.Serializable;

public class MemberCardDetailsDto implements Serializable {

    private String token="";
    private String keyId="";
    private String prtCusId="";
    private String walletDate="";
    private String bankName="";
    private String mobileCardType="";
    private String expiryDate="";
    private String merchantId="";
    private String currency="";
    private String category="";
    private String country="";
    private String wallet="";
    private String bin="";

    public MemberCardDetailsDto() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getPrtCusId() {
        return prtCusId;
    }

    public void setPrtCusId(String prtCusId) {
        this.prtCusId = prtCusId;
    }

    public String getWalletDate() {
        return walletDate;
    }

    public void setWalletDate(String walletDate) {
        this.walletDate = walletDate;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getMobileCardType() {
        return mobileCardType;
    }

    public void setMobileCardType(String mobileCardType) {
        this.mobileCardType = mobileCardType;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }
}
