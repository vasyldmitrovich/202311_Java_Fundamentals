package com.softserve.edu06.hw.Task1;

public class Main {

    public static void main(String[] args) {
        Bird bird1 = new Kiwi (true,true);
        Bird bird2 = new Eagle (true,true);
        Bird bird3 = new Swallow (true,true);
        Bird bird4 = new Penguin (false,true);
        Bird bird5 = new Penguin (false,true);
        Bird bird6 = new Eagle (true,true);

        Bird[] birds = new Bird[]{
                bird1, bird2, bird3, bird4, bird5, bird6
        };

        for (Bird bird : birds){
            System.out.println(bird.toString());
            System.out.println(bird.fly());
        }
    }
}
