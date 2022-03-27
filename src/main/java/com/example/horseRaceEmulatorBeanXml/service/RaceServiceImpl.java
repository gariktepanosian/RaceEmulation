package com.example.horseRaceEmulatorBeanXml.service;

import com.example.horseRaceEmulatorBeanXml.beans.Race;

import java.time.LocalDate;


public class RaceServiceImpl implements RaceService {
    private HorseService horseService;

    public RaceServiceImpl(HorseService horseService) {
        this.horseService = horseService;
    }

    public RaceServiceImpl() {
    }

    @Override
    public Race getRace() {
        Race race = new Race();
        race.setHorseList(horseService.getHorse());
        race.setLength(10);
        race.setDate(LocalDate.of(2022, 6, 10));
        return race;
    }

    public HorseService getHorseService() {
        return horseService;
    }

    public void setHorseService(HorseService horseService) {
        this.horseService = horseService;
    }

    @Override
    public String toString() {
        return "RaceServiceImpl{" +
                "horseService=" + horseService +
                '}';
    }
}
