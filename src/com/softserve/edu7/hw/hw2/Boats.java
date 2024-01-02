package com.softserve.edu7.hw.hw2;

class Boats extends WaterVenicle {
    int volume;

    public Boats(int passengers, int volume) {
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
    void isSailing() {
        System.out.println("the boat is sailing");
    }
}
