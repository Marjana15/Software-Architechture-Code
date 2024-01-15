class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Duck extends Bird {
    @Override
    void fly() {
        System.out.println("Duck is flying");
    }
}

class Ostrich extends Bird {
    @Override
    void fly() {
        System.out.println("Ostrich cannot fly");
    }
}

public class Liskov {
    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        Ostrich ostrich = new Ostrich();

        makeBirdFly(duck);  // Outputs: duck is flying
        makeBirdFly(ostrich);  // Outputs: ostrich cannot fly
    }
}
