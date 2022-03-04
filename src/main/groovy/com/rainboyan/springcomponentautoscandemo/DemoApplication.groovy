package com.rainboyan.springcomponentautoscandemo

import com.rainboyan.springcomponentautoscandemo.config.FooBean
import com.rainboyan.springcomponentautoscandemo.config.Demo1000Bean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

//@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
class DemoApplication implements CommandLineRunner {
	 @Autowired
	 Demo1000Bean demo1000Bean

	 @Autowired(required = false)
	 FooBean fooBean

	static void main(String[] args) {
        def now = System.currentTimeMillis()

		SpringApplication.run(DemoApplication, args)

        println "Application started in ${System.currentTimeMillis()-now}ms"
	}

	@Override
	void run(String... args) throws Exception {
		println '=' * 30
		println demo1000Bean.getName()
		println '#' * 30
		println fooBean.getName()
	}
}
