import java.util.Scanner;

void main() {
    Scanner in = new Scanner(System.in);

//    User user = new User(2, "sss");
//    user.setName("Tom");
//    System.out.println(user.getName());
//
//    System.out.print("input name: ");
//    user.setName(in.nextLine());
//    System.out.print("Input num: ");
//    var num  = in.nextInt();
//    System.out.println("Your number: "+ num);
//    System.out.println(user.getName());


//    for (var i = 0; i < num; i++){
//        if (i % 2 != 0){
//            System.out.println(i * i);
//        }
//    }
//    System.out.print("Введите х: ");
//    var x = in.nextInt();
//    System.out.print("Введите y:");
//    var y = in.nextFloat();
//
//    if (x > 0 && y > 0){
//        var r = 0.5;
//        System.out.println(x * y + " Your area of the square");
//        System.out.println(r * x * y + "area of a triangle\n");
//
//    }
    for (var i = 1; i <= 9; i++){
        for (var s = 1; s <= 9; s++){

            System.out.print( s + " * " + i + " =" +i * s );
            System.out.print("\t");
        }
        System.out.println();


    }
    String arr = "Понравилось. Лежит теперь в любимом. Но дифирамбы петь не буду. Ведь то что я увидел, развидеть я уже не смогу";
    System.out.println(arr.length());
}