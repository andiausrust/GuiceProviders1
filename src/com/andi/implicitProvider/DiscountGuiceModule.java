package com.andi.implicitProvider;

// here you tell google Guice how to wire up/binding , factories are created here
// next time you see an Discountable.class bind it to NightOwlDiscount
// has to be instantiated (e.g. main)
public class DiscountGuiceModule extends com.google.inject.AbstractModule{

    @Override
    protected void configure() {
        // binding to provider = DiscountProvider
        bind(Discountable.class).toProvider(DiscountProvider.class);
    }
}
