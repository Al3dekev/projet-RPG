package entities.PC;

import entities.GamePC;
import java.util.Scanner;

/**
 * Soigneur
 * Classe JOUABLE
 */
public class Soigneur extends GamePC { // SOIGNEUR

    private Scanner lire = new Scanner(System.in);

    public Soigneur(int entityID, String entityName){

        this.setEntityClassName("Soigneur"); // Nom de la classe
        this.setEntityIndex(entityID);// ID
        this.setEntityName(entityName);

        this.setPV(50); // PV définis
        this.setPA(5); // PA définis
        this.setPS(20); // PS définis

    }

    /**
     * Action spéciale de classe 1
     */
    public void healOthers(){
        //a remplir
    }



}
