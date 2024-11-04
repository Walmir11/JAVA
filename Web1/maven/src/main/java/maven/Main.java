package Web1.maven.src.main.java.maven;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main{
    public static void main(String[] args) {
        System.out.println("Ok");
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String pass = "postgres";

        //Carregando o Driver
        try{
            //Carregando o driver
            Class.forName(driver);
            //Criando conexão com o banco
            Connection connection = DriverManager.getConnection(url, user, pass);
            //Verificando se a conexão está aberta
            System.out.println(connection.isClosed());
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    private static void insert(Connection con)throws Exception{
        String sqlinsert = "insert into teste_ifs (nome) values ('Walmir milk')";
        Statement stmt = null;
        try {
            stmt con.createStatement();
            int qntLinhas = stmt.executeUpda
        } catch (Exception e) {
            // TODO: handle exception
        }
        }
}