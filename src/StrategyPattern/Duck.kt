package StrategyPattern

abstract class Duck {
    fun quack() = println("Quack")
    fun swim() = println("Swim")
    abstract fun display()
}