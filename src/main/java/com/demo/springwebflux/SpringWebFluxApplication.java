package com.demo.springwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//source ::
//https://javatechonline.com/java-reactive-programming-spring-boot/?fbclid=IwZXh0bgNhZW0CMTEAAR0QStQYmqcBGIaXYG-FZvRi69NVRkwXOosk8w-lzJOaB1UXzvMmclU4Ssk_aem_AV_DPurnXe9JD8hcaoFa15XncbpmWYEzfrWWjKsaKhZxOQyGbmOtEYk7xcb-D7hLVoiQeZRXvnu4OJyD92QxhrN0
@SpringBootApplication
@ComponentScan(basePackages = "com.demo.springwebflux")
public class SpringWebFluxApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebFluxApplication.class, args);
	}

}
