package com.example.horseRaceEmulatorBeanXml.service;

import com.example.horseRaceEmulatorBeanXml.beans.Horse;

import java.util.List;


public class HorseServiceImpl implements HorseService {
    private List<Horse> horses;

    public HorseServiceImpl(List<Horse> horses) {
        this.horses = horses;
    }

    @Override
    public List<Horse> getHorse() {
        return horses;
    }


    @Override
    public String toString() {
        return "HorseServiceImpl " +
                "horses= " + '\n' + horses;
    }


}
