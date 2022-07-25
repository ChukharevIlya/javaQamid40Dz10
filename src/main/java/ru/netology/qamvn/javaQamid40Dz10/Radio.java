package ru.netology.qamvn.javaQamid40Dz10;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int currentVolume;
    private int currentRadioStation;
    private int stationsCount = 10;

    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
    }
/*
    // конструктор c параметром количество станций
    public Radio() {
        this.stationsCount = 10;
    }
    //конструктор без количества станций
    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
    }
*/
    
    // гетер станции
    public int getСurrentRadioStation() {
        return currentRadioStation;
    }

    // сеттер для выставления любой радиостаници
    public void setRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > stationsCount - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    // гетер громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    // сеттер громкости для получения любого значения в рамках дозволеного
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    // Кнопка next
    public void increaseRadioStation() {
        if (currentRadioStation < stationsCount - 1) {
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
            currentRadioStation = stationsCount - 1;
        }
    }

    // кнопка "+" на звуке
    public void increaseVolume() {
        if (currentVolume < 100) {
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
