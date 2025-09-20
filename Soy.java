package org.example.v2;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double condimentCost = 0.0;
        if (beverage.getSize() == Beverage.Size.TALL) {
            condimentCost = 0.10;
        } else if (beverage.getSize() == Beverage.Size.GRANDE) {
            condimentCost = 0.15;
        } else if (beverage.getSize() == Beverage.Size.VENTI) {
            condimentCost = 0.20;
        }
        return condimentCost + beverage.cost();
    }
}