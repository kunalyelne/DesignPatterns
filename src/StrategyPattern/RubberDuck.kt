package StrategyPattern

import StrategyPattern.FlyBehaviours.FlyNoWay
import StrategyPattern.QuackBehaviours.QuackWithQueak

class RubberDuck:Duck() {
    init {
        this.quackBehaviour = QuackWithQueak()
        this.flyBehaviour = FlyNoWay()
    }
    override fun display() {
        println("Looks like rubber duck")
    }
}