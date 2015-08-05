package clitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CliTestApplication {

    public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(10000);
    	
    	SpringApplication.run(CliTestApplication.class, args);
        
        System.out.println(System.getProperty("environment"));
        System.out.println(System.getProperty("my-environment"));
    }
}
