import java.sql.Connection;
import java.sql.DriverManager;

public class principal {
    public static void main(String[] args) {
        String user = "postgres";
        String pass = "diego";
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/webapp", user, pass);
            System.out.println("Conectado con Éxito");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
