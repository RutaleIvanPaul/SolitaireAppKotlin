import org.junit.Test

class GameTest {
    @Test
    fun kingInFirstFoundationPile(){
        //arrange
        var numGames = 0
        val maxGames = 10000

        //act
        for(i in 1 .. maxGames){
            numGames++
            GameModel.resetGame()

            for (j in 1..1000){
                GamePresenter.onDeckTap()
                GamePresenter.onWasteTap()
                GameModel.tableauPiles.forEachIndexed{index,tableauPile ->
                    GamePresenter.onTableauPileTap(index,tableauPile.cards.lastIndex)
                }
                if (GameModel.foundationPiles[0].cards.size == 13){
                    break
                }
            }
        }

        //assert
        GameModel.debugPrint()
        println("# GAMES: $numGames")
        assert(numGames < maxGames)

    }
}
