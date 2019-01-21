public class Main {

    public static void main(String[] args) {

        Ingredient menthe = new Ingredient("Menthe");
        Ingredient glacePilee = new Ingredient("Glace pilée");
        Ingredient limonade = new Ingredient("Limonade");
        Ingredient citronVert = new Ingredient("Citron vert");
        Ingredient orange = new Ingredient("Orange");
        Ingredient grenadine = new Ingredient("Grenadine");

        Ingredient[] ingredientsMojito = {menthe, glacePilee, limonade, citronVert};
        Ingredient[] ingredientsSunBeach = {orange, grenadine, glacePilee, limonade};

        Cocktail mojito = new Cocktail("Mojito", ingredientsMojito, 5);
        Cocktail sunOnTheBeach = new Cocktail("Sun on the Beach", ingredientsSunBeach, 5);

        Barman barman1 = new Barman("François", mojito);
        Barman barman2 = new Barman("Tristan", sunOnTheBeach);

        barman1.start();
        barman2.start();

    }
}
