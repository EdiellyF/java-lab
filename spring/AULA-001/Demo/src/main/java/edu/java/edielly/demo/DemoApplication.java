package edu.java.edielly.demo;

import edu.java.edielly.demo.models.DadosSerie;
import edu.java.edielly.demo.service.ConsumoDeApi;
import edu.java.edielly.demo.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

	static String endereco;
	static String response;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		endereco = "https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c";
        response = new ConsumoDeApi().obterDados(endereco);
		System.out.println(response);


		System.out.println("Primeiro projeto spring sem Web ");
		ConverteDados convertor = new ConverteDados();
		DadosSerie data = convertor.obterDados(response, DadosSerie.class);

		System.out.println(data);



	}
}
