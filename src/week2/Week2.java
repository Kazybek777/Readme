package week2;

public class Week2 {

    public static void main(String[] args) {


        User user = new User("Kazy ", 20);

        System.out.print(user.getName() + user.getAge());
        user.setAge(15);
        System.out.println(user.getAge());

        System.out.println(user.getAge());


        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();


        Dog myDog = new Dog();

        myDog.eat();
        myDog.sound();



        Animal animal = new Dog();

        animal.sound();
    }
}


class User {

    private final String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            this.age = age;

    }
}


abstract class Animal {

    public abstract void sound();

    public void eat() {
        System.out.println("Животное ест");
    }
}



class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Гав");
    }
}


class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Мяу");
    }
}
