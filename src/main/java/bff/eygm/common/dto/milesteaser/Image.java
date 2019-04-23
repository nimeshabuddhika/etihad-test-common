package bff.eygm.common.dto.milesteaser;

import java.io.Serializable;

public class Image implements Serializable {

    /**
     * field for Resolution
     */
    protected String resolution;

    /**
     * field for Url
     */
    protected String url;

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
