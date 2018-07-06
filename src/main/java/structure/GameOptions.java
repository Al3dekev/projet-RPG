package structure;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
* Sert a généré les parametres et options pour creer la partie
* génère toutes les entités du jeu
*
 */

public class GameOptions{

    private int playerNumber;
    private int gameMode;
    /**
     * 1: Facile
     * 2: Normal
     * 3: Difficile
     */

    // C'est ici que les options du jeu se font, et notamment le traitement du taux de joueurs
    // Le(s) joueur(s) par la suite font leurs selections de classe de personnage par ce biais là
    // le traitement de l'info est géré par le GameLauncher et l'info remonte aux autres flux de traitement "Game".
    private Scanner lire = new Scanner(System.in);

    public GameOptions(int nombreJoueurs, int difficulty) {

        this.setPlayerNumber(nombreJoueurs);
        this.setGameMode(difficulty);
    }


    protected void optChooseNumPlayers(){
        int choosenNum1;
        System.out.println("Veuillez choisir le nombre de joueur pour la partie");
        do {
            choosenNum1 = lire.nextInt();
            lire.nextLine();
        }while(choosenNum1 <= 0 || 50 < choosenNum1);

        if(choosenNum1 == 1){
            System.out.printf(choosenNum1+" joueur à été choisi, courage a lui !");
        }else{
            System.out.printf(choosenNum1+" joueurs ont été choisis, courage a eux !");
        }


        this.setNumPlayer(choosenNum1);

    }

    /**
     * Choisir classe de chaque PC
     */
    public void optPlayers(){

    }

    /**
     * générer chaque PC et NPC
     */
    public void entityGeneration(){

    }

    /**
     * Récapitule chaque options mises en place par les... options
     */
    public void optionSelected(){
        int choosenNum1;
        System.out.println("***RECAPITULATIF D'OPTIONS***");
        if(this.getPlayerNumber() == 1){
            System.out.println(this.getPlayerNumber()+" a été choisi");
        }else{
            System.out.println(this.getPlayerNumber()+" ont été choisi");
        }
    }

    protected void optCreatEntities(int nbreJoueur) {
        joueur = new GameEntities[nbreJoueur+1];
        int ChoosenNum2,ChoosenNum3;
        String ChoosenName;
        for(int x = 1;x<=nbreJoueur;x++){
            System.out.println("Quel est la classe pour le joueur "+x+"\n");
            System.out.println("1: Guerrier");
            System.out.println("2: Mage");
            System.out.println("3: Soigneur");
            do {
                ChoosenNum3 = lire.nextInt();
                lire.nextLine();
            }while(ChoosenNum3 <= 0 || 3 <= ChoosenNum3);
            joueur[x] = new GameEntities(1,x,ChoosenNum3);
            //list.add(joueur[x]);

            if(joueur[x].getTE() == 1){
                System.out.println("Quel est le nom du joueur "+x+"\n");
                do {
                    ChoosenName = lire.nextLine();
                }while(ChoosenName.trim().isEmpty() || ChoosenName == null);
                joueur[x].setEntityName(ChoosenName);
                System.out.println("Nom du joueur"+x+": "+joueur[x].getEntityName());
            }
        }




        // Génération du Monstre
        GameMonster = new GameEntities(2,nbreJoueur+1,101);

        // Génération des groupes, opposant joueurs a Monstre
        this.defineGameGroups(1);
        this.defineGameGroups(2);


    }

/*    public void defineGameGroups(int type){

        if(type == 1) {
            GroupeJoueur = new GameGroups(type);
            for (int x = 0; x <= this.getNumPlayer(); x++) {
                GroupeJoueur.addMember(type, joueur[x]);
            }
        }else{
                GroupeMonstre = new GameGroups(type);
                GroupeMonstre.addMember(type,GameMonster);

            }
        }*/



    public void optCPmessages(){

    }

    public GameEntities getEntity(int type, int index){
        // Retourne un joueur existant a l'aide de son ID d'entité
        if(type == 1){
            return this.joueur[index] = joueur[index];
        }else{
            return this.GameMonster = GameMonster;
        }
    }

    public void setEntity(int type, int entityID){
        if(type == 1){
            this.joueur[entityID] = joueur[entityID];
        }else{
            this.GameMonster = GameMonster;
        }
    }


    // *****LISTAGE GET/SET*****

    public int getPlayerNumber(){
        return this.playerNumber;
    }
    public void setPlayerNumber(int set){
        this.playerNumber = set;
    }

    public int getGameMode(){
        return this.gameMode;
    }
    public void setGameMode(int set){
        this.gameMode = set;
    }



}