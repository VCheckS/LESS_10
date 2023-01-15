

public class Radio {

    public int currentNumber;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber > 9) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void increaseNumber() {
        int target = currentNumber + 1;
        currentNumber = target;
        if (currentNumber < 9) {
            currentNumber = currentNumber + 1;
        }
        if (currentNumber > 9) {
            currentNumber = 1;
        }
    }

    public void decreaseNumber() {
        int target2 = currentNumber - 1;
        setCurrentNumber(target2);
        if (currentNumber < 9) {
            currentNumber = target2;
        }
        if (currentNumber <= 0) {
            currentNumber = 9;
        }
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }
}