package Food;

public enum Food {
    BuffaloMeat("Мясо быка", false),
    AntelopeMeat("Мясо антилпы", false),
    Grass("Трава", true),
    Apple("Яблоко", true);

    private final String foodname;
    private final boolean Vegetable;

    Food(String foodname, boolean Vegetable) {
        this.foodname = foodname;
        this.Vegetable = Vegetable;
    }

    public boolean Vegetable() {
        return Vegetable;
    }

    @Override
    public String toString() {
        return foodname;
    }
}