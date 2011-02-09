import java.util.*;

public class pizza {
    public static void main(String[] args) {
        SmallPizza sm  = new SmallPizza();
        sm.addTopping("Onions");
        sm.addTopping("Mushrooms");

        MediumPizza md = new MediumPizza();

        LargePizza lg  = new LargePizza();

        System.out.printf("%s", sm.getOrder());
    }
}

class SmallPizza extends PizzaBase {
    public SmallPizza() {
        super("Small", 8.0);
    }

    public void addTopping(String topping) {
        this.toppings += topping + " ";
        cost += .25;
    }
}

class MediumPizza extends PizzaBase {
    public MediumPizza() {
        super("Medium", 10.0);
    }

    public void addTopping(String topping) {
        this.toppings += topping + " ";
        cost += .50;
    }
}

class LargePizza extends PizzaBase {
    public LargePizza() {
        super("Large", 12.0);
    }

    public void addTopping(String topping) {
        this.toppings += topping + " ";
        cost += .75;
    }
}

abstract class PizzaBase {
    //data members
    protected String toppings;
    protected String size;
    protected double cost;
    private final static double deliveryCharge = 3.0;
    private Date timeOrdered;

    //constructor
    public PizzaBase(String size, double cost) {
        this.size = size;
        this.cost = cost;
        this.toppings = "cheese";
        timeOrdered = new Date();
    }

    public String getOrder() {
        Formatter fmt = new Formatter();
        fmt.format("On %s a %s pizza with these toppings (%s) was ordered. The cost is %.2f\n",
                timeOrdered, size, toppings, cost);
        return fmt.toString();
    }

    public abstract void addTopping(String topping);
}
