package Structural.Decorator.BadApproach

import Structural.Decorator.Beverage

class HouseBlendWithMocha: Beverage() {
    override fun cost(): Double {
        return 60.2
    }
}