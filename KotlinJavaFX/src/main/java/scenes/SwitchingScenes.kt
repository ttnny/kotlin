package scenes

import javafx.application.Application
import javafx.geometry.HPos
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.ProgressIndicator
import javafx.scene.control.TextField
import javafx.scene.layout.*
import javafx.scene.text.Font
import javafx.scene.text.Text
import javafx.scene.text.TextAlignment
import javafx.stage.Stage

class SwitchingScenes : Application() {
    lateinit var stage: Stage

    override fun start(stage: Stage?) {
        if (stage != null) {
            // Save our stage for later
            this.stage = stage

            stage.title = "Switching Scenes"
            stage.scene = getScene()
            stage.show()
        }
    }

    fun getScene(name: String = ""): Scene {
        val panel: Pane = when (name) {
            "loading" -> loadingPanel()
            "buttons" -> choicesPanel()
            "choice1" -> formScene()
            "choice2" -> textScene()
            else -> loadingPanel()
        }

        return Scene(panel, 400.0, 400.0)
    }

    fun loadingPanel(): Pane {
        val panel = VBox()
        panel.alignment = Pos.CENTER
        panel.spacing = 10.0

        val header = Text("Loading")
        header.font = Font.font(30.0)
        val progress = ProgressIndicator()

        panel.children.addAll(header, progress)

        // Events
        progress.setOnMouseClicked {
            stage.scene = getScene("buttons")
        }

        return panel
    }

    fun choicesPanel(): Pane {
        val panel = HBox()

        val choice1 = Button("Choice #1")
        val choice2 = Button("Choice #2")

        panel.children.addAll(choice1, choice2)

        // Events
        choice1.setOnMouseClicked {
            stage.scene = getScene("choice1")
        }

        choice2.setOnMouseClicked {
            stage.scene = getScene("choice2")
        }

        return panel
    }

    fun formScene(): Pane {
        val parent = VBox()
        val panel = GridPane()

        val label1 = Label("Enter first:")
        val label2 = Label("Enter last:")

        //styles
        label1.font = Font("Vani", 18.0)
        label2.font = Font("Vani", 18.0)
        GridPane.setHalignment(label1, HPos.RIGHT)
        GridPane.setHalignment(label2, HPos.RIGHT)

        val field1 = TextField()
        val field2 = TextField()

        panel.columnConstraints.addAll(
                ColumnConstraints(80.0),
                ColumnConstraints(240.0)
        )

        panel.add(label1, 0, 0)
        panel.add(label2, 0, 1)
        panel.add(field1, 1, 0)
        panel.add(field2, 1, 1)

        //styles
        panel.hgap = 10.0
        panel.vgap = 10.0
        panel.alignment = Pos.CENTER
        panel.padding = Insets(10.0)

        val button = Button("Submit")

        //styles
        button.minHeight = 50.0
        button.minWidth = 200.0
        button.font = Font("Vani", 20.0)

        parent.children.addAll(panel, button)
        parent.alignment = Pos.CENTER

        return parent
    }

    fun textScene(): Pane {
        val panel = VBox()

        val para1 = Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam vehicula neque velit, " +
                "blandit suscipit tellus bibendum vitae. Nullam massa sem, volutpat eu nulla porta, iaculis mattis " +
                "eros. Aenean scelerisque vehicula elit, et gravida nunc vestibulum sit amet. Pellentesque aliquam " +
                "lectus sed leo tincidunt, vel gravida mauris pretium.")
        val button = Button("Back")

        para1.wrappingWidth = 380.0
        para1.font = Font("Vani", 20.0)
        para1.textAlignment = TextAlignment.JUSTIFY

        button.minHeight = 40.0
        button.minWidth = 200.0
        button.font = Font("Vani", 20.0)

        panel.children.addAll(para1, button)
        panel.spacing = 10.0
        panel.alignment = Pos.CENTER
        panel.padding = Insets(10.0)

        // Events
        button.setOnAction {
            stage.scene = getScene("buttons")
        }

        return panel
    }
}

fun main() {
    Application.launch(SwitchingScenes::class.java)
}