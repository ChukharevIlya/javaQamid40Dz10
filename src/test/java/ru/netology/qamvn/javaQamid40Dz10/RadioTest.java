package ru.netology.qamvn.javaQamid40Dz10;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetMaxRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(9);

        int expected = 9;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(0);

        int expexted = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldNotSetRadioStationIfAboveMax() {
        Radio radio = new Radio();

        radio.setRadioStation(12);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationIfBelowMin() {
        Radio radio = new Radio();

        radio.setRadioStation(-1);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnToMinStationAfterMaxStation() {
        Radio radio = new Radio();

        radio.setRadioStation(9);
        radio.increaseRadioStation();

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(0);
        radio.increaseRadioStation();

        int expected = 1;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStationAfterMinStation() {
        Radio radio = new Radio();

        radio.setRadioStation(0);
        radio.decreaseRadioStation();

        int expected = 9;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(8);
        radio.decreaseRadioStation();

        int expected = 7;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRandomRadioStation() {
        Radio radio = new Radio();

        radio.setRandomRadioStation(3);

        int expected = 3;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRandomRadioStationIfAboveMax() {
        Radio radio = new Radio();

        radio.setRandomRadioStation(10);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRandomRadioStationIfBelowMin() {
        Radio radio = new Radio();

        radio.setRandomRadioStation(-1);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setVolume(10);

        int expexted = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldNotSetVolumeIfAboveMax() {
        Radio radio = new Radio();

        radio.setVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeIfBelowMin() {
        Radio radio = new Radio();

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStopIncreaseVolumeOn10() {
        Radio radio = new Radio();

        radio.setVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(1);
        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStopDecreaseVolumeOn0() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(5);
        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
