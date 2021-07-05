package BehavioralPattern.ObserverPattern

class Observer2(subject: Subject) : Observer {
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
        println("In Observer 2 : $x")
    }
}