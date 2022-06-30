import java.util.Arrays;

public class Part5Functions {
    public static void main(String[] args) {
        helloWorld();
        greeting("Tim");

        int num4 = add(3, 6);
        System.out.println(num4);

        String color = favColorFinder("green");
        System.out.println(color);

        String num6 = thatsOdd(2);
        System.out.println(num6);

        String num7 = Arrays.toString(bigOrSmall(new int[]{100,50,110,70}));
        System.out.println(num7);
    }

    private static void helloWorld() {
        System.out.println("Hello World!");
    }

    private static void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    private static int add(int num1, int num2) {
        return num1 + num2;
    }

    private static String favColorFinder(String color) {
        if (color.equals("red")) {
            return "red is a great color";
        } else if (color.equals("green")) {
            return "green is a solid favorite color";
        } else if (color.equals("black")) {
            return "so trendy";
        } else {
            return "you need to evaluate your favorite color choice";
        }
    }

    private static String thatsOdd(int num5) {
        if (num5 % 2 == 0) {
            return "That's not odd!";
        } else {
            return "That is odd indeed!";
        }
    }

    private static String[] bigOrSmall(int[] arr) {
        String[] answers = new String[arr.length];

        for (int i = 0; i < answers.length; i++) {
            if (arr[i] > 100) { answers[i] = "big";
            } else { answers[i] = "small";
            }
        }

        return answers;
    }
}
