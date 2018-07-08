package structure;

public class GameMessages {

    public GameMessages(){

    }

    /***
     * Gère le message de base visualisé a chaque tour
     */
    public void eachTurnMessages(){

    }

    public void actionAndTargetMessage(){

    }

    public void victoryMessage(){

    }

    public void monsterSuperHitMessage(){

    }

    public void numberTurnMessage(){
        System.out.println("Tour numéro: "+var);
    }

    public void welcomeGameMessage(){
        System.out.println("Bienvenue dans le RPG !\n");
    }

    public void mainMenuMessage(){
        System.out.println("1: Commencer le Jeu");
        System.out.println("2: Explications");
        System.out.println("3: Quitter le Jeu");
    }

    public void mainMenuExplanations(){
        System.out.println("Comme vous l'aurez compris, c'est un RPG, rien de plus classique");
        System.out.println("Apres avoir choisi le nombre de joueur, vous serez confronté a un Monstre que vous devrez vaincre.");
        System.out.println("C'est en utilisant les numéros de votre clavier que vous naviguerez dans les différentes options du jeu, comme vous venez de le faire pour acceder a ce menu");
        System.out.println("Compris?\n");
        int choosenNum2;
        System.out.println("1: Oui");
        System.out.println("2: Non");
        do{
            choosenNum2 = lire.nextInt();
        }while(choosenNum2 == 1 || choosenNum2 == 2);
        if(choosenNum2 == 1){
            System.out.println("Bien, l'avenir t'appartient a présent !");
        }else{
            System.out.println("Peu importe, Billy ! Que le jeu commence !");
        }
    }

    public void optionNumPlayer(){
        System.out.println("Veuillez choisir le nombre de joueurs pour la partie");
        System.out.println("Nombre de joueurs max: "+10);
    }

    public void optionDifficulty(){
        System.out.println("Veuillez choisir le niveau de difficulté");
        System.out.println("1: Facile");
        System.out.println("2: Normal");
        System.out.println("3: Difficile");
    }


}
