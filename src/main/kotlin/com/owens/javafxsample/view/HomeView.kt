package com.owens.javafxsample.view

import com.owens.javafxsample.controller.HomeViewController
import com.owens.javafxsample.model.Addon
import javafx.event.EventHandler
import javafx.scene.control.CheckBox
import tornadofx.*

class HomeView : View("Bucky's Subs") {
    val controller: HomeViewController by inject()
    var selectedAddons: List<Addon> = mutableListOf()

    init {
        val addons = controller.getAddons()

        addons.forEach { addon ->
            run {
                if (addon.isSelected) {
                    selectedAddons += addon
                }
            }
        }
    }

    override val root = vbox {
        prefWidth = 300.0
        prefHeight = 200.0
        spacing = 10.0
        padding = insets(20.0)

        controller.getAddons().forEach { addon ->
            checkbox {
                text = addon.name
                isSelected = addon.isSelected
                onAction = EventHandler { event ->
                    run {
                        val cb = event.source as CheckBox
                        if (cb.isSelected) {
                            selectedAddons += addon
                        } else {
                            selectedAddons -= addon
                        }
                    }
                }
            }
        }

        button {
            text = "Order Now!"
            onAction = EventHandler { event ->
                run {
                    println(getMessageForSelectedAddons(selectedAddons))
                }
            }
        }
    }

    fun getMessageForSelectedAddons(addons: List<Addon>): String {
        var choices = ""

        addons.forEachIndexed { index, addon ->
            choices += addon.name

            if (addons.size - 1 != index) {
                choices += ", "
            }
        }

        return if (addons.size == 1) "Your choice is $choices" else "Your choices are $choices"
    }
}