package StrategyPattern.QuackBehaviours

import StrategyPattern.QuackBehaviour

class QuackWithQueak: QuackBehaviour {
    override fun quack() {
        println("Queak Queak")
    }
}