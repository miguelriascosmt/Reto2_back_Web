package Reto2_Web.Reto2_Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto2WebApplication implements CommandLineRunner {
    @Autowired
    private InterfazCleaningProduct interfazCleaningProduct;
    @Autowired
    private InterfazUser interfazUser;
	public static void main(String[] args) {
		SpringApplication.run(Reto2WebApplication.class, args);
	}
        @Override
        
    public void run (String... args) throws Exception{
        interfazCleaningProduct.deleteAll();
        interfazUser.deleteAll();
    }

}
