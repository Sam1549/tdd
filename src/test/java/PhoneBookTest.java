import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    void addTest(){
        final int expected = 1;

        final int actual = phoneBook.add();

        Assertions.assertEquals(expected,actual);
    }
}
