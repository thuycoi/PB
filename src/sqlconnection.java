import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlconnection {
 
  private static Connection conn = null;
 
  // Hostname
  private static String dbHost = "127.0.0.1";
 
  // Port -- Standard: 3306
  private static String dbPort = "3306";
 
  // Datenbankname
  private static String database = "cdcol";
 
  // Datenbankuser
  private static String dbUser = "root";
 
  // Datenbankpasswort
  private static String dbPassword = "";
 
  private sqlconnection() {
    try {
 
      // Datenbanktreiber für ODBC Schnittstellen laden.
      // Für verschiedene ODBC-Datenbanken muss dieser Treiber
      // nur einmal geladen werden.
      Class.forName("com.mysql.jdbc.Driver");
 
      // Verbindung zur ODBC-Datenbank 'sakila' herstellen.
      // Es wird die JDBC-ODBC-Brücke verwendet.
      conn = DriverManager.getConnection("jdbc:mysql://" + dbHost + ":"
          + dbPort + "/" + database + "?" + "user=" + dbUser + "&"
          + "password=" + dbPassword);
     /* conn = DriverManager.getConnection("jdbc:mysql://" + dbHost + ":"
              + dbPort + "/" + database + "?" + "user=" + dbUser + "&"
              + "password=" + dbPassword);*/
    } catch (ClassNotFoundException e) {
      System.out.println("Treiber nicht gefunden");
    } catch (SQLException e) {
      //System.out.println("Connect nicht moeglich");
      System.out.println("Verbindung nicht moglich");
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
  }

  private static Connection getInstance()
  {
    if(conn == null)
      new sqlconnection();
    return conn;
  }
 
  /**
   * Schreibt die Namensliste in die Konsole
   */
  public static void printNameList()
  {
    conn = getInstance();
 
    if(conn != null)
    {
      // Anfrage-Statement erzeugen.
      Statement query;
      try {
        query = conn.createStatement();
 
        // Ergebnistabelle erzeugen und abholen.
        String sql = "SELECT name FROM user "
            + "ORDER BY id";
        ResultSet result = query.executeQuery(sql);
 
        // Ergebnissätze durchfahren.
        while (result.next()) {
          String name = result.getString("name"); // Alternativ: result.getString(1);
         // String last_name = result.getString("last_name"); // Alternativ: result.getString(2);
        //  String name = last_name + ", " + first_name;
          System.out.println(name);
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
  public static boolean validateLogin(String name, String pass)
  {
    conn = getInstance();
    ResultSet test = null;
    String ergpass = null;
    if(conn != null)
    {
      // Anfrage-Statement erzeugen.
      Statement query;
      try {
        query = conn.createStatement();
 
        // Ergebnistabelle erzeugen und abholen.
        String sql = "SELECT * FROM user "
            + "WHERE name = '" + name + "';";
        System.out.println(""+sql);
        ResultSet result = query.executeQuery(sql);
       /* String testa = result.getString(1);
        System.out.println(testa);*/
        // Ergebnissätze durchfahren.
        while (result.next()) {
        	ergpass = result.getString(3); // Alternativ: result.getString(1);
         // String last_name = result.getString("last_name"); // Alternativ: result.getString(2);
        //  String name = last_name + ", " + first_name;
          System.out.println(ergpass);
        }
       
      } catch (SQLException e) {
        System.out.println("NOPE");
      }
    }
   // System.out.println(ergpass);
    return ergpass.equals(pass);
	
  }
  static int kp = 501;
  public static void randomNameGenerator(){
	  conn = getInstance();
	  
	  for(int i = 0;i<100;i++){
		  String sql1 = "UPDATE `partnerboerse` SET `vorname`= 'name" + i + "' WHERE id = "+ kp +";";
		  kp++;
		
		  if(conn != null)
		    {
		      // Anfrage-Statement erzeugen.
		      Statement query;
		      try {
		        query = conn.createStatement();

		       query.executeUpdate(sql1);
		       
		      
		    } catch (SQLException e) {
		        System.out.println("NOPE");
		    }
		}
		  
		  
		  
  }
	  
  }
}