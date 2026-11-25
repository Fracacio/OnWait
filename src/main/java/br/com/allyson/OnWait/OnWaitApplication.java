package br.com.allyson.OnWait;

import br.com.allyson.OnWait.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class OnWaitApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OnWaitApplication.class, args);
		Principal principal = new Principal();
		principal.exibeMenu();
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
