public class Barman extends Thread {

    private Cocktail cocktail;

    protected Barman(Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    public void run() {
        int preparationAdvancement = 1;
        while (preparationAdvancement != cocktail.getPreparationTime()+1) {
            try {
                for (Ingredient ingredient : cocktail.getIngredients()) {
                    ingredient.take();
                    System.out.println(String.format("Prise de l'ingrédient %s pour le cocktail %s.", ingredient.getIngredient(), cocktail.getNomCocktail()));
                    sleep(500);
                }
                System.out.println(String.format("Preparation du cocktail : %s (avancement %d/%d)", cocktail.getNomCocktail(), preparationAdvancement, cocktail.getPreparationTime()));
                sleep(2000);
                System.out.println(String.format("Fin de la préparation du cocktail : %s n°%d", cocktail.getNomCocktail(), preparationAdvancement));
                for (Ingredient ingredient : cocktail.getIngredients()) {
                    ingredient.drop();
                    System.out.println(String.format("L'ingrédient %s est lâché.", ingredient.getIngredient()));
                }
                preparationAdvancement++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
