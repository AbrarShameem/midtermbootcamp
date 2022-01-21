package databases;

import org.junit.Assert;

public class UnitTestConnectDB {
    public static void main(String[] args) {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();

        Assert.assertEquals("connectToSqlDB", "connectToSqlDB");
        System.out.println("Connected to SQLDB");
        Assert.assertEquals("connectToMongoDB", "connectToMongoDB");
        System.out.println("Connected to MongoDB");



    }
}
