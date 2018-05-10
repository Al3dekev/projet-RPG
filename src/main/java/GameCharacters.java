public class GameCharacters extends GameTurns {
    /*
    * Cette class gère certaines caracteristiques globales des Characters et Entities
    *
    *
     */



    // LES ATTRIBUTS
    private int PV; // Point de Vie
    private int PA; // Point d'Attaque, pour les dégats
    private int indexofCharacters; // index a chaque class de Character
    private int numofPlayableCharacter = 3; // Retourne le nombre de Characters jouable par un PJ dans tout le jeu, a modifier manuellement a chaque ajout de Characters.


    public GameCharacters(){

    }



    // *****LISTAGE GET/SET*****

    public int getPV(){
        return this.PV = PV;
    }
    public void setPV(int PV){
        this.PV = PV;
    }

    public int getPA(){
        return this.PA = PA;
    }
    public void setPA(int PA){
        this.PA = PA;
    }

    public int getIC() {
        return this.indexofCharacters = indexofCharacters;
    }

    public void setIC(int indexofCharacters) {
        this.indexofCharacters = indexofCharacters;
    }

    public int getNumOfPlayableCharacters(){
        return this.numofPlayableCharacter = numofPlayableCharacter;
    }

    public String getCharacterName(){ // retourne le nom de la class Character
        return this.getClass().getSimpleName();
    }


}
