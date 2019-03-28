package designpatterns.decorator.starbuzzer;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());


        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
    }
}
