package com.github.nimeshabuddhika.common.utils;

import org.springframework.http.HttpHeaders;

/**
 * @author Nimesha Buddhika on 2/28/2019 6:29 PM
 */
public class HeaderFilterService {

    public void bindHeaders(HttpHeaders httpHeaders) {
        httpHeaders.remove("host");
        httpHeaders.remove("x-forwarded-proto");
    }

    public HttpHeaders bindHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        this.bindHeaders(httpHeaders);
        return httpHeaders;
    }
}
