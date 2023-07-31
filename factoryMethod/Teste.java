package factoryMethod;

import java.util.Scanner;

public class Teste {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        
        FoodFactory ff = new FoodFactory();
        Food f = ff.getFood(SC.nextLine());
        
        System.out.println("The factory returned class " + f.getClass().getSimpleName());
        System.out.println(f.getType());
    }

}

interface Food {
    String getType();
}

class FoodFactory {

    public FoodFactory() {
    }

    public Food getFood(String pedido) {

        if (!pedido.equals("cake") && !pedido.equals("pizza")) {
            return null;
        }

        return (pedido.equals("cake"))
                ? new Cake()
                : new Pizza();
    }

}

class Pizza implements Food {

    @Override
    public String getType() {
        return "Someone ordered a Fast Food!";
    }

}

class Cake implements Food {

    @Override
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
