package StrategyPattern.FlyBehaviours

import StrategyPattern.FlyBehaviour

class FlyWithRocket: FlyBehaviour {
    override fun fly() {
        println("Flying with rocket!")
    }
}