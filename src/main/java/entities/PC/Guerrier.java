package entities.PC;

import entities.GamePC;

/**
 * Guerrier
 * Classe JOUABLE
 */
public class Guerrier extends GamePC { // GUERRIER


    public Guerrier(int entityID, String entityName){

        // Infos Générales
        this.setEntityClassName("Guerrier");
        this.setEntityIndex(entityID);
        this.setEntityName(entityName);

        // Infos Techniques
        this.setPV(200); // PV définis
        this.setPA(10); // PA définis

    }

    //Pas d'attaque spéciale de la classe
    //pas de PS pour cette classe

}