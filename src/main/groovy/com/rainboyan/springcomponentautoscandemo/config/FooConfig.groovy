package com.rainboyan.springcomponentautoscandemo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FooConfig {

    @Bean
    FooBean fooBean() {
        return new FooBean()
    }
}
