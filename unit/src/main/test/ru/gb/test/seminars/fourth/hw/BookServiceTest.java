package ru.gb.test.seminars.fourth.hw;

import fourth.book.Book;
import fourth.book.BookRepository;
import fourth.book.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class BookServiceTest {

    @Test
    void testFindBookById() {
        // Создаем мок-объект BookRepository
        BookRepository mockRepository = Mockito.mock(BookRepository.class);

        // Задаем ожидаемое поведение для метода findById
        when(mockRepository.findById("1")).thenReturn(new Book("1", "MockBook", "MockAuthor"));

        // Создаем экземпляр BookService с использованием мок-объекта
        BookService bookService = new BookService(mockRepository);

        // Вызываем метод findBookById и проверяем, что результат соответствует ожидаемому
        Book resultBook = bookService.findBookById("1");
        assertEquals("MockBook", resultBook.getTitle());
        assertEquals("MockAuthor", resultBook.getAuthor());
    }

    @Test
    void testFindAllBooks() {
        // Создаем мок-объект BookRepository
        BookRepository mockRepository = Mockito.mock(BookRepository.class);

        // Задаем ожидаемое поведение для метода findAll
        when(mockRepository.findAll()).thenReturn(Arrays.asList(
                new Book("1", "MockBook1", "MockAuthor1"),
                new Book("2", "MockBook2", "MockAuthor2")
        ));

        // Создаем экземпляр BookService с использованием мок-объекта
        BookService bookService = new BookService(mockRepository);

        // Вызываем метод findAllBooks и проверяем, что результат соответствует ожидаемому
        List<Book> resultBooks = bookService.findAllBooks();
        assertEquals(2, resultBooks.size());
        assertEquals("MockBook1", resultBooks.get(0).getTitle());
        assertEquals("MockAuthor1", resultBooks.get(0).getAuthor());
        assertEquals("MockBook2", resultBooks.get(1).getTitle());
        assertEquals("MockAuthor2", resultBooks.get(1).getAuthor());
    }
}

