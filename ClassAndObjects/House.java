package ClassAndObjects;

public class House {
    public Kitchen kitchen;
    public LivingRoom livingRoom;


    public House(){
        kitchen = new Kitchen("White");
        livingRoom = new LivingRoom("Grey");
    }


}
