package Structural.Decorator.BadApproach

import Structural.Decorator.Beverage

class EspressoWithMochaBeverage: Beverage() {
    override fun cost(): Double {
        return 90.5
    }
}