public class FoodPanda 
{
    public static void main(String[] args) 
    {
        DatabaseConnection databaseConnection = DatabaseConnection.getDatabaseConnection();
        databaseConnection.connect();
    }
}

class DatabaseConnection 
{
    private static DatabaseConnection databaseConnection = new DatabaseConnection();
    private DatabaseConnection(){}
    public static DatabaseConnection getDatabaseConnection()
    {
        return databaseConnection;
    }

    public void connect()
    {
        System.out.println("Connection Created");
    }
}