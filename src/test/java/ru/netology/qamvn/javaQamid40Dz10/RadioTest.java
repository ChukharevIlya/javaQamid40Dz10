package ru.netology.qamvn.javaQamid40Dz10;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // тестируем, чтобы выбрать можно было любую станцию
    @Test
    public void shouldSetRandomStationIfBetweenMinAndMax() {
        Radio radio = new Radio();

        radio.setRadioStation(5);

        int expected = 5;
        int actual = radio.getСurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // чтобы выбрать макисмальную станцию
    @Test
    public void shouldSetStationIfMax() {
        Radio radio = new Radio();

        radio.setRadioStation(9);

        int expected = 9;
        int actual = radio.getСurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // выбрать минимальную станцию
    @Test
    public void shouldSetStationIfMin() {
        Radio radio = new Radio();

        radio.setRadioStation(0);

        int expected = 0;
        int actual = radio.getСurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // нельзя выбрать станцию выше макс
    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();

        radio.setRadioStation(10);

        int expected = 0;
        int actual = radio.getСurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // нельзя выбрать станцию ниже мин
    @Test
    public void shouldSetStationBelowMin() {
        Radio radio = new Radio();

        radio.setRadioStation(-1);

        int expected = 0;
        int actual = radio.getСurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    // тестрируем, чтобы после next переключилось с максимального на минимальное
    @Test
    public void shouldIncreaseRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(9);
        radio.increaseRadioStation();

        int expected = 0;
        int actual = radio.getСurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // тестрируем, чтобы после next переключилось на станцию выше
    @Test
    public void shouldIncreaseRadioStationIfCurrentIsMin() {
        Radio radio = new Radio();

        radio.setRadioStation(0);
        radio.increaseRadioStation();

        int expected = 1;
        int actual = radio.getСurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // тестрируем, чтобы после prev переключилось на станцию вниз
    @Test
    public void shouldDecreaseRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(7);
        radio.decreaseRadioStation();

        int expected = 6;
        int actual = radio.getСurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // тестрируем, чтобы после prev переключилось с минимального на максимальное
    @Test
    public void shouldSetToMaxStationAfterMinStation() {
        Radio radio = new Radio();

        radio.setRadioStation(0);
        radio.decreaseRadioStation();

        int expected = 9;
        int actual = radio.getСurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // ТЕСТИРУЕМ ВСЕ, ЧТО СО ЗВУКОМ

    //должна включаться любая громкость
    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        int expeсted = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expeсted, actual);
    }

    // включается сразу макс
    @Test
    public void shouldSetVolumeOnMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expeсted = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expeсted, actual);
    }
    // включается сразу мин
    @Test
    public void shouldSetVolumeOnMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expeсted = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expeсted, actual);
    }

    // нельзя громче макс
    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expeсted = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expeсted, actual);
    }

    // нельзя ниже мин
    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expeсted = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expeсted, actual);
    }

    // громкость должна увеличиваться
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // громкость не можеть стать выше максимума
    @Test
    public void shouldStopIncreaseVolumeOn10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // громкость уменьшается
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // громкость не может уменьшиться ниже минимального
    @Test
    public void shouldStopDecreaseVolumeOn0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
