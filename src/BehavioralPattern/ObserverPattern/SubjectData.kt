package BehavioralPattern.ObserverPattern

class SubjectData: Subject {
    private var observersList: ArrayList<Observer> = ArrayList()
    private var x = 5

    override fun addObserver(observer: Observer) {
        observersList.add(observer)
    }

    override fun deleteObserver(observer: Observer) {
        observersList.remove(observer)
    }

    override fun notifyObservers() {
        for (o in observersList) o.update(x)
    }

    fun setData(x:Int) {
        this.x = x
        notifyObservers()
    }
}