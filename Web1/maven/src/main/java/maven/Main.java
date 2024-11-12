package Web1.maven.src.main.java.maven;

import javax.swing.*;
import java.sql.*;

public class Main {
    public static void main(String[] p) {
        System.out.println("OK");
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String pass = "postgres";

        //Definindo a variável da conexao
        Connection connection = null;
        try {
            //Carregando o driver
            Class.forName(driver);
            //Criando conexao com o banco
            connection = DriverManager.getConnection(url, user, pass);
            //Verificando se a conexão está aberta
            System.out.println(connection.isClosed());
            //insert(connection);
//            consulta(connection);
            autenticacao(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            }catch (Exception e){}
        }
    }

    private static void insert(Connection con) throws Exception {
        //Comando de insert
        String nome = JOptionPane.showInputDialog("Informe o Nome: ");
        String login = JOptionPane.showInputDialog("Informe o Login: ");
        String senha = JOptionPane.showInputDialog("Informe o Senha: ");
        String sqlInsert = "insert into teste_ifs (nome, login, senha) values ('" + nome +"', '" + login + "','" + senha + "')";
        //Variável responsável pela execução da sentença
        Statement stmt = null;
        try {
            //Criando o objeto da sentença
            stmt = con.createStatement();
            //executando o comando
            int qntLinhas = stmt.executeUpdate(sqlInsert);
            System.out.println(qntLinhas);
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                //fechando a sentença
                stmt.close();
            }catch (Exception e) {}
        }
    }

    private static void consulta(Connection con) throws Exception {
        //Comando de insert
        String sqlInsert = "select * from teste_ifs";
        //Variável responsável pela execução da sentença
        Statement stmt = null;
        //Variável responsáve por navegar no resultado da consulta
        ResultSet rs = null;
        try {
            //Criando o objeto da sentença
            stmt = con.createStatement();
            //executando o comando
            rs = stmt.executeQuery(sqlInsert);
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("nome"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                //fechando a sentença
                rs.close();
            }catch (Exception e) {}
            try {
                //fechando a sentença
                stmt.close();
            }catch (Exception e) {}
        }
    }

    private static void autenticacao(Connection con) throws Exception {
        //Comando de insert
        String login = JOptionPane.showInputDialog("Informe o Login: ");
        String senha = JOptionPane.showInputDialog("Informe o Senha: ");
        String sqlLogin = "select * from teste_ifs where login=? and senha=?";
        //Variável responsável pela execução da sentença
        PreparedStatement ps = null;
        //Variável responsáve por navegar no resultado da consulta
        ResultSet rs = null;
        try {
            //Criando o objeto da sentença
            ps = con.prepareStatement(sqlLogin);
            ps.setString(1, login);
            ps.setString(2, senha);
            //executando o comando
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("nome"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                //fechando a sentença
                rs.close();
            }catch (Exception e) {}
            try {
                //fechando a sentença
                ps.close();
            }catch (Exception e) {}
        }
    }
}
