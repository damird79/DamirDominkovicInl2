package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * a class for testing if we can add and find a certain book, find book regardless if it was
 * written with all initial capitals or in upper or lower case, with extra spaces
 * or if we are looking for a book that doesn't exist in our library
 */

public class BookCatalogTest {

    private BookCatalog bc;
    private Book book1;

    public BookCatalogTest() {
        bc = new BookCatalog();
        Book book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);

    }

    @Test
    public void testAddABook() {
        Book book2 = new Book(2, "Understanding the digital world", "", "", "", 0);
        bc.addBook(book2);
        assertEquals(2, bc.getNumberOfBooks());
    }

    @Test
    public void testFindBook() throws BookNotFoundException {
        Book expectedBook = new Book(1, "Learning Java", "", "", "", 0);

        Book foundBook = bc.findBook("Learning Java");
        assertEquals(expectedBook.getTitle(), foundBook.getTitle());
    }

    @Test
    public void testFindBookIgnoringCase() throws BookNotFoundException {
        Book expectedBook = new Book(1, "Learning Java", "", "", "", 0);
        Book foundBook = bc.findBook("learning java");
        assertEquals(expectedBook.getTitle(), foundBook.getTitle());
    }

    @Test
    public void testFindBookWithExtraSpaces() throws BookNotFoundException {
        Book expectedBook = new Book(1, "Learning Java", "", "", "", 0);
        Book foundBook = bc.findBook("   Learning     Java     ");
    }

    @Test
    public void testFindBookThatDoesntExist() throws BookNotFoundException {

        BookCatalog bc = new BookCatalog();
        Book book1 = new Book(1, "Learning Java", "", "", "", 0);
        Book book2 = new Book(2, "Learning Java", "", "", "", 0);
        bc.addBook(book1);
        bc.addBook(book2);
        try {
            bc.findBook("Nonexistent book");
            fail("Expected BookNotFoundException to be thrown");

        } catch (BookNotFoundException e) {

        }
    }
}
