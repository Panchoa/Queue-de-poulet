public class Ingredient {

    private String ingredient;
    private boolean isUsed = false;

    public Ingredient(String ingredient){
        this.ingredient = ingredient;
    }

    public String getIngredient(){
        return ingredient;
    }

    public synchronized void take() throws InterruptedException{
        if (isUsed){
            wait();
        }
        isUsed = true;
    }

    public synchronized void drop(){
        isUsed = false;
        notify();
    }

}
