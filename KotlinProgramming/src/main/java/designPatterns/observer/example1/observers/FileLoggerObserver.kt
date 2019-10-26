package designPatterns.observer.example1.observers

import designPatterns.observer.example1.components.IObserver
import java.io.File

class FileLoggerObserver : IObserver {
    override fun update(args: Array<Any>) {
        val file = File("orders.log")
        for (arg in args) {
            file.appendText("$arg\n")
        }
    }
}