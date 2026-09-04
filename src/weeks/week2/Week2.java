package weeks.week2;

public class Week2 {

    public static void main(String[] args) {


        User user = new User("Kazy ", 20);

        System.out.print(user.getName() + user.getAge());
        user.setAge(15);
        System.out.println("\n" + user.getAge());


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