package databaseUtil;



import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

import java.util.Properties;

/**
 * Created by roye on 2017/4/25.
 */
public class DatabaseController {

    static public void main(String []args)
    {

        DatabaseController databaseController=new DatabaseController();
        SqlObject sqlObject=new SqlObject();
        databaseController.insertArticleInformation("",sqlObject);

    }
    private String dbHost;
    private String dbName;
    private String userName;
    private String password;
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public DatabaseController()
    {
        initLoadJdbc();
        initConnection();
    }
    private void initConnection()
    {
        try {
            connection = DriverManager.getConnection(dbHost+dbName+"?useUnicode=true&characterEncoding=utf8",userName,password);
            //statement=connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    private void initLoadJdbc()
    {
        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream("databaseConfiguration.properties"));
            dbHost=properties.getProperty("dbHost");
            dbName=properties.getProperty("dbName");
            userName=properties.getProperty("userName");
            password=properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void insertArticleInformation(String tableName,SqlObject obj)
    {
        String sql=" insert into "+tableName+" ("+obj.getColumnNameString()+")"
                + " values ("+obj.getColumnValueString()+");";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    /*
    public void execUpdate(String tableName,SqlObject obj)
    {
        String sql="UPDATE "+tableName+" SET "+obj.getColumnValueString();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.execute();
            //ps.setInt();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
*/

}
