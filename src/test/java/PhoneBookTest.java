import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    void addTest(){
        final int expected = 1;

        final int actual = phoneBook.add("Sam","822");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void findByNumberTest(){
        String expected = "Sam";
        phoneBook.add("Sam","822");

        String actual = phoneBook.findByNumber("822");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void findByNameTest(){
        String expected = "822";
        phoneBook.add("Sam","822");

        String actual = phoneBook.findByName("Sam");

        Assertions.assertEquals(expected,actual);
    }
}
