package br.com.inheritance.jpa;

import br.com.inheritance.jpa.jointable.EletricGuitar;
import br.com.inheritance.jpa.repositories.EletricGuitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaInheritanceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaInheritanceApplication.class, args);
	}

	@Autowired
	EletricGuitarRepository eletricGuitarRepository;

	@Override
	public void run(String... args) throws Exception {

		EletricGuitar eletricGuitar = new EletricGuitar();
		eletricGuitar.setNumsOfStrings(6);
		eletricGuitar.setNumsOfPickups(7);

		eletricGuitarRepository.saveAndFlush(eletricGuitar);
	}
}
