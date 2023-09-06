public class DataBaseConnection {
    private static DataBaseConnection _connection;

    public static DataBaseConnection get_connection() {
        if(_connection == null){
            _connection = new DataBaseConnection();
            System.out.println("New connection created");
        }else{
            System.out.println("A connection already exists");
        }
        return _connection;
    }
}