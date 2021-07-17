package Structural.Decorator.BadApproach

import Structural.Decorator.Beverage

class HouseBlendWithCaramel: Beverage() {
    override fun cost(): Double {
        return 104.3
    }
}