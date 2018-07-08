package structure;

public class GameMotor {

    private int nbTurns;

    public GameMotor(){

    }

    /**
     * Gère le tour de l'entité, laissant son choix d'action
     */
    public void entityTurn(){

    }

    /**
     * Choix de l'entité "entityTurn", de son action
     */
    public void actionChoice(){

    }

    public void targetChoice(){

    }


    /*** LISTAGE GET/SET ***/

    public int getNbTurns(){
        return this.nbTurns;
    }

    public void setNbTurns(int set){
        this.nbTurns = set;
    }


}
