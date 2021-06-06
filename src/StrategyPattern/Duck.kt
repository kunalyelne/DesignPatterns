package StrategyPattern

abstract class Duck {
    open fun quack() = println("Quack")
    fun swim() = println("Swim")
    //Requirement came to add fly functionality for all ducks
    open fun fly() = println("Fly")
    abstract fun display()
}