public class Radio {
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int currentStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }


    public void increaseNumber() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void decreaseNumber() {

        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentNumber() {

        return currentStation;
    }

    public void setCurrentNumber(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }


}