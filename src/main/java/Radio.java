public class Radio {

    public int currentNumber;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void increaseNumber() {
        int target = currentNumber + 1;
        currentNumber = target;
        if (currentNumber > 9) {
            currentNumber = 1;
        }
    }

    public void decreaseNumber() {

        if (currentNumber < 9) {
            currentNumber = currentNumber - 1;
        }
        if (currentNumber < 1) {
            currentNumber = 9;
        }


    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 1) {
            newCurrentNumber =1;
        }
        if (newCurrentNumber > 9) {
            newCurrentNumber = 9;
        }
        currentNumber = newCurrentNumber;
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
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
        if (currentVolume < 1) {
            currentVolume = 0;
        }
    }
}