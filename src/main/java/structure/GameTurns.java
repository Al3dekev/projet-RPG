package structure;

import java.util.Scanner;

public class GameTurns extends GameOptions{
    /*
    *   Class de gestion des tours et des actions qui y vont en conséquent.
    *   Les séparations de Méthodes en contenu Mécanique et Informatif ont été fusionnés pour tout envoyer en 1 Méthode
    *
     */

    private int NbTurns; // Enregistre le nombre de tours dans la partie
    private int indexofSelectedAction; // Named as ISA, choix de l'action du joueur lorsque c'est a son tour de jouer
    //private GameLauncher Launch = new GameLauncher();
    private int indexofSelectedTarget; // Named as IST, choix de l'entité de sa cible
    private Scanner lire = new Scanner(System.in);

    public GameTurns(){

    }


    public void Turn(){


do{
        for(int t = 1;t<=2;t++) {
            if(t==1){
                for (int x = 1; x <= this.getNumPlayer(); x++) {
                    if(joueur[x].getPV() <= 0){
                        //Check a chaque tour si le joueur a des PV

                    }
                    this.eachTurnInfoMessages(t,joueur[x]);
                    this.entityActionChoice(t,joueur[x]);
                    this.entityTargetChoice(t,joueur[x]);
                }
            }else{
                this.eachTurnInfoMessages(t,GameMonster);
                this.entityActionChoice(t,GameMonster);
                this.entityTargetChoice(t,GameMonster);
            }
        }

        }while((GroupeJoueur.hasMembers() == false) || GameMonster.getPV() <= 0); // do while loop pour la fin du jeu, permet de faire un nombre infini de tour jusqu'a ce que l'une des personnes meurt

        if(GroupeJoueur.hasMembers() == false){
            this.victoryMessage(2);
        }else{
            this.victoryMessage(1);
        }

    }





    public void eachTurnInfoMessages(int type,GameEntities Entity){
        // Affiche des informations sur le nom du joueur qui doit jouer, les pts de vies de tout les joueurs, les pts de vie du monstre.



    }

    public void entityActionChoice(int type, GameEntities Entity){

    }

    public void entityTargetChoice(int type, GameEntities Entity){

    }




    // *****LISTAGE GET/SET*****

    public int getISA(){
        return this.indexofSelectedAction = indexofSelectedAction;
    }

    public void setISA(int indexofSelectedAction){
        this.indexofSelectedAction = indexofSelectedAction;
    }

    public int getIST(){
        return this.indexofSelectedTarget = indexofSelectedTarget;
    }

    public void setIST(int indexofSelectedTarget){
        this.indexofSelectedTarget = indexofSelectedTarget;
    }


}
