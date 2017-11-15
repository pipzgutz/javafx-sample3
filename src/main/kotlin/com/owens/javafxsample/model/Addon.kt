package com.owens.javafxsample.model

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @since November 15, 2017
 * @version 1.0
 */
data class Addon(val name: String, val isSelected: Boolean = false) {
    override fun toString(): String = name
}