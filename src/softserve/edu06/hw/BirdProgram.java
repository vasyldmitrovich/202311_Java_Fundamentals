package softserve.edu06.hw;

// Abstract class Bird
abstract class Bird {
    private boolean hasFeathers;
    private boolean laysEggs;

    public Bird(boolean hasFeathers, boolean laysEggs) {
        this.hasFeathers = hasFeathers;
        this.laysEggs = laysEggs;
    }

    public abstract void fly();

    public boolean hasFeathers() {
        return hasFeathers;
    }

    public boolean laysEggs() {
        return laysEggs;
    }
}

// Subclasses: FlyingBird and NonFlyingBird
class FlyingBird extends Bird {
    public FlyingBird(boolean hasFeathers, boolean laysEggs) {
        super(hasFeathers, laysEggs);
    }

    @Override
    public void fly() {
        System.out.println("Flying bird is flying.");
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean hasFeathers, boolean laysEggs) {
        super(hasFeathers, laysEggs);
    }

    @Override
    public void fly() {
        System.out.println("Non-flying bird cannot fly.");
    }
}

// Concrete bird classes
class Eagle extends FlyingBird {
    public Eagle() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is soaring through the sky.");
    }
}

class Swallow extends FlyingBird {
    public Swallow() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Swallow is darting through the air.");
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
        super(true, true);
    }

    @Override
    public void fly() {
        // Penguins cannot fly
        System.out.println("Penguin is a flightless bird.");
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super(true, true);
    }

    @Override
    public void fly() {
        // Kiwis cannot fly
        System.out.println("Kiwi is a flightless bird.");
    }
}

// Main class
public class BirdProgram {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            System.out.println("Bird Information:");
            System.out.println("Feathers: " + bird.hasFeathers());
            System.out.println("Lays Eggs: " + bird.laysEggs());
            bird.fly();
            System.out.println();
        }
    }
}
