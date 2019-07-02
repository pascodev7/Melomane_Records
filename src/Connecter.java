import java.sql.Connection;
import java.sql.DriverManager;

public class Connecter {

}


    public  static Connection Connecter() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            String url="jdbc:mysql://localhost:3306/hopital";
            String user="root";
            String password="";
            Connection cnx= DriverManager.getConnection(url,user,password);
            System.out.println(" connexion bien etablie");
            return cnx;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
