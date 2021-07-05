package BehavioralPattern.ObserverPattern

interface Subject {
    fun addObserver(observer: Observer)
    fun deleteObserver(observer: Observer)
    fun notifyObservers()
}