class ECommerce {
    public static void main(String[] args) {
        DatabaseInstance databaseInstance = DatabaseInstance.getDatabaseInstance();
        databaseInstance.connect();
        databaseInstance.readData();
        databaseInstance.writeData();
    }
}


class DatabaseInstance {
    private static DatabaseInstance databaseInstance = new DatabaseInstance();
    private DatabaseInstance(){}
    public static DatabaseInstance getDatabaseInstance(){
        return databaseInstance;
    }

    public void connect(){
        System.out.println("Connection Created");
    }

    public void readData(){
        System.out.println("Read data from database");
    }

    public void writeData(){
        System.out.println("Insert data to database");
    }
}