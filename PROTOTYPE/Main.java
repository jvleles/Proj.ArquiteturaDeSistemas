import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Character Jv = new Character(1.69, "Joao Victor", "Black");
        System.out.println("JV:");
        System.out.println("Name: " + Jv.getName());
        System.out.println("Hair color: " + Jv.getHairColor());
        System.out.println("Height: " + Jv.getHeight());

        System.out.println();
        Character JvClone = Jv.clone();

        System.out.println("JV Clone:");
        System.out.println("Name: " + JvClone.getName());
        System.out.println("Hair color: " + JvClone.getHairColor());
        System.out.println("Height: " + JvClone.getHeight());


    }
}