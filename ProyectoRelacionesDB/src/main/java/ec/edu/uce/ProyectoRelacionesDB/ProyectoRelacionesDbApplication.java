package ec.edu.uce.ProyectoRelacionesDB;

import ec.edu.uce.ProyectoRelacionesDB.service.DataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "ec.edu.uce.ProyectoRelacionesDB.repository")
public class ProyectoRelacionesDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRelacionesDbApplication.class, args);

		// Instanciar el contexto de Spring
		ApplicationContext context = SpringApplication.run(ProyectoRelacionesDbApplication.class, args);

		// Obtener el bean de DataService y llamar a insertTestData()
		DataService dataService = context.getBean(DataService.class);
		dataService.insertTestData();
	}


}
