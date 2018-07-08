package structure;

public class GameMessages {


    // Echelle type de gestion d'une methode pour cette classe:
    // Arg1:
    // Arg2:
    // Arg3:
    
    public GameMessages(){

    }

    /***
     * Gère le message de base visualisé a chaque tour
     * Doit afficher le numéro de tour, quel est l'entité qui joue, ses points de vie et les PV du monstre restant
     */
    public void eachTurnMessages(int turnNumber, int TurnGuyNumero, Object entity){
        System.out.println("Tour numéro: "+turnNumber);
        if(entity.isNpc == true){
            System.out.printf("C'est au tour de "+entity.getEntityName()+" de jouer !\n");
            for(int i = 1;i<=this.getNumPlayer();i++){
                System.out.printf(joueur[i].getEntityName()+": "+joueur[i].getPV()+" PV restant\n");
            }
            System.out.printf("Monstre: "+Monstre.getPV()+" PV restant\n");
        }else{
            System.out.printf("C'est au tour du Monstre de jouer !\n");
        }
    }

    public void actionAndTargetMessage(Object attaquant, Object target){
        System.out.println("");
    }

    public void victoryMessage(){
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
        System.out.println("Incroyable ! Le monstre a fait une super attaque !");
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
