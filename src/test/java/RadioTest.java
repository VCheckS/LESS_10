import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void shouldSetStation() {

        Radio rad = new Radio();
        rad.setCurrentNumber(5);

        int expected = 5;

        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldIncreaseNumber() {
        Radio rad = new Radio();
        rad.setCurrentNumber(9);

        rad.increaseNumber();

        int expected = 1;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseNumber() {
        Radio rad = new Radio();
        rad.setCurrentNumber(1);

        rad.decreaseNumber();

        int expected = 9;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolume() {

        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseVolume();


        int expected = 10;

        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldDecreaseVolume() {

        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseVolume();


        int expected = 0;

        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
}
