package com.owens.javafxsample.view

import com.owens.javafxsample.controller.HomeViewController
import tornadofx.*

class HomeView : View("Home") {
    val controller: HomeViewController by inject()

    override val root = borderpane {
        prefWidth = 1000.0
        prefHeight = 900.0

        left {
            imageview(HomeView::class.java.classLoader.getResource("penguin.jpg").toString())
        }

        right {
            borderpane {
                center {
                    vbox {
                        padding = insets(20.0)
                        spacing = 10.0

                        label { text = "Welcome" }
                        button { text = "Register" }
                        button { text = "View all registered" }
                    }
                }
            }
        }
    }
}