package Animals;

import Food.Food;

public abstract class Carnivorous extends Animal {

@Override
public void eat(Food food) {
    if (food.Vegetable()) {
        throw new NullPointerException(name + " не ест " + food);
        //System.out.println(name + " не ест " + food);
    } else {
        System.out.println(name + " ест " + food);
        //throw new NullPointerException("таким животное не кормят");
    }
    }
}