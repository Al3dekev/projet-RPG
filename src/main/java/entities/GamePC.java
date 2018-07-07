package entities;

public class GamePC extends GameEntities {

    private int playerIndex;
    private int PS;

    public GamePC(){

    }

    /*** LISTAGE GET/SET ***/

    public int getPS(){
        return this.PS;
    }
    public void setPS(int set){
        this.PS = set;
    }
}
