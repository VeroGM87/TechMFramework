package framework.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class MySQLManager {
    //declare Variables:
    private static final String URL= "jdbc:mysql://localhost:3306/mydb";
    private static final String USER="myuser";
    private static final String PASSWORD="mypassword";

    public static ResultSet executeQuery(String query)throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            //Stablish connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            return resultSet;

        }
        catch (SQLException e){
            e.printStackTrace();
            throw e;
        }

    }
}
