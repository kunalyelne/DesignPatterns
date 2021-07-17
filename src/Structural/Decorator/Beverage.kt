package Structural.Decorator

abstract class Beverage {
    val description: String = "Unknown"
    abstract fun cost(): Double
}