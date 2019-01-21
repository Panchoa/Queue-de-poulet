class Cocktail {

    private Ingredient[] ingredients;
    private String nomCocktail;
    private int preparationTime;

    Cocktail(String nomCocktail, Ingredient[] ingredients, int preparationTime) {
        this.nomCocktail = nomCocktail;
        this.ingredients = ingredients;
        this.preparationTime = preparationTime;
    }

    Ingredient[] getIngredients() {
        return ingredients;
    }

    int getPreparationTime() {
        return preparationTime;
    }

    String getNomCocktail() {
        return nomCocktail;
    }
}
