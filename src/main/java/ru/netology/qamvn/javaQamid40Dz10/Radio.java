package ru.netology.qamvn.javaQamid40Dz10;

public class Radio {

    public int currentVolume;
    public int currentRadioStation;

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
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    // Кнопка prev
    public void decreaseRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }

    // выставление любой радиостаници
    public void setRandomRadioStation(int randomRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
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
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            currentVolume = 10;
        }
    }

    // нажатие кнопки "-"
    public void decreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
