package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

    /**
     * testing and making sure that the program recognizes same books
     */
    @Test
    public void test2EqualBooks() {
        Book book1 = new Book(1, "Understanding the digital world", "Brian W. Kernighan",
                "9780691219103", "Computer sciences", 283);
        Book book2 = new Book(1, "Understanding the digital world", "Brian W. Kernighan",
                "9780691219103", "Computer sciences", 283);

        assertEquals(book1, book2);
    }

    /**
     * testing and making sure that the program differentiates different books
     */
    @Test
    public void test2NonEqualBooks() {
        Book book1 = new Book(1, "Understanding the digital world", "Brian W. Kernighan",
                "9780691219103", "Computer sciences", 283);
        Book book2 = new Book(2, "Java: A Beginner's guide", "Herbert Schild, Dr. Danny Coward",
                "9781265054632", "Computer sciences", 739);

        assertNotEquals(book1, book2);
    }


}
