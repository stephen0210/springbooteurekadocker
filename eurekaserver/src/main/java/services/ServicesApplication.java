package services;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaServer
public class ServicesApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ServicesApplication.class).web(WebApplicationType.SERVLET).run(args);
		//SpringApplication.run(ServicesApplication.class, args);
	}



}
