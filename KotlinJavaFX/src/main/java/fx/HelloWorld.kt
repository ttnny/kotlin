package fx

import javafx.application.Application
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.VBox
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import javafx.scene.text.Text
import javafx.stage.Stage

class HelloWorld : Application() {
    override fun start(stage: Stage?) {
        if (stage != null) {
            stage.scene = buildScene()
            stage.title = "Hello world app!"
            stage.show()
        }
    }

    fun buildScene(): Scene {
        // Create a panel to hold our controls
        val panel = VBox()

        // Positioning widgets
        panel.alignment = Pos.CENTER
        panel.spacing = 10.0
        panel.padding = Insets(20.0, 30.0, 20.0, 30.0)

        // Create a few widgets (controls)
        val header = Text("Hello, world!")
        val button = Button("Click me!")

        header.font = Font.font("Verdana", FontWeight.NORMAL, 20.0)
        button.prefWidth = 400.0
        button.prefHeight = 50.0

        // Add the widgets to our panel
        panel.children.addAll(header, button)

        // Create a scene
        val scene = Scene(panel, 400.0, 400.0)

        return scene
    }
}

fun main() {
    Application.launch(HelloWorld::class.java)
}