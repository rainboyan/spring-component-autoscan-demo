package com.rainboyan.springcomponentautoscandemo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfig {
    public BarBean barBean() {
        return new BarBean();
    }
}
