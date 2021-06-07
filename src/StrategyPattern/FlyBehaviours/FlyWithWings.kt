package StrategyPattern.FlyBehaviours

import StrategyPattern.FlyBehaviour

class FlyWithWings: FlyBehaviour {
    override fun fly() {
        println("Flying with wings!")
    }
}