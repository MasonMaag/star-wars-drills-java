public class Star {
    public static void main(String[] args) {
        String firstName = "Anakin";
        String lastName = "Skywalker";
        double birthYear = 41.9d;
        String home = "Tatooine";
        double height = 6.167979d;
        double weight = 185.188d;

        double purse = 150.0d;
        System.out.println(purse);
        purse = purse - 24.3;
        System.out.println(purse);
        purse = purse - 45;
        System.out.println(purse);
        purse = purse * 2;
        System.out.println(purse);
        purse = purse * .1;
        System.out.println(purse);

        String handleColor = "Black";
        String bladeColor = "Purple";
        //bladeColor = "Blue";

        if (handleColor == "Black" & bladeColor == "Purple")
            System.out.println("This one is mine!");
        else
            System.out.println("Pass!");

        String shipName = "Millennium Falcon";

        if (shipName == "Millennium Falcon")
            System.out.println("Let's go!");
        else
            System.out.println("I better hide somewhere");

        //cantina
        double itemCost = 2;
        boolean isRecommendedItem = true;
        double drinkCost = .2;
        long drinkSize = 32L;

        if (itemCost < 5 && isRecommendedItem) {
            System.out.println("Buying the item");
        }

        if (drinkCost < 1 && drinkSize > 24) {
            System.out.println("Buying the drink");
        }
    }
}


