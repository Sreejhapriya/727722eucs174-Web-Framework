package com.example.ce1.config;
//package com.example.ce1.config.$app;
import org.springframework.beans.factory.annotation.Value;

public class AppConfig {
    private static final String $app = null;
    @Value($app.name)
    private String appName;
    @Value($app.version)
    private String appVersion;
    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public String getAppVersion() {
        return appVersion;
    }
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
    public AppConfig(String appName, String appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;
    }
    
}
