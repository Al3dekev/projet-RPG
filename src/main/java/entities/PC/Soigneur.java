package entities.PC;

import java.util.Scanner;

public class Soigneur extends GameCharacters { // SOIGNEUR

    private int PS; // Point Spécial, concernant l'action spécial de cette classe
    private Scanner lire = new Scanner(System.in);

    public Soigneur(int PV, int PA, int SpecialAction){
        this.setIC(3); // Index de(s) soigneur(s) défini
        this.setPV(PV); // PV définis
        this.setPA(PA); // PA définis
        this.setPS(SpecialAction); // PS définis

    }


    // *****LISTAGE GET/SET*****

    public String getClassName(){
        return super.getCharacterName();
    }


    public int getPS(){
        return this.PS = PS;
    }

    public void setPS(int PS){
        this.PS = PS;
    }

}
