package lesson_9;

public class Animal {
    protected String name;
    protected static int cnt = 0;

    public Animal(String name) {
        this.name = name;
        cnt++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал(а) " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл(а) " + distance + " м.");
    }
}

class Dog extends Animal {
    private static final int MAX_RUN = 500;
    private static final int MAX_SWIM = 10;
    protected static int dogCnt = 0;

    public Dog(String name) {
        super(name);
        dogCnt++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM) {
            System.out.println(name + " проплыл(а) " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }
}

class Cat extends Animal {
    private static final int MAX_RUN = 200;
    protected static int catCnt = 0;

    public Cat(String name) {
        super(name);
        catCnt++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
}

class Plate {
    private int food;

    public Plate(int food) {
        this.food = Math.max(food, 0);
    }

    public boolean minusFood(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int amount) {
        food += amount;
        System.out.println("Добавлено " + amount + " еды в тарелку.");
    }

    public int getFood() {
        return food;
    }
}

class CatFeeder extends Cat {
    private boolean isFull;

    public CatFeeder(String name) {
        super(name);
        this.isFull = false;
    }

    public void eat(Plate plate, int foodAmount) {
        if (plate.minusFood(foodAmount)) {
            isFull = true;
            System.out.println(name + " сыт.");
        } else {
            System.out.println(name + " не достаточно еды");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog1");
        Cat cat1 = new Cat("Cat1");

        dog1.run(300);
        dog1.swim(1);

        cat1.run(200);
        cat1.swim(5);

        System.out.println("\nВсего животных: " + Animal.cnt);
        System.out.println("Котов: " + Cat.catCnt);
        System.out.println("Собак: " + Dog.dogCnt);

        Plate plate = new Plate(50);
        CatFeeder[] cats = {
                new CatFeeder("Cat1"),
                new CatFeeder("Cat2"),
                new CatFeeder("Cat3")
        };

        for (CatFeeder cat : cats) {
            cat.eat(plate, 10);
        }

        System.out.println("\nЕды осталось: " + plate.getFood());

        for (CatFeeder cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }

        plate.addFood(20);
        System.out.println("Еды теперь: " + plate.getFood());
    }
}

