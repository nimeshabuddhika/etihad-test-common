package com.github.nimeshabuddhika.common.model;


import com.github.nimeshabuddhika.common.model.enums.IPType;
import com.github.nimeshabuddhika.common.model.enums.UseCase;

import java.io.Serializable;

/***
 *
 */
public class EtihadLoyalHeaders implements Serializable {

    private String transactionID = "";
    private String consumerTransactionID = "";
    private String applicationID = "";
    private String applicationSessionID = "";
    private String applicationSessionTraceKey = "";
    private String applicationSessionTraceValue = "";
    private String consumerID = "";
    private String consumerSessionID = "";
    private String consumerSessionTimestamp = "";
    private String consumerUserID = "";
    private String consumerPassword = "";
    private String oAuthTokenValue = "";
    private String partnerId = "";
    private String airlineId = "";
    private UseCase useCase;
    private String ipaAddress = "";
    private IPType iptype;
    private String macAddress = "";
    private String otp = "";
    private String languageCode = "";
    private String transactionId = "";


    public EtihadLoyalHeaders() {
    }


    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getConsumerTransactionID() {
        return consumerTransactionID;
    }

    public void setConsumerTransactionID(String consumerTransactionID) {
        this.consumerTransactionID = consumerTransactionID;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public String getApplicationSessionID() {
        return applicationSessionID;
    }

    public void setApplicationSessionID(String applicationSessionID) {
        this.applicationSessionID = applicationSessionID;
    }

    public String getApplicationSessionTraceKey() {
        return applicationSessionTraceKey;
    }

    public void setApplicationSessionTraceKey(String applicationSessionTraceKey) {
        this.applicationSessionTraceKey = applicationSessionTraceKey;
    }

    public String getApplicationSessionTraceValue() {
        return applicationSessionTraceValue;
    }

    public void setApplicationSessionTraceValue(String applicationSessionTraceValue) {
        this.applicationSessionTraceValue = applicationSessionTraceValue;
    }

    public String getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(String consumerID) {
        this.consumerID = consumerID;
    }

    public String getConsumerSessionID() {
        return consumerSessionID;
    }

    public void setConsumerSessionID(String consumerSessionID) {
        this.consumerSessionID = consumerSessionID;
    }

    public String getConsumerSessionTimestamp() {
        return consumerSessionTimestamp;
    }

    public void setConsumerSessionTimestamp(String consumerSessionTimestamp) {
        this.consumerSessionTimestamp = consumerSessionTimestamp;
    }

    public String getConsumerUserID() {
        return consumerUserID;
    }

    public void setConsumerUserID(String consumerUserID) {
        this.consumerUserID = consumerUserID;
    }

    public String getConsumerPassword() {
        return consumerPassword;
    }

    public void setConsumerPassword(String consumerPassword) {
        this.consumerPassword = consumerPassword;
    }

    public String getoAuthTokenValue() {
        return oAuthTokenValue;
    }

    public void setoAuthTokenValue(String oAuthTokenValue) {
        this.oAuthTokenValue = oAuthTokenValue;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(String airlineId) {
        this.airlineId = airlineId;
    }

    public String getUseCase() {
        return useCase.toString();
    }

    public void setUseCase(UseCase useCase) {
        this.useCase = useCase;
    }

    public String getIpaAddress() {
        return ipaAddress;
    }

    public void setIpaAddress(String ipaAddress) {
        this.ipaAddress = ipaAddress;
    }

    public String getIptype() {
        return iptype.toString();
    }

    public void setIptype(IPType iptype) {
        this.iptype = iptype;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "EtihadLoyalHeaders{" +
                "transactionID='" + transactionID + '\'' +
                ", consumerTransactionID='" + consumerTransactionID + '\'' +
                ", applicationID='" + applicationID + '\'' +
                ", applicationSessionID='" + applicationSessionID + '\'' +
                ", applicationSessionTraceKey='" + applicationSessionTraceKey + '\'' +
                ", applicationSessionTraceValue='" + applicationSessionTraceValue + '\'' +
                ", consumerID='" + consumerID + '\'' +
                ", consumerSessionID='" + consumerSessionID + '\'' +
                ", consumerSessionTimestamp='" + consumerSessionTimestamp + '\'' +
                ", consumerUserID='" + consumerUserID + '\'' +
                ", consumerPassword='" + consumerPassword + '\'' +
                ", oAuthTokenValue='" + oAuthTokenValue + '\'' +
                ", partnerId='" + partnerId + '\'' +
                ", airlineId='" + airlineId + '\'' +
                ", useCase=" + useCase +
                ", ipaAddress='" + ipaAddress + '\'' +
                ", iptype=" + iptype +
                ", macAddress='" + macAddress + '\'' +
                ", otp='" + otp + '\'' +
                ", languageCode='" + languageCode + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
