package org.example.v2;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Most Excellent Dark Roast";
    }
    public double cost(){
        // Remova a chamada a super.cost() e retorne apenas o valor base
        return 1.99;
    }
}
