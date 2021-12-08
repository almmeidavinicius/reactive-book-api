package project.reactivebookapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.reactivebookapi.document.Book;
import project.reactivebookapi.repository.BookRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Flux<Book> findAll() {
        return Flux.fromIterable(bookRepository.findAll());
    }

    @Override
    public Mono<Book> findById(String id) {
        return Mono.justOrEmpty(bookRepository.findById(id));
    }

    @Override
    public Mono<Book> save(Book book) {
        return Mono.justOrEmpty(bookRepository.save(book));
    }
}
