package citas.medicas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static Connection conn;
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://localhost/citasmedicas";
	// private static final String server2 =
	// "jdbc:mysql://192.168.1.2:3306/computacion?serverTimezone=UTC";
	// private static final String server =
	// "jdbc:mysql://192.168.2.2:3306/computacion?serverTimezone=UTC";

	public Conexion() throws SQLException {
		conn = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("Conexion establecida..");
			}

		} catch (ClassNotFoundException | SQLException e) {

			System.out.println("error al conectar" + e);
		}
	}

	public Connection getConnection() {
		return conn;
	}

	public void desconectar() {
		conn = null;
		if (conn == null) {
			System.out.println("Conexion terminada...");
		}
	}

	public Object conexion() {
		// TODO Auto-generated method stub
		return null;
	}
}
