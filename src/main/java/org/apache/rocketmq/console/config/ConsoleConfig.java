package org.apache.rocketmq.console.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsoleConfig {

    @Value("${rocketmq.config.useTls}")
    private Boolean userTls;

    public Boolean getUserTls() {
        return userTls;
    }

    public void setUserTls(Boolean userTls) {
        this.userTls = userTls;
    }
}
