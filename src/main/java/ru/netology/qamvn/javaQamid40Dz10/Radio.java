package ru.netology.qamvn.javaQamid40Dz10;

public class Radio {

    private int currentVolume;
    private int currentRadioStation;
    
    // гетер станции
    public int getСurrentRadioStation() {
        return currentRadioStation;
    }

    // сеттер для выставления любой радиостаници
    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation > 9) {
            return;
        }
        currentRadioStation = newRadioStation;
    }

    // гетер громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    // сеттер громкости для получения любого значения в рамках дозволеного
    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        currentVolume = newVolume;
    }

    // Кнопка next
    public void increaseRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
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

    // кнопка "+" на звуке
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    // кнопка "-" на звуке
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
