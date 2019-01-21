import java.util.List;

public class Cocktail {

    private List<Ingredient> ingredients;
    private String nomCocktail;
    private int preparationTime;

    protected Cocktail(String nomCocktail, List<Ingredient> listeIngredient, int preparationTime){
        this.nomCocktail = nomCocktail;
        ingredients = listeIngredient;
        this.preparationTime = preparationTime;
    }

    public List<Ingredient> getIngredients(){
        return ingredients;
    }

    public int getPreparationTime(){
        return preparationTime;
    }

    public String getNomCocktail(){
        return nomCocktail;
    }
}
