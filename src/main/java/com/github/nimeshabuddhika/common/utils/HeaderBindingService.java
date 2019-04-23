package com.github.nimeshabuddhika.common.utils;

import com.github.nimeshabuddhika.common.model.EtihadLoyalHeaders;
import com.github.nimeshabuddhika.common.model.enums.IPType;
import com.github.nimeshabuddhika.common.model.enums.UseCase;
import org.springframework.http.HttpHeaders;

import java.util.Map;


public class HeaderBindingService {

    public EtihadLoyalHeaders convertToHeader(HttpHeaders headers) {
        return convertToHeader(headers.toSingleValueMap());
    }

    public EtihadLoyalHeaders convertToHeader(Map<String, String> headers) {
        EtihadLoyalHeaders header = new EtihadLoyalHeaders();
        header.setApplicationID(headers.get(HeaderParam.APP_ID));
        header.setApplicationSessionID(headers.get(HeaderParam.APPLICATION_SESSION_ID));
        header.setApplicationSessionTraceKey(headers.get(HeaderParam.APPLICATION_SESSION_TRACE_KEY));
        header.setApplicationSessionTraceKey(headers.get(HeaderParam.APPLICATION_SESSION_TRACE_VALUE));
        header.setConsumerID(headers.get(HeaderParam.CHANNEL_ID));
        header.setConsumerSessionID(headers.get(HeaderParam.CONSUMER_SESSION_ID));
        header.setConsumerSessionTimestamp(headers.get(HeaderParam.CONSUMER_SESSION_TIMESTAMP));
        header.setConsumerUserID(headers.get(HeaderParam.CONSUMER_USER_ID));
        header.setConsumerPassword(headers.get(HeaderParam.CONSUMER_PASSWORD));
        header.setoAuthTokenValue(headers.get(HeaderParam.OAUTH_TOKEN_VALUE));
        header.setPartnerId(headers.get(HeaderParam.PARTNER_ID));
        header.setConsumerTransactionID(headers.get(HeaderParam.CONSUMER_TRANSACTION_ID));
        header.setAirlineId(headers.get(HeaderParam.AIRLINE_ID));
        header.setMacAddress(headers.get(HeaderParam.MAC_ADDRESS));
        header.setOtp(headers.get(HeaderParam.OTP));
        header.setIpaAddress(headers.get(HeaderParam.IP_ADDRESS));
        header.setLanguageCode(headers.get(HeaderParam.LANG_CODE));
        header.setTransactionID(headers.get(HeaderParam.TRANSACTION_ID));
        switch (headers.get(HeaderParam.USE_CASE) == null ? "" : headers.get(HeaderParam.USE_CASE)) {
            case "STANDARD":
                header.setUseCase(UseCase.STANDARD);
                break;
            case "ETIHADSTAFF":
                header.setUseCase(UseCase.ETIHADSTAFF);
                break;
            case "BUSINESSCONNECTION":
                header.setUseCase(UseCase.BUSINESSCONNECTION);
                break;
            case "CARGOCONNECTION":
                header.setUseCase(UseCase.CARGOCONNECTION);
                break;
            case "SUPERSELLER":
                header.setUseCase(UseCase.SUPERSELLER);
                break;
            default:
                header.setUseCase(UseCase.DEFAULT);
        }
        switch (headers.get(HeaderParam.IP_TYPE) == null ? "" : headers.get(HeaderParam.IP_TYPE)) {
            case "MEMBER":
                header.setIptype(IPType.INTERNAL);
                break;
            case "APPLICATION":
                header.setIptype(IPType.APPLICATION);
                break;
            case "INTERNAL":
                header.setIptype(IPType.MEMBER);
                break;
            default:
                header.setIptype(IPType.MEMBER);
        }
        return header;
    }
}

