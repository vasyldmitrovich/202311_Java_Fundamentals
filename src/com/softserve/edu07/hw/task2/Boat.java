package com.softserve.edu07.hw.task2;

public class Boat extends WaterVehicle {
    int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.print("The boat ");
        super.isSailing();
    }
}

