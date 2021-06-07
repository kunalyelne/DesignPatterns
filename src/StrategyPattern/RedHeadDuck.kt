package StrategyPattern

import StrategyPattern.FlyBehaviours.FlyWithWings
import StrategyPattern.QuackBehaviours.QuackWithQuack

class RedHeadDuck: Duck() {
    init {
        this.quackBehaviour = QuackWithQuack()
        this.flyBehaviour = FlyWithWings()
    }
    override fun display() {
        println("Looks like red head duck")
    }
}