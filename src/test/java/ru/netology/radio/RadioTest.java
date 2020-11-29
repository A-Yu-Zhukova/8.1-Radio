package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @org.junit.jupiter.api.Test
    void VonExistentRadioStation() {
        Radio radio = new Radio();
        int currentRadioStationNumber = 11;
        int expectedRadioStationNumber = 9;
        radio.SetCurrentRadioStationNumber(expectedRadioStationNumber);

        radio.SetCurrentRadioStationNumber(currentRadioStationNumber);
        int actualRadioStationNumber = radio.getCurrentRadioStationNumber();
        assertEquals(actualRadioStationNumber, expectedRadioStationNumber);

    }

    @org.junit.jupiter.api.Test
    void IncreaseCurrentRadioStationNumber() {
        Radio radio = new Radio();
        int currentRadioStationNumber = 9;
        int expectedRadioStationNumber = 0;

        radio.SetCurrentRadioStationNumber(currentRadioStationNumber);
        radio.IncreaseCurrentRadioStationNumber();
        int actualRadioStationNumber = radio.getCurrentRadioStationNumber();
        assertEquals(expectedRadioStationNumber, actualRadioStationNumber);
    }

    @org.junit.jupiter.api.Test
    void DecreaseCurrentRadioStationNumber() {
        Radio radio = new Radio();

        int currentRadioStationNumber = 0;
        int expectedRadioStationNumber = 9;

        radio.SetCurrentRadioStationNumber(currentRadioStationNumber);
        radio.DecreaseCurrentRadioStationNumber();
        int actualRadioStationNumber = radio.getCurrentRadioStationNumber();
        assertEquals(expectedRadioStationNumber, actualRadioStationNumber);

    }

    @org.junit.jupiter.api.Test
    void IncreaseVolume() {
        Radio volume = new Radio();

        int currentVolume = 5;
        int expectedVolume = 6;

        volume.SetVolume(currentVolume);
        volume.IncreaseVolume();
        int actualVolume = volume.getVolume();
        assertEquals(expectedVolume, actualVolume);
    }

    @org.junit.jupiter.api.Test
    void DecreaseVolume() {
        Radio volume = new Radio();

        int currentVolume = 10;
        int expectedVolume = 9;

        volume.SetVolume(currentVolume);
        volume.DecreaseVolume();
        int actualVolume = volume.getVolume();
        assertEquals(expectedVolume, actualVolume);
    }
}
