package entities.PC;

import entities.GamePC;
import java.util.Scanner;

public class Soigneur extends GamePC { // SOIGNEUR

    private Scanner lire = new Scanner(System.in);

    public Soigneur(int entityID, int SpecialAction){

        this.setEntityClassName("Soigneur"); // Nom de la classe
        this.setEntityIndex(entityID);// ID

        this.setPV(50); // PV définis
        this.setPA(5); // PA définis
        this.setPS(SpecialAction); // PS définis

    }

    /**
     * Action spéciale de classe 1
     */
    public void healOthers(){
        //a remplir
    }



}
