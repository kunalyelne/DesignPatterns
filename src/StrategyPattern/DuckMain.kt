package StrategyPattern

fun main() {
    val rubberDuck  = RubberDuck()
    val mallardDuck = MallardDuck()
    val redHeadDuck = RedHeadDuck()


    rubberDuck.fly()
    rubberDuck.quack()
    //-------------------------------
    mallardDuck.fly()
    mallardDuck.quack()
    //-------------------------------
    redHeadDuck.fly()
    redHeadDuck.quack()
}