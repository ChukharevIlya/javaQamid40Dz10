package ru.netology.qamvn.javaQamid40Dz10;

public class Radio {

    private int currentVolume;
    private int currentRadioStation;

    // Номер текущей радиостанции может принимать значения только в пределах от 0 до 9
    public int getRadioStation() {
        return currentRadioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation > 9) {
            return;
        }
        currentRadioStation = newRadioStation;
    }

    // Кнопка next
    public void increaseRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void returnToMinStationAfterMaxStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    // Кнопка prev
    public void decreaseRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setToMaxStationAfterMinStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    // выставление любой радиостаници
    public void setRandomRadioStation(int randomRadioStation) {
        if (randomRadioStation > 9) {
            return;
        }
        if (randomRadioStation < 0) {
            return;
        }
        currentRadioStation = randomRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука (в пределах от 0 до 10)
    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        currentVolume = newVolume;
    }

    // нажатие кнопки "+"
    public void stopIncreaseVolumeOn10() {
        if (currentVolume == 10) {
            currentVolume = 10;
        }
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    // нажатие кнопки "-"
    public void stopDecreaseVolumeOn0() {
        if (currentVolume == 0) {
            currentVolume = 0;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
