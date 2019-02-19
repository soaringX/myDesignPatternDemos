package StructuralTypeDPDemos.DecoratorPattern;

public class GreenTea extends Beverage {
    @Override
    public String getDescription() {
        return "绿茶";
    }

    @Override
    public double cost() {
        return 10;
    }
}