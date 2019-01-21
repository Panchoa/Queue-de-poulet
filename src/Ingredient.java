class Ingredient {

    private String ingredient;
    private boolean isUsed = false;

    Ingredient(String ingredient) {
        this.ingredient = ingredient;
    }

    String getIngredient() {
        return ingredient;
    }

    synchronized void take() throws InterruptedException {
        if (isUsed) {
            wait();
        }
        isUsed = true;
    }

    synchronized void drop() {
        isUsed = false;
        notify();
    }

}
