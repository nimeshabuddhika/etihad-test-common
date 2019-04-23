package bff.eygm.common.utils;

import bff.eygm.common.model.EtihadLoyalHeaders;

public interface HeaderFactory {

     MessageHeader getMessageHeader(EtihadLoyalHeaders etihadLoyalHeaders);
}
