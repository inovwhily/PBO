public class Polymorphism {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[3];

        fruits[0] = new Apple();
        fruits[1] = new Banana();
        fruits[2] = new Orange();

        for (Fruit fruit : fruits) {
            fruit.enjoy();
        }
    }
}

class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public void enjoy() {
        System.out.println("Savoring the goodness of " + name);
    }
}

class Apple extends Fruit {
    public Apple() {
        super("Apple");
    }

    public void enjoy() {
        System.out.println("Taking a delightful bite of an apple");
    }
}

class Banana extends Fruit {
    public Banana() {
        super("Banana");
    }

    public void enjoy() {
        System.out.println("Peeling and relishing the taste of a banana");
    }
}

class Orange extends Fruit {
    public Orange() {
        super("Orange");
    }

    public void enjoy() {
        System.out.println("Peeling and savoring the juiciness of an orange");
    }
}
