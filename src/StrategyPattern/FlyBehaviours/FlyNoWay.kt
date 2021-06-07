package StrategyPattern.FlyBehaviours

import StrategyPattern.FlyBehaviour

class FlyNoWay: FlyBehaviour {
    override fun fly() {
        println("Can't fly!")
    }
}