package entities;

import java.util.Scanner;

public class GameEntities{
    /**
     *
     * Le programme gère chaque entité séparément
     * Ne pas instancier cette classe
     */

    // ATTRIBUTS
        private int entityIndex; // ID unique de l'entité
        private String entityName; // Non de l'entité
        private String entityClassName; // Nom de la classe de l'entité (ex: monstre, guerrier, ...)
        private boolean isNpc; // NPC ou PC?
        private int PV; // Point de vie
        private int PA; // Point d'attaque
        private int PS; // Point spécial
        private Scanner lire = new Scanner(System.in);

    public GameEntities(){
        // vide
    }

    /**
     * Attaque de base
     * @param cible
     */
    public void attack(void cible){
        // this = attacker
        cible.losePV(this.getPA());
    }

    /**
     * Gain de PV
     * @param number
     */
    public void earnPV(int number){
        this.setPV(this.getPV + number);
    }

    /**
     * Perte de PV
     * @param number
     */
    public void losePV(int number){
        this.setPV(this.getPV - number);
    }

    // DOIT CE FAIRE AILLEURS
    public void choosePlayerName(){

        if(this.getTE() == 1){
            System.out.println("Veuillez choisir le nom du joueur "+this.getIE());
        }else{
            System.out.println("Veuillez choisir le nom du Monstre "+this.getIE());
        }


        String choosenName = lire.nextLine();
        this.setEntityName(choosenName);
    }


    // *****LISTAGE GET/SET*****

    public int getEntityIndex(){
        return this.entityIndex;
    }
    public void setEntityIndex(int set){
        this.entityIndex = set;
    }

    public String getEntityName(){
        return this.entityName;
    }
    public void setEntityName(String set){
        this.entityName = set;
    }

    public String getEntityClassName(){
        return this.entityClassName;
    }
    public void setEntityClassName(String set){
        this.entityClassName = set;
    }

    public boolean getNpcStatus(){
        return this.isNpc;
    }
    public void setNpcStatus(boolean set){
        this.isNpc = set;
    }

    public int getPV(){
        return this.PV;
    }
    public void setPV(int set){
        this.PV = set;
    }

    public int getPA(){
        return this.PA;
    }
    public void setPA(int set){
        this.PA = set;
    }

    public int getPS(){
        return this.PS;
    }
    public void setPS(int set){
        this.PS = set;
    }

/*
    public int getIE(){
        return this.indexofEntities = indexofEntities;
    }
    public void setIE(int indexofEntities){
        this.indexofEntities = indexofEntities;
    }

    public int getTE(){
        return typeofEntity = typeofEntity;
    }
    public void setTE(int typeofEntity){
        this.typeofEntity = typeofEntity;
    }*/





}
