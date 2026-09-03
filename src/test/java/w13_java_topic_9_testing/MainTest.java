package w13_java_topic_9_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add_numbers() {
        int number1 = 10;
        int number2 = 40;
        int expectedSum = 50;
        int actualSum = Main.add_numbers(number1, number2);
        assertEquals(expectedSum, actualSum, "10 plus 40 should equal 50");
    }
}