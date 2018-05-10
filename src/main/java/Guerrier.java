public class Guerrier extends GameCharacters { // GUERRIER



    public Guerrier(int PV, int PA){
        this.setIC(1); // Index de(s) Guerrier(s) défini
        this.setPV(PV); // PV définis
        this.setPA(PA); // PA définis

    }


    public String getClassName(){
        return super.getCharacterName();

    }

}