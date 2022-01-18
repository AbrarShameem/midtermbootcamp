package math.problems;
import databases.ConnectToSqlDB;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args)
	{

		int[] initializedArray
				= new int[] { 25, 110, 74, 75, 5 };
		System.out.println("Random array");
		for (int i = 0; i < initializedArray.length; i++) {
			System.out.println(initializedArray[i]);
		}
		int minValue = initializedArray[0];
		for (int i = 0; i < initializedArray.length; i++) {

			if (initializedArray[i] < minValue)
				minValue = initializedArray[i];
		}
		System.out.println(
				"Smallest element present in given array: "
						+ minValue);
	}
}
public class connection {
	Connection con = null;

	public static Connection connectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/shameem",
					"abrar", "1234");
			return con;
		} catch (SQLException e) {
			System.out.println(e);
		}

		return null;
	}}