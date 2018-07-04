import java.util.Scanner;

public class GameEntities extends GameCharacters{
    /**
     *
     * Le programme gère chaque entité séparément
     * Ne pas instancier cette classe
     */

    // ATTRIBUTS
        private int entityIndex; // ID unique de l'entité
        private char entityName; // Non de l'entité
        private char entityClassName; // Nom de la classe de l'entité (ex: monstre, guerrier, ...)
        private boolean isNpc; // NPC ou PC?
        private int PV; // Point de vie
        private int PA; // Point d'attaque
        private int PS; // Point spécial

    // INSTANTIATION DES CLASSES / CHARACTERS
    private Scanner lire = new Scanner(System.in);

    public GameEntities(){
        // vide
    }

    public void attack(GameEntities cible){
        if(this.getIC() == 1){
            cible.losePV(this.getPA());
        }else if(this.getIC() == 2){
            cible.losePV(this.getPA());
        } else if(this.getIC() == 3){
            cible.losePV(this.getPA());
        }
    }

    public void healSelf(Mage mage1){

    }



    public void earnPV(int pvNumber){
        if(this.getIC() > 0 || this.getIC() < 3){
            for(int x = 0;x<=this.getIC();x++){
                if(this.getIC() == 1){
                    guerrier1.setPV(guerrier1.getPV() + pvNumber);
                }else if (this.getIC() == 2) {
                    mage1.setPV(mage1.getPV() + pvNumber);
                } else if (this.getIC() == 3) {
                    soigneur1.setPV(mage1.getPV() + pvNumber);
                }else if(this.getIC() == 101){
                    monstre1.setPV(monstre1.getPV() + pvNumber);
                }


            }
        }
    }

    public void losePV(int paNumber){
        if(this.getIC() > 0 || this.getIC() < 3){
            for(int x = 0;x<=this.getIC();x++){
                if(this.getIC() == 1){
                    guerrier1.setPV(guerrier1.getPV() - paNumber);
                }else if (this.getIC() == 2) {
                    mage1.setPV(mage1.getPV() - paNumber);
                } else if (this.getIC() == 3) {
                    soigneur1.setPV(soigneur1.getPV() - paNumber);
                }else if(this.getIC() == 101){
                    monstre1.setPV(monstre1.getPV() - paNumber);
                }


            }
        }
    }

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
    public void setEntityName(char set){
        this.entityName = set;
    }

    public String getEntityClassName(){
        return this.entityClassName;
    }
    public void setEntityClassName(char set){
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
        this.PA = set
    }

    public int getPS(){
        return this.PS;
    }
    public void setPS(int set){
        this.PS = set
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
