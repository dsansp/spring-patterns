package com.example.springpatterns.behavioral.observer;

import com.example.springpatterns.behavioral.observer.*;
import com.example.springpatterns.patterns.behavioral.observer.Computer;
import com.example.springpatterns.patterns.behavioral.observer.Weather;
import com.example.springpatterns.patterns.behavioral.observer.WeatherObserver;
import com.example.springpatterns.patterns.behavioral.observer.WeatherType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ComputerTest {



    @BeforeEach
    void setUp() {
        System.out.println("Iniciando test de Computer");
    }


    @AfterEach
    void tearDown() {
        System.out.println("Finalizando test de Computer");
    }

    @Test
    void updateTest() {
        WeatherObserver computer = new Computer();
        Weather weather = new Weather();
        computer.update(WeatherType.SUNNY);
        weather.addObserver(computer);
        computer.update(WeatherType.CLOUDY);
        assertNotNull(WeatherType.CLOUDY,"Computer has been notified of weather change: " );

    }

}
