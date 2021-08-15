/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg4;
import java.sql.*;
/**
 *
 * @author Estiven
 */
public class DataBase {
    static final String DBURL ="jdbc:mysql://localhost/databasees";
static final String DBUSUARIO ="root";
static final String DBCONTRASEÑA ="";
public static Connection connectDB(){
Connection conn = null;
try{
// Class.forName("com.mysql.jdbc.Driver");

conn = DriverManager.getConnection(DBURL, DBUSUARIO, DBCONTRASEÑA);
return conn;
}catch(Exception ex){
return null;
}
}
    
}
