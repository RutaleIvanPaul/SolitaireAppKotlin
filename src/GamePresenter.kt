object GamePresenter {
    var view: GameView? = null

    fun setGameView(gameView: GameView){
        view = gameView
    }

    fun onDeckTap(){
        GameModel.onDeckTap()
        view?.update()
    }

    fun onWasteTap(){
        GameModel.onWasteTap()
        view?.update()
    }

    fun onFoundationTap(foundationIndex: Int){
        GameModel.onFoundationTap(foundationIndex)
        view?.update()

    }

    fun onTableauPileTap(tableauIndex: Int, cardIndex: Int){
        GameModel.onTableauPileTap(tableauIndex,cardIndex)
        view?.update()
    }
}