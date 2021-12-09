package project.reactivebookapi.service;

import project.reactivebookapi.document.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {

    Flux<Book> findAll();

    Mono<Book> findById(String id);

    Mono<Book> save(Book book);

    Mono<Book> deleteById(String id);
}
