package bff.eygm.common.utils;

import bff.eygm.common.exception.EtihadException;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.TrustStrategy;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

import javax.net.ssl.SSLContext;
import java.security.cert.X509Certificate;

/**
 * @author Nimesha on 10/12/2018 1:22 PM
 */
public class SSLCertificate {

    private static HttpComponentsClientHttpRequestFactory requestFactory;

    public static HttpComponentsClientHttpRequestFactory emptyCertificate() {
        try {
            if (requestFactory == null){
                TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;
                SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom()
                        .loadTrustMaterial(null, acceptingTrustStrategy)
                        .build();
                SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);
                CloseableHttpClient httpClient = HttpClients.custom()
                        .setSSLSocketFactory(csf)
                        .build();
                requestFactory = new HttpComponentsClientHttpRequestFactory();
                requestFactory.setHttpClient(httpClient);
            }
            return requestFactory;
        } catch (Exception e) {
            throw new EtihadException(e.getMessage());
        }
    }

}
