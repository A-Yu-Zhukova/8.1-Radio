package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @org.junit.jupiter.api.Test
    void NonExistentRadioStation() {
        Radio radio = new Radio(20);
        int currentRadioStationNumber = 25;
        int expectedRadioStationNumber = 19;
        radio.SetCurrentRadioStationNumber(expectedRadioStationNumber);

        radio.SetCurrentRadioStationNumber(currentRadioStationNumber);
        int actualRadioStationNumber = radio.getCurrentRadioStationNumber();
        assertEquals(actualRadioStationNumber, expectedRadioStationNumber);
    }

    @org.junit.jupiter.api.Test
    void shouldTurnMaxRadioStationWithParameter() {
        Radio radio = new Radio(18);
        int currentRadioStationNumber = 17;
        int expectedRadioStationNumber =17;
        radio.SetCurrentRadioStationNumber(expectedRadioStationNumber);

        radio.SetCurrentRadioStationNumber(currentRadioStationNumber);
        int actualRadioStationNumber = radio.getCurrentRadioStationNumber();
        assertEquals(actualRadioStationNumber, expectedRadioStationNumber);
    }

    @org.junit.jupiter.api.Test
    void IncreaseMaxCurrentRadioStationNumberWithoutParameter() {
        Radio radio = new Radio();
        int currentRadioStationNumber = 9;
        int expectedRadioStationNumber = 0;

        radio.SetCurrentRadioStationNumber(currentRadioStationNumber);
        radio.increaseCurrentRadioStationNumber();
        int actualRadioStationNumber = radio.getCurrentRadioStationNumber();
        assertEquals(expectedRadioStationNumber, actualRadioStationNumber);
    }

    @org.junit.jupiter.api.Test
    void IncreaseMaxCurrentRadioStationNumberWithParameter() {
        Radio radio = new Radio(15);
        int currentRadioStationNumber = 14;
        int expectedRadioStationNumber = 0;

        radio.SetCurrentRadioStationNumber(currentRadioStationNumber);
        radio.increaseCurrentRadioStationNumber();
        int actualRadioStationNumber = radio.getCurrentRadioStationNumber();
        assertEquals(expectedRadioStationNumber, actualRadioStationNumber);
    }


    @org.junit.jupiter.api.Test
    void DecreaseMinCurrentRadioStationNumberWithoutParameter() {
        Radio radio = new Radio();

        int currentRadioStationNumber = 0;
        int expectedRadioStationNumber = 9;

        radio.SetCurrentRadioStationNumber(currentRadioStationNumber);
        radio.decreaseCurrentRadioStationNumber();
        int actualRadioStationNumber = radio.getCurrentRadioStationNumber();
        assertEquals(expectedRadioStationNumber, actualRadioStationNumber);

    }

    @org.junit.jupiter.api.Test
    void DecreaseMinCurrentRadioStationNumberWithParameter() {
        Radio radio = new Radio(12);

        int currentRadioStationNumber = 0;
        int expectedRadioStationNumber = 11;

        radio.SetCurrentRadioStationNumber(currentRadioStationNumber);
        radio.decreaseCurrentRadioStationNumber();
        int actualRadioStationNumber = radio.getCurrentRadioStationNumber();
        assertEquals(expectedRadioStationNumber, actualRadioStationNumber);

    }

    @org.junit.jupiter.api.Test
    void IncreaseByOneCurrentRadioStationNumberWithoutParameter() {
        Radio radio = new Radio();
        int currentRadioStationNumber = 5;
        int expectedRadioStationNumber = 6;

        radio.SetCurrentRadioStationNumber(currentRadioStationNumber);
        radio.increaseCurrentRadioStationNumber();
        int actualRadioStationNumber = radio.getCurrentRadioStationNumber();
        assertEquals(expectedRadioStationNumber, actualRadioStationNumber);
    }

    @org.junit.jupiter.api.Test
    void IncreaseByOneCurrentRadioStationNumberWithParameter() {
        Radio radio = new Radio(45);
        int currentRadioStationNumber = 37;
        int expectedRadioStationNumber = 38;

        radio.SetCurrentRadioStationNumber(currentRadioStationNumber);
        radio.increaseCurrentRadioStationNumber();
        int actualRadioStationNumber = radio.getCurrentRadioStationNumber();
        assertEquals(expectedRadioStationNumber, actualRadioStationNumber);
    }

    @org.junit.jupiter.api.Test
    void IncreaseVolume() {
        Radio volume = new Radio();

        int currentVolume = 4;
        int expectedVolume = 5;

        volume.SetVolume(currentVolume);
        volume.increaseVolume();
        int actualVolume = volume.getVolume();
        assertEquals(expectedVolume, actualVolume);
    }

    @org.junit.jupiter.api.Test
    void DecreaseVolume() {
        Radio volume = new Radio();

        int currentVolume = 10;
        int expectedVolume = 9;

        volume.SetVolume(currentVolume);
        volume.decreaseVolume();
        int actualVolume = volume.getVolume();
        assertEquals(expectedVolume, actualVolume);
    }

    @org.junit.jupiter.api.Test
    void IncreaseMaxVolume() {
        Radio volume = new Radio();

        int currentVolume = 10;
        int expectedVolume = 10;

        volume.SetVolume(currentVolume);
        volume.increaseVolume();
        int actualVolume = volume.getVolume();
        assertEquals(expectedVolume, actualVolume);
    }

    @org.junit.jupiter.api.Test
    void DecreaseMinVolume() {
        Radio volume = new Radio();

        int currentVolume = 0;
        int expectedVolume = 0;

        volume.SetVolume(currentVolume);
        volume.decreaseVolume();
        int actualVolume = volume.getVolume();
        assertEquals(expectedVolume, actualVolume);
    }
}