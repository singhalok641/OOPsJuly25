package org.example.designPatterns.decorator;

public class VanillaScoop implements Icecream{
    Icecream ic;

    public VanillaScoop(Icecream ic) {
        this.ic = ic;
    }

    @Override
    public double getCost() {
        return ic.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return ic.getDescription() + " Vanilla Scoop";
    }
}
