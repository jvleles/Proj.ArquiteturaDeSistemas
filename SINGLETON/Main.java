public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a connection to register");

        DataBaseConnection connection1 = DataBaseConnection.get_connection();
        DataBaseConnection connection2 = DataBaseConnection.get_connection();

    }
}