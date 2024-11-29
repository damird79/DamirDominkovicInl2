package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.LocalDate;

/**
 * a class to test
 */
public class LoanTest {
	@Test
	public void testDueDate() {
		Customer customer = new Customer("Mr", "Damir", "Dominkovic", "Hallegatan 15",
				"0709523624", "damird79@gmail.com", 1234, GenderType.MALE);
		Book book = new Book(1, "Understanding the digital world", "Brian W. Kernighan",
				"9780691219103", "Computer sciences", 283);
		Loan loan = new Loan(1, customer, book);

		LocalDate dueDate = loan.getDueDate();
		LocalDate expectedDueDate = LocalDate.now().plusDays(21);
   }
}