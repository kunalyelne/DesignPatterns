package StrategyPattern

abstract class Duck {

    //Seperate parts that vary and encapsulate them
    lateinit var flyBehaviour: FlyBehaviour
    lateinit var quackBehaviour: QuackBehaviour
    fun performQuack() {
        quackBehaviour.quack()
    }
    fun performFly() {
        flyBehaviour.fly()
    }
    //common for all
    fun swim() = println("Swim")
    abstract fun display()
}