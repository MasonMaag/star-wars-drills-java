public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz100();
//        fizzBuzzSwitch();
    }

    private static void fizzBuzz100() {
        for (int i = 1; i <= 100; i++) {

            if (((i % 5) == 0) && ((i % 3) == 0)) {
                System.out.println("fizzbuzz");
            } else if ((i % 3) == 0) {
                System.out.println("fizz");
            } else if ((i % 5) == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
//    private static void fizzBuzzSwitch() {
//        for (int i = 1; i <= 100; i++)
//
//        switch (i) {
//
//            }
//        }
//    }

//    int age;
//        age = 3;

//case 1:
//        System.out.println("You can crawl");
//        break;
//        case 2:
//        System.out.println("You can talk");
//        break;
//        case 3:
//        System.out.println("You can get in trouble");
//        break;
//default:
//        System.out.println("I dont know how old you are");
//        break;