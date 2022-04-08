import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class DB_Connection {
    
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    PreparedStatement pst;
    public Connection get_connection() {
        try{
            Class.forName("com.my sql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop?zeroDateTimeBehavior=convertToNull [root on Default schema]","root","");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
    
}
