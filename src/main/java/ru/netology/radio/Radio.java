package ru.netology.radio;

public class Radio {
    public int currentRadioStationNumber;
    public int volume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void SetCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber > 9) {
            return;
        }
        if (currentRadioStationNumber < 0) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void SetVolume(int volume) {
        if (volume > 10) {
            return;
        }
        if (volume < 0) {
            return;
        }
        this.volume = volume;
    }

        public void IncreaseCurrentRadioStationNumber() {
            currentRadioStationNumber++;
            if (currentRadioStationNumber > 9) {
                currentRadioStationNumber = 0;
            }
        }

        public void DecreaseCurrentRadioStationNumber() {
            currentRadioStationNumber--;
            if (currentRadioStationNumber < 0) {
                currentRadioStationNumber = 9;
            }
        }

        public void IncreaseVolume() {
            volume++;
            if (volume > 10) {
                volume = 10;
            }
        }

        public void DecreaseVolume() {
            volume--;
            if (volume < 0) {
                volume = 0;
            }
        }
}



