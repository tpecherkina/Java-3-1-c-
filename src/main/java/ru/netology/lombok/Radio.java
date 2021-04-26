package ru.netology.lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Radio {
    private int currentVolume=22;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxStation = 10;
    private int minStation = 0;

    public Radio(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void switchStationNext() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        } else {
            currentStation++;
        }
    }

    public void switchStationPrev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation -= 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeUp() {
        if (currentVolume == maxVolume) {
            currentVolume = minVolume;
            return;
        } else {
            currentVolume++;
        }
    }

        public void volumeDown() {
            if (currentVolume == minVolume) {
                currentVolume = maxVolume;
                return;
            } else {
                currentVolume--;
            }

        }
    }
