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

        if(type == 1){
            System.out.printf("C'est au tour de "+Entity.getEntityName()+" de jouer !\n");
            for(int i = 1;i<=this.getNumPlayer();i++){
                System.out.printf(joueur[i].getEntityName()+": "+joueur[i].getPV()+" PV restant\n");
            }
            System.out.printf("Monstre: "+GameMonster.getPV()+" PV restant\n");
        }else{
            System.out.printf("C'est au tour du Monstre de jouer !\n");
        }

    }

    public void entityActionChoice(int type, GameEntities Entity){
        int ChoosenAction;
        if(type == 1){
            System.out.println("Que voulez-vous faire ? \nChoix possibles: ");
            if(Entity.getIC() == 1) {
                System.out.println("1: Attaquer");
            } else if(Entity.getIC() == 2){
                System.out.println("1: Attaquer");
                System.out.println("2: Se soigner");
            }else{
                System.out.println("1: Attaquer");
                System.out.println("2: Soigner un allié");
            }

            if(Entity.getIC() == 1){
                do {
                    ChoosenAction = lire.nextInt();
                    lire.nextLine();
                }while(ChoosenAction != 1);
            }else{
                do {
                    ChoosenAction = lire.nextInt();
                    lire.nextLine();
                }while(ChoosenAction != 1 || ChoosenAction != 2);
            }
        }else{
            System.out.printf("Il choisit d'attaquer !");
        }
    }

    public void entityTargetChoice(int type, GameEntities Entity){
        if(type == 1){
            int n = 1;
            int choosenNum;
            System.out.println("Veuillez choisir une cible");
            System.out.println("1: Monstre");
            for(int x = 0;x<=this.getNumPlayer();x++){
                n++;
                if(x == Entity.getIE()){
                  break;
                }
                System.out.println(n+": "+joueur[x].getEntityName());
            }
            do{
                choosenNum = lire.nextInt();
            }while(choosenNum <= n);



        } else{ // CHOIX MONSTRE


        }
    }

    public int actionAndTargetChoiceEvent(int ActionNumber, GameEntities Sender, GameEntities Receiver){
    return 1;
/*
        if(ActionNumber == 1){
            Sender.attack(Receiver);
        }else if(ActionNumber == 2){
            Sender.healOthers();
        } else if(){

        }*/
    }




    public void victoryMessage(int type){
        if (type == 1) {
            if(this.getNumPlayer() > 1){
                System.out.println("Félicitations aux joueurs pour avoir l'emporté la partie !");
            }else{
                System.out.println("Félicitations a toi,"+joueur[1].getEntityName()+", tu as vaincu le Monstre !");
            }
        }else{
            if(this.getNumPlayer() > 1){
                System.out.println("Le Monstre vous a vaincu, mais la redemption vous appartiens lors d'une nouvelle partie !");
            }else{
                System.out.println("le Monstre t'a vaincu, "+joueur[1].getEntityName()+", dommage !!");
            }
        }
    }

    public void monsterSuperHitMessage(){
        System.out.println("Incroyable ! Le monstre fait un coup critique !");

    }



    // *****LISTAGE GET/SET*****
    public int getNbTurns(){
        return this.NbTurns = NbTurns;
    }

    public void setNbTurns(int Nbturns){
        this.NbTurns = Nbturns;
    }

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
