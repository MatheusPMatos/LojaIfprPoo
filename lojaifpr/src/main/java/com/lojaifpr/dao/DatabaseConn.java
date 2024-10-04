package com.lojaifpr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConn {
    
  
    public Connection gConnection(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/lojaifpr"; 
        String user = "aluno";
        String password = "aluno";

        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
    
    System.out.println("Conexão estabelecida com sucesso!");
    return conn;
    }
}
