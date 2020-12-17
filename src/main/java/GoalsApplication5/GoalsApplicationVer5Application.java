package GoalsApplication5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "http://localhost:53792")
public class GoalsApplicationVer5Application {
	@RequestMapping("/resource")
	public Map<String,Object> home() {
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("id", UUID.randomUUID());
		model.put("content", "Hello World");
		return model;
	}
	public static void main(String[] args) {
		SpringApplication.run(GoalsApplicationVer5Application.class, args);
	}

}
