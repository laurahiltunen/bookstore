package k2020.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import k2020.Bookstore.domain.Book;
import k2020.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean 
	public CommandLineRunner bookDemo(BookRepository repository) {
		return (args) -> {
			repository.save(new Book("Tuhatkaunokki", "M.K.Tillmann", 1999));
			repository.save(new Book("Annan nuoruusvuodet", "M. Montgomery", 1926));
			repository.save(new Book("Tulen nielemä", "Silja Kosonen", 2000));
		};
		
		
	}

}
