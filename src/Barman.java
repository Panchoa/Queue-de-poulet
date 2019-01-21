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
                }
//                System.out.println(String.format());
                System.out.println("Préparation du cocktail : " + cocktail.getNomCocktail() + " (avancement " + preparationAdvancement + "/" + cocktail.getPreparationTime() +")");
                sleep(500);
                System.out.println("Fin de la préparation du cocktail : " + cocktail.getNomCocktail()  + " n°" + preparationAdvancement);
                for (Ingredient ingredient : cocktail.getIngredients()) {
                    ingredient.drop();
                }
                preparationAdvancement++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
