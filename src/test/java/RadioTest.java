import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void shouldSetNumber() {

        Radio rad = new Radio();
        rad.setCurrentNumber(1);

        int expected = 1;

        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetNumber1() {

        Radio rad = new Radio();
        rad.setCurrentNumber(0);

        int expected = 0;

        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetNumber2() {

        Radio rad = new Radio();
        rad.setCurrentNumber(15);

        int expected = 0;

        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldIncreaseNumber() {
        Radio rad = new Radio();
        rad.setCurrentNumber(10);

        rad.increaseNumber();

        int expected = 1;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldIncreaseNumber2() {
        Radio rad = new Radio();
        rad.setCurrentNumber(1);

        rad.increaseNumber();

        int expected = 2;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldIncreaseNumber3() {
        Radio rad = new Radio();
        rad.setCurrentNumber(0);

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

    public void shouldDecreaseNumber1() {
        Radio rad = new Radio();
        rad.setCurrentNumber(112);

        rad.decreaseNumber();

        int expected = 9;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldIncreaseVolume() {

        Radio rad = new Radio();
        rad.setCurrentVolume(11);

        rad.increaseVolume();


        int expected = 10;

        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldIncreaseVolume1() {

        Radio rad = new Radio();
        rad.setCurrentVolume(8);

        rad.increaseVolume();


        int expected = 9;

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
