package designPatterns.observer.example1.components

import designPatterns.observer.example1.components.IObserver

abstract class Observable {
    // Store a list of IObserver objects
    private val observers = mutableListOf<IObserver>()

    // Add IObserver objects to see changes in the child class
    fun addObserver(observer: IObserver) {
        if (!observers.contains(observer)) {
            observers.add(observer)
        }
    }

    // Inform the IObserver objects when necessary
    fun notifyObservers() {
        notifyObservers(arrayOf())
    }

    fun notifyObservers(args: Array<Any>) {
        // Loop over each IObserver object and inform it
        for (observer in observers) {
            observer.update(args)
        }
    }
}