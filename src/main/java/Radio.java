public class Radio {

    private int currentNumber;
    private int currentVolume;
    private int maxStation;


    public Radio() {
        maxStation = 9;
    }

    public void increaseNumber() {
        if (currentNumber != maxStation) {
            currentNumber++;
        } else {
            currentNumber = 0;
        }
    }

    public void decreaseNumber() {

        if (currentNumber != 0) {
            currentNumber--;
        } else currentNumber = maxStation;
    }

    public void increaseVolume() {
        if (currentVolume != 10) {
            currentVolume++;
        } else currentVolume = 10;
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else currentVolume = 0;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentNumber() {

        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < 0) {
            return;
        }
        if (currentNumber > maxStation) {
            return;
        }
        this.currentNumber = currentNumber;
    }


}