package com.andi;

import com.andi.implicitProvider.CheckoutService;
import com.andi.implicitProvider.DiscountGuiceModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        Injector guice = Guice.createInjector(new DiscountGuiceModule());
        CheckoutService service = guice.getInstance(CheckoutService.class);

        service.checkout(100);

    }
}
