package project.reactivebookapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.reactivebookapi.document.Book;
import project.reactivebookapi.repository.BookRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

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

    @Override
    public Mono<Book> deleteById(String id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            bookRepository.deleteById(id);
            return Mono.just(optionalBook.get());
        } else {
            return Mono.empty();
        }
    }
}

