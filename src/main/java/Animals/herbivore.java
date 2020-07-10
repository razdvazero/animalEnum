package Animals;
import Food.Food;

public abstract class herbivore extends Animal {

    @Override
    public void eat(Food food) {
        if (!food.Vegetable()) {
            //System.out.println(name + "не ест " + food);
            throw new NullPointerException(name + " не ест " + food);
        } else {
            System.out.println(name + " ест " + food);
        }
    }
}