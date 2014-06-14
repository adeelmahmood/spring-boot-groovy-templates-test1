package tests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Configuration
@EnableAutoConfiguration
@Controller
public class Application {

	@RequestMapping("/")
	public ModelAndView home() {

		// create some sample data
		Author author = new Author();
		author.setName("author1");
		Book book1 = new Book();
		book1.setName("book1");
		author.getBooks().add(book1);

		// return model data
		return new ModelAndView("home", "author", author);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}