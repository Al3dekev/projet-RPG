package structure;

public class GameMotor {

    private int nbTurns;

    public GameMotor(){

    }

    /**
     * Gère le tour de l'entité, laissant son choix d'action
     */
    public void turnManagement(Object entity){

        if(entity.getEntityIndex == 101){
            // Gestion monstre
            //1: Methode affichage infos des actions du monstre
        } else {
            // gestion joueurs
            // 1: Message de chaque tour pour les joueurs
            // 2: Message d'action a choisir pour le joueur

            //3: Message d'action chosiit
            //4: Message d'action émise et effet sur cible
        }



    }

    /**
     * Choix de l'entité "entityTurn", de son action
     */
    public void actionChoice(){
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

    /**
     * Faire gérer le type en fonction de l'ID du monstre qui sera toujours 101
     */
    public void targetChoice(){
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


    /*** LISTAGE GET/SET ***/

    public int getNbTurns(){
        return this.nbTurns;
    }

    public void setNbTurns(int set){
        this.nbTurns = set;
    }


}
