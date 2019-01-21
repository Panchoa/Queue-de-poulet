public class Barman extends Thread {

    private String name;
    private Cocktail cocktail;

    Barman(String name, Cocktail cocktail) {
        this.name = name;
        this.cocktail = cocktail;
    }

    public void run() {
        int preparationAdvancement = 1;
        while (preparationAdvancement != cocktail.getPreparationTime() + 1) {
            try {
                for (Ingredient ingredient : cocktail.getIngredients()) {
                    ingredient.take();
                    System.out.println(String.format(
                            "%s prend l'ingrédient %s pour le cocktail %s.",
                            name, ingredient.getIngredient(), cocktail.getNomCocktail())
                    );
                    sleep(500);
                }
                System.out.println(String.format(
                        "Réalisation du cocktail %s par %s (avancement %d/%d)",
                        cocktail.getNomCocktail(), name, preparationAdvancement, cocktail.getPreparationTime())
                );
                sleep(1000);
                System.out.println(String.format(
                        "Fin de la préparation du cocktail %s par %s (n°%d)",
                        cocktail.getNomCocktail(), name, preparationAdvancement)
                );
                for (Ingredient ingredient : cocktail.getIngredients()) {
                    ingredient.drop();
                    System.out.println(String.format(
                            "%s lâche l'ingrédient %s est lâché.", name, ingredient.getIngredient())
                    );
                }
                preparationAdvancement++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
