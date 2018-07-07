package entities.PC;

import entities.GamePC;

public class Mage extends GamePC { // MAGE

    private int PS; // Point Spécial, concernant l'action spécial de cette classe

    public Mage(int entityID, int SpecialAction){

        this.setEntityClassName("Mage");

        this.setPV(100); // PV définis
        this.setPA(20); // PA définis
        this.setPS(SpecialAction);

    }



    /**
     * Action spéciale de classe
     */
    public void healSelf(){
        this.setPV(this.getPV()+this.getPS());
    }









    // *****LISTAGE GET/SET*****




}
