package BehavioralPattern.ObserverPattern

class Observer3(subject: Subject) : Observer {
    private var x = -1
    private var subjectData = subject
    init {
        subjectData.addObserver(this)
    }
    override fun update(x: Int) {
        this.x = x
        printX()
    }

    private fun printX() {
        println("In Observer 3 : $x")
    }

    fun removeFromObserver() {
        subjectData.deleteObserver(this)
    }
}