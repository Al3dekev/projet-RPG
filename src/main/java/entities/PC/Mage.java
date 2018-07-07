package entities.PC;

public class Mage extends GameCharacters { // MAGE

    private int PS; // Point Spécial, concernant l'action spécial de cette classe

    public Mage(int SpecialAction){
        //this.setIC(2); // Index de(s) mage(s) défini
        this.setPV(100); // PV définis
        this.setPA(20); // PA définis
        this.setPS(SpecialAction);

    }

    public int attaque(){
        return this.getPA(); // retourne les dégats sur la gueule de l'adversaire, YAY
    }

    public void healSelf(){
        this.setPV(this.getPV()+this.getPS());
    }









    // *****LISTAGE GET/SET*****




}
