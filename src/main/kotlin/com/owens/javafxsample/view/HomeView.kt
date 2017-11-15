package com.owens.javafxsample.view

import javafx.geometry.HPos
import javafx.geometry.VPos
import javafx.scene.layout.GridPane
import tornadofx.*

class HomeView : View("Title here") {

    override val root = gridpane {
        padding = insets(10.0)
        vgap = 8.0
        hgap = 10.0

        GridPane.setConstraints(label {
            text = "Username"
        }, 0, 0)

        GridPane.setConstraints(textfield {
            promptText = "Username"
        }, 1, 0)

        GridPane.setConstraints(label {
            text = "Password"
        }, 0, 1)

        GridPane.setConstraints(passwordfield {
            promptText = "Password"
        }, 1, 1)

        GridPane.setConstraints(button {
            text = "Login"
        }, 1, 2, 1, 1, HPos.RIGHT, VPos.CENTER)
    }
}