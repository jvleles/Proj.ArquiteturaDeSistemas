import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws Exception{
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.withNumberOfRooms(10).withNumberOfBathrooms(15).withNumberOfTVs(20).withSofaColor("Red").withWallsColor("Black");

        House JvHouse = houseBuilder.toHouse();

        System.out.println("Number of Rooms: " + JvHouse.getNumberOfRooms());
        System.out.println("Number of Bathrooms: " + JvHouse.getNumberOfBathrooms());
        System.out.println("Number of TVs: " + JvHouse.getNumberOfTVs());
        System.out.println("Sofa Color: " + JvHouse.getSofaColor());
        System.out.println("Walls Color: " + JvHouse.getWallsColor());
    }
}