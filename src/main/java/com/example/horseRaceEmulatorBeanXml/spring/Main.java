package com.example.horseRaceEmulatorBeanXml.spring;

import com.example.horseRaceEmulatorBeanXml.beans.Horse;
import com.example.horseRaceEmulatorBeanXml.service.EmulationService;
import com.example.horseRaceEmulatorBeanXml.service.EmulationServiceImpl;
import com.example.horseRaceEmulatorBeanXml.service.HorseServiceImpl;
import com.example.horseRaceEmulatorBeanXml.service.RaceService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HorseServiceImpl horseService = context.getBean("horseService", HorseServiceImpl.class);
        System.out.print("All Horses    \n" + horseService);
        RaceService raceService = context.getBean("raceService", RaceService.class);
        System.out.println("All Horses Members and Race Parameters  \n" + raceService.getRace());
        EmulationService emulationService = new EmulationServiceImpl();
        List<Horse> horse = emulationService.getHorse(horseService.getHorse());
        System.out.println("WINNER Horse  \n" + horse);
    }
}
