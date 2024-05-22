package BackEndC3.HolaMundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //voy a trabajar solo con el header, sin tecnologia de vista
public class HolaMundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaMundoApplication.class, args);
	}


	@GetMapping("saludo1") //endpoint
	public String saludo1(){
		return "Bienvenidos a SpringBoot C3";
	}
	@GetMapping("saludo2")
	public String saludo2(){
		return "Hola Mundo DH";
	}


}
