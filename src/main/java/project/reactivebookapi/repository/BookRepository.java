package project.reactivebookapi.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import project.reactivebookapi.document.Book;

@EnableScan
public interface BookRepository extends CrudRepository<Book, String> {
}
