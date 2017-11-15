package com.owens.javafxsample.controller

import javafx.event.ActionEvent
import tornadofx.*

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @since November 14, 2017
 * @version 1.0
 */
class HomeViewController : Controller() {
    fun greet(event: ActionEvent) = println("Hello World")
}