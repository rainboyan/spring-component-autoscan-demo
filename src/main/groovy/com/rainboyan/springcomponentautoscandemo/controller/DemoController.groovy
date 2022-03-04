package com.rainboyan.springcomponentautoscandemo.controller

import com.rainboyan.springcomponentautoscandemo.config.Demo1000Bean
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController;

@CompileStatic
@RestController
class DemoController {
    @Autowired
    Demo1000Bean demo1000Bean

    def index() {
        return demo1000Bean.name
    }
}