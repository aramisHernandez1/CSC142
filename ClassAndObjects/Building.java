package ClassAndObjects;

public class Building {
    public static void main(String[] args) {
        House bob = new House();
        bob.livingRoom.furniture.add("Table");
        bob.livingRoom.furniture.add("Chair");
        bob.livingRoom.furniture.add("Couch");
        bob.livingRoom.furniture.add("TV");
        bob.livingRoom.color = "blue";
        bob.kitchen.color = "Green";

        System.out.println(bob.livingRoom.furniture);
        System.out.println(bob.kitchen.color);
    }
}
