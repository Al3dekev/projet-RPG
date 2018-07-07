package entities;

public class GameNPC extends GameEntities {

    private int npcIndex;

    public GameNPC(){
        this.setNpcStatus(true);
    }

    /*** LISTAGE SET/GET ***/

    public int getNpcIndex(){
        return this.npcIndex;
    }
    public void setNpcIndex(int set){
        this.npcIndex = set;
    }



}
