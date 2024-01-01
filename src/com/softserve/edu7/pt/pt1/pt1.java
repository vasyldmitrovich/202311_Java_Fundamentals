package com.softserve.edu7.pt.pt1;

public class pt1 {
    public static void main(String[] args) {
        Animal[] animals = {
          new Cat(),
                new Dog(),
        };

        for (var currentAnimal:animals){
            currentAnimal.feed();
            currentAnimal.voice();
        }
    }


}


;

;