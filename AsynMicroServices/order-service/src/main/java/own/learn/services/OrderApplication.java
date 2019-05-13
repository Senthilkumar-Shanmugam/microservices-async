package own.learn.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;

@SpringBootApplication
@EnableBinding(Processor.class)
public class OrderApplication {
	public static void main(String[] args) {
		//new SpringApplicationBuilder(OrderApplication.class).web(WebApplicationType.REACTIVE).run(args);
		SpringApplication.run(OrderApplication.class, args);

	  }

}
