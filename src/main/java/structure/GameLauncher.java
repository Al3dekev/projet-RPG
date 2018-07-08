package structure;

import java.util.Scanner;

public class GameLauncher {

    //private boolean backToMenu;
    private Scanner lire = new Scanner(System.in);
    private GameMessages message = new GameMessages();

    public GameLauncher(){
        // vide
    }


    public void welcome(){
        int choosenNum1;
        message.welcomeGameMessage();
        do{
            message.mainMenuMessage();
            choosenNum1 = lire.nextInt();

            if(choosenNum1 == 1){ // Démarrage du jeu & options
                this.options();
                this.startGame();
            }
            else if(choosenNum1 == 2){ // Explications
                message.mainMenuExplanations();
                choosenNum1 = 10;
            }

            else if(choosenNum1 == 3){ // Quitter le jeu
                this.endGame();
            }
        }while(choosenNum1 < 0 || choosenNum1 > 3);
    }


    /**
     * Génération du jeu en fonction des options
     */
    public void startGame(){

        // Lancer le jeu avec la gestion de tour, etc
    }

    public void options(){
        int num;
        int diff;

        message.optionNumPlayer();
        do{
            num = lire.nextInt();
        }while(num > 0 || num < 10);

        message.optionDifficulty();
        do{
            diff = lire.nextInt();
        }while(diff > 0 || diff < 4);

        private GameOptions optionsgenerated = new GameOptions(num,diff);

    }



    public void endGame(){
        System.out.println("Merci d'avoir joué au RPG, au revoir");
        System.exit(0);
    }


    // *****LISTAGE GET/SET*****

/*

    public boolean getBackToMenu(){
        return this.backToMenu;
    }
    public void setBackToMenu(boolean set){
        this.backToMenu = set;
    }
*/
    /*
    public GameOptions getOptionsdeJeu() {
        return this.OptionsdeJeu = OptionsdeJeu;
    }*/
}
