package Structural.Decorator.BadApproach

import Structural.Decorator.Beverage

class DecafWithSoyAndMocha: Beverage() {
    override fun cost(): Double {
        return 60.0
    }
}