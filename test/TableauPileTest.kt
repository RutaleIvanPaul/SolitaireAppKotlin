import org.junit.Test

import org.junit.Assert.*

class TableauPileTest {

    @Test
    fun addCard() {
        //arrange
        val tableauPile = TableauPile(mutableListOf(Card(12,hearts)))
        val cards = mutableListOf(Card(11,clubs))
        //act
        tableauPile.addCard(cards)
        //assert
        assertEquals(2,tableauPile.cards.size)
    }

    @Test
    fun removeCards() {
        val tableauPile = TableauPile(mutableListOf(Card(12,hearts), Card(11,clubs),Card(10,hearts)))

        tableauPile.removeCards(1)

        assertEquals(1,tableauPile.cards.size)
        assertEquals(mutableListOf(Card(12,hearts,true)),tableauPile.cards)
    }
}