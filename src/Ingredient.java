import static java.lang.Thread.sleep;

public class Ingredient {

    private String ingredient;
    private boolean isUsed = false;

    public Ingredient(String ingredient){
        this.ingredient = ingredient;
    }

    public synchronized void take() throws InterruptedException{
        if (isUsed){
            wait();
        }
        isUsed = true;
        sleep(200);
    }

    public synchronized void drop(){
        isUsed = false;
        notify();
    }

}
