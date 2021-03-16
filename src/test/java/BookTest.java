import com.company.Book;
import com.company.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testRateHighStyle() {
        Book history = new Book("History of Russia", "Lomonosov", "High level", 0);
        assertEquals("High level", history.rateHighStyle());

        history.setBadWords(5);
        assertEquals("High level", history.rateHighStyle());

        history.setBadWords(6);
        assertEquals("Medium level", history.rateHighStyle());

        history.setBadWords(10);
        assertEquals("Medium level", history.rateHighStyle());

        history.setBadWords(11);
        assertEquals("Low level", history.rateHighStyle());
    }

    @Test
    void testExceptionRate(){
        Book badBook = new Book("Bad book", "Lesha", "Low level", -1);
        assertThrows(ArithmeticException.class, badBook::rateHighStyle);
    }

    @Test
    void testUpMood() {
        Book fun = new Book("Jokes", "Joker", "Medium level", 7);
        Human human = new Human();
        human.setMood(0);
        assertEquals(1, fun.upMood(human));
        human.setMood(-1);
        assertEquals(0, fun.upMood(human));
        fun.setStyle("High level");
        assertEquals(0, fun.upMood(human));
    }
}