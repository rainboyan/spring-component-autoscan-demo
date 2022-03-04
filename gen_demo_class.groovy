// Generate 2000 Spring Demo Bean and Config

(1..2000).each {
    def writer = new StringWriter()
    it = it.toString().padLeft(4, '0')

    writer << """
package com.rainboyan.springcomponentautoscandemo.config

class Demo${it}Bean {
    String name
}
"""

    new File('./src/main/groovy/com/rainboyan/springcomponentautoscandemo/config', "Demo${it}Bean.groovy") << writer.toString()

    writer = new StringWriter()

    writer << """
package com.rainboyan.springcomponentautoscandemo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import groovy.transform.CompileStatic

@CompileStatic
@Configuration
class Demo${it}Config {
    @Bean
    Demo${it}Bean demo${it}Bean() {
        new Demo${it}Bean(name: 'Demo ${it}')
    }
}
"""

    new File('./src/main/groovy/com/rainboyan/springcomponentautoscandemo/config', "Demo${it}Config.groovy") << writer.toString()

//     writer << """
// package com.rainboyan.springcomponentautoscandemo;

// public class Demo${it}Bean {
//     private String name;

//     public Demo${it}Bean(String name) {
//         this.name = name;
//     }

//     public String getName() {
//         return name;
//     }
// }
// """

//     new File('./src/main/groovy/com/rainboyan/springcomponentautoscandemo', "Demo${it}Bean.java") << writer.toString()

//     writer = new StringWriter()

//     writer << """
// package com.rainboyan.springcomponentautoscandemo;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class Demo${it}Config {
//     @Bean
//     public Demo${it}Bean demo${it}Bean() {
//         return new Demo${it}Bean("Demo ${it}");
//     }
// }
// """

//     new File('./src/main/groovy/com/rainboyan/springcomponentautoscandemo', "Demo${it}Config.java") << writer.toString()
}
