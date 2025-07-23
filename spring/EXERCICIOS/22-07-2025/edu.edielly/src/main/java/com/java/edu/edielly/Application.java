package com.java.edu.edielly;

import com.java.edu.edielly.model.Tarefa;
import com.java.edu.edielly.services.ServiceDeTarefa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Tarefa tarefa = new Tarefa("Elaborar o relatório de vendas do segundo trimestre.", false, "Marina Costa");
		new ServiceDeTarefa().add(tarefa);

	}
}
