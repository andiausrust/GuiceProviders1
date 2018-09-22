package com.andi.implicitProvider;

public class NoDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0;
    }
}
