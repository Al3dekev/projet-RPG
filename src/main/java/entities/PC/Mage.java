package entities.PC;

import entities.GamePC;

/**
 * Mage
 * Classe JOUABLE
 */
public class Mage extends GamePC { // MAGE

    public Mage(int entityID, int SpecialAction){

        this.setEntityClassName("Mage"); // Nom de classe
        this.setEntityIndex(entityID); // ID

        this.setPV(100); // PV définis
        this.setPA(20); // PA définis
        this.setPS(SpecialAction);

    }



    /**
     * Action spéciale de classe
     */
    public void healSelf(){
        //a remplir
        this.setPV(this.getPV()+this.getPS());
    }









    // *****LISTAGE GET/SET*****




}
