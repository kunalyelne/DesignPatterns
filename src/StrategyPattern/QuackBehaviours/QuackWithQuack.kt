package StrategyPattern.QuackBehaviours

import StrategyPattern.QuackBehaviour

class QuackWithQuack: QuackBehaviour {
    override fun quack() {
        println("Quack Quack")
    }
}