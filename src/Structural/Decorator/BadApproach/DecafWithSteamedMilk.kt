package Structural.Decorator.BadApproach

import Structural.Decorator.Beverage

class DecafWithSteamedMilk: Beverage() {
    override fun cost(): Double {
        return 40.8
    }
}