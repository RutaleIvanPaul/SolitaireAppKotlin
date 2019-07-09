import java.util.*

class Deck {

    val cards:Array<Card> = Array(52){
        Card(it % 13,when(it/13){
        0 -> clubs
        1 -> diamonds
        2 -> hearts
        else -> spades
    }
        )
    }

    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCard():Card = cardsInDeck.removeAt(0)

    fun reset(){
        cardsInDeck = cards.toMutableList()
        cardsInDeck.forEach { it.isFaceUp = false }
        Collections.shuffle(cardsInDeck)
    }
}