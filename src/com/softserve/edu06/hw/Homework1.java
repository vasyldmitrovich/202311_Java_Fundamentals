package com.softserve.edu06.hw;

import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        // array containing names of various eagles, ostriches, swallows and penguins
        String[] birdNames = {"Bald eagle", "Golden eagle", "Harpy eagle", "White-tailed eagle", "Sea eagle", "Phillippine eagle", "Crowned eagle", "Black eagle",
                "Barn swallow", "Purple martin", "Tree swallow", "Hirundininae", "Sand martin", "Cliff swallow", "Chilean swallow",
                "Common ostrich", "Masai ostrich", "Southern ostrich", "Somali ostrich", "North African ostrich",
                "King penguin", "Gentoo penguin", "Crested penguin", "Emperor penguin", "Chinstrap penguin"};

        // the program selects a name from the birdNames array randomly.
        // In order to implement this random logic we first create an array of ints.
        // ints are used to ensure that there are no identical names in the array
        int[] randomGuesses = createArrayOfRandomNumbers(birdNames);

        Bird[] birds = createBirds(randomGuesses, birdNames);

        FlyingBird fb = new FlyingBird();
        NonFlyingBird nfb = new NonFlyingBird();

        for( Bird bd : birds ) {
            if( bd.getClass() == Eagle.class ) {
                System.out.println(bd);
                System.out.println("This bird flies = " + fb.fly());
            } else if( bd.getClass() == Swallow.class) {
                System.out.println(bd);
                System.out.println("This bird flies = " + fb.fly());
            } else if( bd.getClass() == Penguin.class) {
                System.out.println(bd);
                System.out.println("This bird flies = " + nfb.fly());
            } else {
                System.out.println(bd);
                System.out.println("This bird flies = " + nfb.fly());
            }
        }
    }

    static int[] createArrayOfRandomNumbers (String[] birdNames ) {
        int[] randomGuesses = new int[10]; // we need this array to check whether the random generator had already selected the number
        Random r = new Random();

        randomGuesses[0] = r.nextInt(birdNames.length - 1);
        for (int i = 1; i < randomGuesses.length; i++) {
            int ix = r.nextInt(birdNames.length - 1);

            boolean numAlreadySelected = false;
            for (int j = 0; j < i; j++) {
                if( randomGuesses[j] == ix ) {
                    numAlreadySelected = true;
                    break;
                }
            }
            if(numAlreadySelected) {
                i--;
            } else {
                randomGuesses[i] = ix;
            }
        }
        return randomGuesses;
    }
    static Bird[] createBirds(int[] randomGuesses, String[] birdNames) {
        Bird[] birds = new Bird[10];

        for (int j = 0; j < birds.length; j++) {
            int ix = randomGuesses[j];  // get an int from the randomly prepared array of ints
            String thisBird = birdNames[ix];  // get a bird from the array of birds. The name is located at the randomly selected index

            String lastLetter = "";  // take three last letters from the bird name to identify which bird to create

            for (int i = 3; i > 0; i--) {
                lastLetter = lastLetter + thisBird.toString().charAt(thisBird.length() - i);
            }

            if( lastLetter.equals("gle") ) {
                birds[j] = new Eagle(thisBird);
            } else if (lastLetter.equals("ich"))  {
                birds[j]= new Kiwi(thisBird);
            } else if ( lastLetter.equals("uin") ) {
                birds[j] =new Penguin(thisBird);
            } else {
                birds[j] = new Swallow(thisBird);
            }
        }
        return birds;
    }
}

abstract class Bird {
    String name;
    final boolean LAY_EGGS = true;  // eagles, swallows, ostriches and penguins all lay eggs
    final boolean FEATHERS = true; // eagles, swallows, ostriches and penguins all have feathers

    abstract boolean fly();

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", LAY_EGGS=" + LAY_EGGS +
                ", FEATHERS=" + FEATHERS +
                '}';
    }
}


class FlyingBird extends Bird {
    @Override
    boolean fly() {
        return true;
    }
}
class NonFlyingBird extends Bird {
    @Override
    boolean fly() {
        return false;
    }
}
class Eagle extends FlyingBird {
    public Eagle(String name) {
        this.name = name;
    }

    @Override
    boolean fly() {
        return super.fly();
    }
}
class Swallow extends FlyingBird {
    public Swallow(String name) {
        this.name = name;
    }

    @Override
    boolean fly() {
        return super.fly();
    }
}
class Penguin extends NonFlyingBird {
    public Penguin(String name) {
        this.name = name;
    }

    @Override
    boolean fly() {
        return super.fly();
    }
}
class Kiwi extends NonFlyingBird {
    public Kiwi(String name) {
        this.name = name;
    }

    @Override
    boolean fly() {
        return super.fly();
    }
}

