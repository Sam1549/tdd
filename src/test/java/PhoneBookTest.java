import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Map;
import java.util.TreeMap;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @Test
    void addTest() {
        final int expected = 1;

        final int actual = phoneBook.add("Sam", "822");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findByNumberTest() {
        String expected = "Sam";
        phoneBook.add("Sam", "822");

        String actual = phoneBook.findByNumber("822");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findByNameTest() {
        String expected = "822";
        phoneBook.add("Sam", "822");

        String actual = phoneBook.findByName("Sam");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void printAllNamesTest() {

        phoneBook.add("Владимир", "3443");
        phoneBook.add("Аня", "822");
        TreeMap<String, String> phoneBook2 = new TreeMap<>();
        phoneBook2.put("Владимир", "3443");
        phoneBook2.put("Аня", "822");
        Map<String, String> actual = phoneBook.printAllNames();

        Assertions.assertEquals(phoneBook2, actual);
    }
}
