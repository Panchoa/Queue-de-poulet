import java.util.List;

public class Cocktail {

    private Ingredient[] ingredients;
    private String nomCocktail;
    private int preparationTime;

    protected Cocktail(String nomCocktail, Ingredient listeIngredient[], int preparationTime){
        this.nomCocktail = nomCocktail;
        ingredients = listeIngredient;
        this.preparationTime = preparationTime;
    }

    public Ingredient[] getIngredients(){
        return ingredients;
    }

    public int getPreparationTime(){
        return preparationTime;
    }

    public String getNomCocktail(){
        return nomCocktail;
    }
}
