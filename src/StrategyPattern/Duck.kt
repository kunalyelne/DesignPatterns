package StrategyPattern

abstract class Duck {
    fun quack() = println("Quack")
    fun swim() = println("Swim")
    //Requirement came to add fly functionality for all ducks
    fun fly() = println("Fly")
    abstract fun display()
}