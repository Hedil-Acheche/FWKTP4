package tn.rnu.eniso.fwk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "tn.rnu.eniso.messagingapp")
public class Tp4FwkApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp4FwkApplication.class, args);
    }

}
