package com.wander.cmis.commons;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "system-params")
public class SystemParams {

    private String jyjUrl;

    public String getJyjUrl() {
        return jyjUrl;
    }

    public void setJyjUrl(String jyjUrl) {
        this.jyjUrl = jyjUrl;
    }
}
