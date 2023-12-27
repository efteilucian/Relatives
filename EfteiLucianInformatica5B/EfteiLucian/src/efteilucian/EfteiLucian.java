/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package efteilucian;

import java.sql.*;


/**
 *
 * @author eftei.lucian
 */
public class EfteiLucian {
    private String driver = "org.mariadb.jdbc.Driver";
    private String URL = "jdbc:mariadb://localhost:3306/test";
    private String user = "root";
    private String password = "";

    private Connection c = null;
    private Statement s = null;

    /**
     * @param args the command line arguments
     */
    
    public EfteiLucian(String nome) {
        try {
            try {
               
                Class.forName(driver);

               
                c = DriverManager.getConnection(URL, user, password);
                System.out.println("Connessione stabilita");

                c.setAutoCommit(true);
                System.out.println("Autocommit impostato");

               
                s = c.createStatement();
            } catch (ClassNotFoundException e) {
                System.out.println("ERRORE!: non riesco a trovare i driver JDBC di MySQL nel classpath.");
                System.out.println(e.getMessage());
                return;
            } catch (SQLException e) {
                System.out.println("ERRORE SQL!");
                showSQLException(e);
                return;
            }

    
            String query = "CREATE DATABASE " + nome;
            System.out.println("Eseguo la query " + query);
            try {
                s.executeUpdate(query);
                System.out.println("Query eseguita");
            } catch (SQLException e) {
                System.out.println("ERRORE SQL!: non è possibile eseguire la query '" + query + "'");
                showSQLException(e);
            }
            
            query = "USE " + nome;
            System.out.println("Eseguo la query " + query);
            try {
                s.executeUpdate(query);
                System.out.println("Query eseguita " + nome + " è il DB in uso.");
            } catch (SQLException e) {
                System.out.println("ERRORE SQL!: non è possibile eseguire la query '" + query + "'");
                showSQLException(e);
            }
            
        } 
        finally {
          
            System.out.println("Chiusura del database.");
            try {
                if (s != null) {
                    s.close();
                }
            } catch (SQLException e) {
                showSQLException(e);
            }
            try {
                if (c != null) {
                    c.close();
                }
            } catch (SQLException e) {
                showSQLException(e);
            }
        }
    }

    private static void showSQLException(java.sql.SQLException e) {
        SQLException next = e;
        while (next != null) {
            System.out.println(next.getMessage());
            System.out.println("Error Code: " + next.getErrorCode());
            System.out.println("SQL State: " + next.getSQLState());
            next = next.getNextException();
        }
        }
    public static void main(String[] args) {
      if (args.length == 1) {
            new EfteiLucian(args[0]);
        } else {
            System.out.println("java EfteiLucian <nome> ");
        }
//      
    }

}
