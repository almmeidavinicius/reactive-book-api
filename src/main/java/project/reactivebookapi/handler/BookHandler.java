package project.reactivebookapi.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import project.reactivebookapi.document.Book;
import project.reactivebookapi.service.BookService;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;

@Component
@RequiredArgsConstructor
public class BookHandler {

    private final BookService bookService;

    public Mono<ServerResponse> save(ServerRequest request) {
        final Mono<Book> book = request.bodyToMono(Book.class);
        return ServerResponse
                .status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(book.flatMap(bookService::save), Book.class));
    }

    public Mono<ServerResponse> findAll(ServerRequest request) {
        return ServerResponse
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(bookService.findAll(), Book.class);
    }

    public Mono<ServerResponse> findById(ServerRequest request) {
        return bookService
                .findById(request.pathVariable("id"))
                .flatMap(book -> ServerResponse.ok().body(Mono.just(book), Book.class))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> deleteById(ServerRequest request) {
        return bookService
                .deleteById(request.pathVariable("id"))
                .flatMap(book -> ServerResponse.ok().body(Mono.just(book), Book.class))
                .switchIfEmpty(ServerResponse.notFound().build());
    }
}
