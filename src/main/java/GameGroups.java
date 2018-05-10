import java.util.LinkedList;

public class GameGroups extends GameEntities {

    private int NumberofMembers; // Named as NM
    private LinkedList arrayMembers = new LinkedList(); // Named as AM

    public GameGroups(int typeIndex){
        super(1,200,200);
        this.setTE(typeIndex);
        this.setNM(0);
    }

    public void addMember(int TypeIndex, GameEntities Entity){
        this.setNM(this.getNM()+1);
        arrayMembers.add(Entity.getIE(),Entity.getEntityName());

    }

    public void RemoveMember(GameEntities Entity){
        this.setNM(this.getNM()-1);
        arrayMembers.remove(Entity.getIE());
    }

    public boolean hasMembers(){
        if(this.getNM() == 0){
            return false;
        }else{
            return true;
        }
    }


    public int getNM(){
        return this.NumberofMembers = NumberofMembers;
    }

    public void setNM(int NumberofMembers){
        this.NumberofMembers = NumberofMembers;
    }
}
