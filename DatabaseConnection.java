
import com.sun.jdi.connect.spi.Connection;


public class DatabaseConnection {
    private static String DB_URL="jdbc:mysql//localhost:3306/personalfinance";
    private static final String DB_USERNAME="root";
    private static final String DB_PASSWORD="Precious#40";
    
    public static Connection getConnection(){
try{
    return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }catch (SQLException e){
        System.out.println(e.getMessage() +"Error connection to database:");
        return  null;
    }

    }
    public static void main(String[] args){
        Connection connection=getConnection();
        if(connection !=null){
            System.out.println("connected to database successfully");
        }
    }
}
