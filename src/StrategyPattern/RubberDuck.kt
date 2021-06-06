package StrategyPattern

class RubberDuck:Duck() {

    override fun display() {
        println("Looks like rubber duck")
    }
    override fun quack() {
        println("Queak Queak")
    }

    override fun fly() {
        println("Can't fly")
    }

}