package structure;

import java.util.Scanner;

public class GameLauncher {

    public GameLauncher(){
        // vide
    }


    public void welcome(){
        System.out.println("Bienvenue dans le RPG !\n");
        do{
            System.out.println("1: Commencer le Jeu");
            System.out.println("2: Explications");
            System.out.println("3: Quitter le Jeu");
            int choosenNum1 = lire.nextInt();

            if(choosenNum1 == 1){
                this.startGame();
            }
            else if(choosenNum1 == 2){
                this.explications();
                this.setReturnMenu(true);
            }

            else if(choosenNum1 == 3){
                this.endGame();
            }
        }while(this.getReturnMenu());
    }

    public void startGame(){



        //Gestion de tours
        GameTurns ToursManagement = new GameTurns();
        ToursManagement.Turn();
        //ToursManagement

    }

    public void explications(){
        System.out.println("Comme vous l'aurez compris, c'est un RPG, rien de plus classique");
        System.out.println("Apres avoir choisi le nombre de joueur, vous serez confronté a un Monstre que vous devrez vaincre.");
        System.out.println("C'est en utilisant les numéros de votre clavier que vous naviguerez dans les différentes options du jeu, comme vous venez de le faire pour acceder a ce menu");
        System.out.println("Compris?\n");
        int choosenNum3;
        System.out.println("1: Oui");
        System.out.println("2: Non");
        do{
            choosenNum3 = lire.nextInt();
        }while(choosenNum3 == 1 || choosenNum3 == 2);
        if(choosenNum3 == 1){
            System.out.println("Bien, l'avenir t'appartiens a présent !");
        }else{
            System.out.println("Peu importe, Billy ! Que le jeu commence !");
        }

    }



    public void endGame(){
        System.out.println("Merci d'avoir joué au RPG, au revoir");
        System.exit(0);
    }


    // *****LISTAGE GET/SET*****


    public boolean getReturnMenu(){
        return this.returnMenu = returnMenu;
    }

    public void setReturnMenu(boolean returnMenu){
        this.returnMenu = returnMenu;
    }
/*
    public GameOptions getOptionsdeJeu() {
        return this.OptionsdeJeu = OptionsdeJeu;
    }*/
}
