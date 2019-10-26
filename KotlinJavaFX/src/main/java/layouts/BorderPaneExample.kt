package layouts

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.CheckBox
import javafx.scene.control.Hyperlink
import javafx.scene.layout.BorderPane
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.scene.text.Text
import javafx.stage.Stage

class BorderPaneExample : Application() {
    override fun start(stage: Stage?) {
        if (stage != null) {
            stage.title = "Border Pane Example"
            stage.scene = buildScene()
            stage.show()
        }
    }

    fun buildScene(): Scene {
        val panel = BorderPane()

        // Set each region
        panel.left = westPanel()
        panel.right = eastPanel()
        panel.top = northPanel()
        panel.center = centerPanel()

        // Set the margins of each sub-panel
        BorderPane.setMargin(panel.left, Insets(10.0))
        BorderPane.setMargin(panel.right, Insets(10.0))
        BorderPane.setMargin(panel.top, Insets(10.0))
        BorderPane.setMargin(panel.bottom, Insets(10.0))

        return Scene(panel, 540.0, 500.0)
    }

    fun westPanel(): VBox {
        val panel = VBox()

        val text = Text("Something something")
        text.wrappingWidth = 100.0
        panel.children.addAll(
                text
        )

        return panel
    }

    fun northPanel(): HBox {
        val panel = HBox()

        panel.children.addAll(
                Hyperlink("Home"),
                Hyperlink("Add"),
                Hyperlink("Remove"),
                Hyperlink("About us")
        )

        return panel
    }

    fun centerPanel(): VBox {
        val panel = VBox()

        panel.children.addAll(
                CheckBox("Option #1"),
                CheckBox("Option #2"),
                CheckBox("Option #3"),
                CheckBox("Option #4"),
                CheckBox("Option #5"),
                CheckBox("Option #6")
        )

        return panel
    }

    fun eastPanel(): VBox {
        val panel = VBox()

        val text = Text("Something something else")
        text.wrappingWidth = 100.0
        panel.children.addAll(text)

        return panel
    }
}

fun main() {
    Application.launch(BorderPaneExample::class.java)
}