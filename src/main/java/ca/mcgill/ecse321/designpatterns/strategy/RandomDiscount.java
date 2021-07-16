package ca.mcgill.ecse321.designpatterns.strategy;

import java.util.Random;

public class RandomDiscount implements Discount{
    private double percent;

    public RandomDiscount(){
        this.percent= new Random().nextInt(50)+1;
    }

    @Override
    public double compute(double fullPrice) {
        return fullPrice * (1-this.percent/100);
    }
}
