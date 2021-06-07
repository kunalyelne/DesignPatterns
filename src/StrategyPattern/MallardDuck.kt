package StrategyPattern

import StrategyPattern.FlyBehaviours.FlyWithWings
import StrategyPattern.QuackBehaviours.QuackWithQuack

class MallardDuck : Duck() {
    init {
        this.quackBehaviour = QuackWithQuack()
        this.flyBehaviour = FlyWithWings()
    }
    override fun display() {
        println("Looks like mallard")
    }
}