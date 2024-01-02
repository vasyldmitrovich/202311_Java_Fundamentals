package com.softserve.edu6.pt;

public class pt2 {
    public static void main(String[] args) {
        Car[] car = {new Truck(120, 1978, 20),
                new Sedan(250, 2023, "A"),
                new Sedan(300, 2021, "B"),
        };

        car[2].run();
        car[0].run();
        car[0].stop();

        for (Car currentCar : car) {
            System.out.println(currentCar.toString());
        }

    }


}
