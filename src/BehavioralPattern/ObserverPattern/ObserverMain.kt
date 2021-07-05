package BehavioralPattern.ObserverPattern

import java.util.*
import kotlin.concurrent.schedule

fun main() {
    val subjectData = SubjectData()

    val observer1 = Observer1(subjectData)
    val observer2 = Observer2(subjectData)
    val observer3 = Observer3(subjectData)

    subjectData.setData(10)
    Timer().schedule(1000){
        subjectData.setData(20)
    }
    Timer().schedule(2000){
        observer3.removeFromObserver()
        subjectData.setData(30)
    }
}