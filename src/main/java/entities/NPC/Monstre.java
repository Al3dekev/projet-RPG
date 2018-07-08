package entities.NPC;

import entities.GameNPC;

import java.util.Random;

public class Monstre extends GameNPC {

    private Random rn = new Random();


    public Monstre(){ // pas d'arg car 1 seul monstre en l'etat du jeu actuel

        this.setEntityClassName("Monstre");
        this.setEntityIndex(101);
        this.setEntityName("Monstre");

        int rnPV = rn.nextInt(300-50)+50; // Randomitude défini entre ces 2 valeurs géré a chaque partie
        int rnPA = rn.nextInt(20-5)+5;
        this.setPV(10*(Math.round(rnPV/10))); // PV définis
        this.setPA(5*(Math.round(rnPA/5))); // PA définis

    }


    /**
     * Attaque spéciale du Monstre
     * @param cible
     */
    public void superAttack(Object cible){
        long superHit = 10*(Math.round((new Random().nextDouble()*100)/10));

        cible.losePV(superHit);

    }


}
