package Structural.Decorator.BadApproach

import Structural.Decorator.Beverage

class EspressoWithSoy: Beverage() {
    override fun cost(): Double {
        return 50.8
    }
}