package ec.ups.edu.controlador;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conectar {

	private static Connection conn;
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://localhost/software";
	//private static final String server = "jdbc:mysql://192.168.2.2:3306/computacion?serverTimezone=UTC";
	//private static final String server = "jdbc:mysql://localhost:3306/computacion?serverTimezone=UTC";
        
	public Conectar (){
		conn = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			if ( conn != null ){
				System.out.println("Conexion establecida..");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
                        
		}
                
             
	}
	
	
	public  Connection getConnection(){
		return conn;
	}
	
	public void desconectar(){
		conn = null;
		if (conn == null){
			System.out.println("Conexion terminada...");
		}
	}
}
