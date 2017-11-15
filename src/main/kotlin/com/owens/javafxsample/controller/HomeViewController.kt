package com.owens.javafxsample.controller

import com.owens.javafxsample.model.Addon
import tornadofx.*

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @since November 14, 2017
 * @version 1.0
 */
class HomeViewController : Controller() {

    fun getAddons(): List<Addon> = listOf(Addon("Bacon"), Addon("Tuna", true), Addon("Lettuce"), Addon("Tomato"))
}

