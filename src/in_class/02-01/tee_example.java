public class tee_example {
    public static void main(String[] args) {
        smallTshirt small = new smallTshirt();
        System.out.println(small);

        mediumTshirt medium = new mediumTshirt();
        System.out.println(medium);

        largeTshirt large = new largeTshirt();
        System.out.println(large);

        extraLargeTshirt xlarge = new extraLargeTshirt();
        System.out.println(xlarge);
    }
}


class Tshirt {
    protected String size;
    double cost;

    //contstructor
    public Tshirt(String sz) {
        this.size = sz;
    }

    protected double getPrice() { return 10.0; }

    public String toString() {
        return "size: " + this.size + "; cost: " + this.getPrice();
    }

    public static void main(String[] args) {
        System.out.println("");
    }
}

class smallTshirt extends Tshirt {
    //constructor
    public smallTshirt() { super("Small"); }

    public static void main(String[] args) {
        System.out.println("");
    }
}

class mediumTshirt extends Tshirt {
    //constructor
    public mediumTshirt() { super("Medium"); }

    public static void main(String[] args) {
        System.out.println("");
    }
}

class largeTshirt extends Tshirt {
    //constructor
    public largeTshirt() { super("Large"); }

    public static void main(String[] args) {
        System.out.println("");
    }
}

class extraLargeTshirt extends Tshirt {
    //constructor
    public extraLargeTshirt() { super("Extra Large"); }

    //overriding parent method
    protected double getPrice() { return 12.0; }

    public static void main(String[] args) {
        System.out.println("");
    }
}
