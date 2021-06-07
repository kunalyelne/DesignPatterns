package StrategyPattern

import StrategyPattern.FlyBehaviours.FlyWithRocket

fun main() {
    val rubberDuck  = RubberDuck()
    val mallardDuck = MallardDuck()
    val redHeadDuck = RedHeadDuck()

    rubberDuck.performFly()
    rubberDuck.performQuack()
    rubberDuck.flyBehaviour = FlyWithRocket()
    rubberDuck.performFly()
    //-------------------------------
    mallardDuck.performFly()
    mallardDuck.performQuack()
    //-------------------------------
    redHeadDuck.performFly()
    redHeadDuck.performQuack()
}