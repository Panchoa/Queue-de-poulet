import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args){

        Ingredient menthe = new Ingredient("Menthe");
        Ingredient glacePilee = new Ingredient("Glace pilée");
        Ingredient limonade = new Ingredient("Limonade");
        Ingredient citronVert = new Ingredient("Citron vert");
        Ingredient orange = new Ingredient("Orange");
        Ingredient grenadine = new Ingredient("Grenadine");

        List<Ingredient> ingredientMojito = new ArrayList<>();
        ingredientMojito.add(menthe);
        ingredientMojito.add(glacePilee);
        ingredientMojito.add(limonade);
        ingredientMojito.add(citronVert);

        List<Ingredient> ingredientSunBeach = new ArrayList<>();
        ingredientSunBeach.add(glacePilee);
        ingredientSunBeach.add(limonade);
        ingredientSunBeach.add(orange);
        ingredientSunBeach.add(grenadine);

        Cocktail mojito = new Cocktail("Mojito", ingredientMojito, 5);
        Cocktail sunOnTheBeach = new Cocktail("Sun on the Beach", ingredientSunBeach, 8);

        Barman barman1 = new Barman(mojito);
        Barman barman2 = new Barman(sunOnTheBeach);

        barman1.start();
        barman2.start();

    }
}
