import java.util.Scanner;

public class GameEntities extends GameCharacters{
    /*
    * Cette Class gère la caractérisation de tout PJ et PNJ du jeu, dans l'univers
    * Une Entité : Correspond a toutes forme de PJ et PNJ du jeu qui existe "physiquement" dans l'univers
    *
    *
    * Chaque Characters et Entities possèdent leurs propres index d'identification
    */

    // ATTRIBUTS
    private int indexofEntities; // index unique a l'entité
    private String entityName; // nom unique a l'entité
    private int typeofEntity; // 1: PJ
                              // 2: PNJ


    // INSTANTIATION DES CLASSES / CHARACTERS
    private Scanner lire = new Scanner(System.in);
    private Guerrier guerrier1 = new Guerrier(200,10);
    private Mage mage1 = new Mage(100,20,5);
    private Soigneur soigneur1 = new Soigneur(50,5,30);
    private Monstre monstre1 = new Monstre();


    public GameEntities(int type, int indexEntity, int indexCharacter){
        this.setTE(type);
        this.setIE(indexEntity);
        this.setIC(indexCharacter);


        if(type == 2){
            this.setEntityName("Jean-Kévin"); // LOL !
        }

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

    public String getEntityName(){
        return this.entityName = entityName;
    }
    public void setEntityName(String entityName){
        this.entityName = entityName;
    }



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
    }





}
