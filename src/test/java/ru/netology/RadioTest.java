package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
public void shouldUseConstructor() {
       Radio radio = new Radio(
        100,
        1,
        100,
        0,
        10,
        0
        );
        assertEquals(100, radio.getCurrentVolume());
        }

@Test
public void shouldUseNoArgsConstructor() {
        Radio radio = new Radio();
        assertEquals(22, radio.getCurrentVolume());
        }

    @Test
    void setStation() {
        Radio volna = new Radio();
        volna.setCurrentStation(0);
        assertEquals(0, volna.getCurrentStation());
    }

    @Test
    void setStationHigherMax() {
        Radio volna = new Radio();
        volna.setCurrentStation(15);
        assertEquals(0, volna.getCurrentStation());
    }

    @Test
    void setStationLowerMin() {
        Radio volna = new Radio();
        volna.setCurrentStation(-5);
        assertEquals(0, volna.getCurrentStation());
    }

    @Test
    void switchToNext() {
        Radio volna = new Radio();
        volna.setCurrentStation(3);
        volna.switchStationNext();
        assertEquals(4, volna.getCurrentStation());
    }

    @Test
    void switchToPrev() {
        Radio volna = new Radio();
        volna.setCurrentStation(9);
        volna.switchStationPrev();
        assertEquals(8, volna.getCurrentStation());
    }

    @Test
    void switchToNextLoop() {
        Radio volna = new Radio();
        volna.setCurrentStation(10);
        volna.switchStationNext();
        assertEquals(0, volna.getCurrentStation());
    }

    @Test
    void switchToPrevLoop() {
        Radio volna = new Radio();
        volna.setCurrentStation(0);
        volna.switchStationPrev();
        assertEquals(10, volna.getCurrentStation());
    }

    @Test
    void borderStationMax() {
        Radio volna = new Radio();
        volna.setCurrentStation(8);
        volna.switchStationNext();
        assertEquals(9, volna.getCurrentStation());
    }

    @Test
    void borderStationMin() {
        Radio volna = new Radio();
        volna.setCurrentStation(1);
        volna.switchStationPrev();
        assertEquals(0, volna.getCurrentStation());
    }

    @Test
    void setVolume() {
        Radio volna = new Radio();
        volna.setCurrentVolume(1);
        assertEquals(1, volna.getCurrentVolume());
    }

    @Test
    void setVolumeNormal() {
        Radio volna = new Radio();
        volna.setCurrentVolume(100);
        assertEquals(100, volna.getCurrentVolume());
    }

    @Test
    void setVolumeHigh() {
        Radio volna = new Radio();
        volna.setCurrentVolume(101);
        assertEquals(22, volna.getCurrentVolume());
    }
    @Test
    void setVolumeLow() {
        Radio volna = new Radio();
        volna.setCurrentVolume(-1);
        assertEquals(22, volna.getCurrentVolume());
    }

    @Test
    void switchVolumeUp() {
        Radio volna = new Radio();
        volna.setCurrentVolume(8);
        volna.volumeUp();
        assertEquals(9, volna.getCurrentVolume());
    }

    @Test
    void switchVolumeDown() {
        Radio volna = new Radio();
        volna.setCurrentVolume(8);
        volna.volumeDown();
        assertEquals(7, volna.getCurrentVolume());
    }


    @Test
    void borderVolumeMax() {
        Radio volna = new Radio();
        volna.setCurrentVolume(9);
        volna.volumeUp();
        assertEquals(10, volna.getCurrentVolume());
    }

    @Test
    void borderVolumeMin() {
        Radio volna = new Radio();
        volna.setCurrentVolume(1);
        volna.volumeDown();
        assertEquals(0, volna.getCurrentVolume());
    }

    @Test
    void switchToNextVolumeLoop() {
        Radio volna = new Radio();
        volna.setCurrentVolume(100);
        volna.volumeUp();
        assertEquals(0, volna.getCurrentVolume());
    }

    @Test
    void switchToPrevVolumeLoop() {
        Radio volna = new Radio();
        volna.setCurrentVolume(0);
        volna.volumeDown();
        assertEquals(100, volna.getCurrentVolume());
    }

    @Test
    void setVolumeHigherMax() {
        Radio volna = new Radio();
        volna.setCurrentVolume(15);
        volna.volumeUp();
        assertEquals(0, volna.getCurrentStation());
    }
    @Test
    void setVolumeLowerMin() {
        Radio volna = new Radio();
        volna.setCurrentVolume(-7);
        volna.volumeDown();
        assertEquals(0, volna.getCurrentStation());
    }
}
