import java.util.Random;

public class Monstre extends GameCharacters{

    private Random rn = new Random();


    public Monstre(){ // pas d'arg car 1 seul monstre en l'etat du jeu actuel
        this.setIC(101); // Index du Monstre

        int rnPV = rn.nextInt(300-50)+50; // Randomitude défini entre ces 2 valeurs géré a chaque partie
        int rnPA = rn.nextInt(20-5)+5;
        this.setPV(10*(Math.round(rnPV/10))); // PV définis
        this.setPA(5*(Math.round(rnPA/5))); // PA définis
        long superHit = 10*(Math.round((new Random().nextDouble()*100)/10));

    }
    /*
    public int uniformedRN(int integer){
        if (integer >= 5 && integer <= 10){
            return 5
        }else if(){

        }
    }*/


}
