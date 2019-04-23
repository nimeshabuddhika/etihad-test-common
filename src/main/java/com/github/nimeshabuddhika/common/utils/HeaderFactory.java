package com.github.nimeshabuddhika.common.utils;

import com.github.nimeshabuddhika.common.model.EtihadLoyalHeaders;

public interface HeaderFactory {

     MessageHeader getMessageHeader(EtihadLoyalHeaders etihadLoyalHeaders);
}
