package com.alphaomardiallo.diceroller

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun generates_numbers() {
        val dice = Dice(6)
        val rollDice = dice.roll()
        assertTrue(rollDice in 1..dice.numSides)
    }
}