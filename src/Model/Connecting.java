package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connecting {

    private final static String DBName = "voting";
    private final static String url1 = "jdbc:mysql://localhost:3306/";
    private final static String url2 = url1 + DBName;
    private final static String username = "root";
    private final static String password = "";
    private static Connection connection;

    public static void newDBConnection() {
        try {
            connection = DriverManager.getConnection(url2, username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void newDBConnection(boolean arg) {
        try {
            connection = DriverManager.getConnection(url1, username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getDBConnection() {
        try {
            if (connection.isClosed() || connection == null) {
                newDBConnection();
                return connection;
            } else {
                return connection;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void initDB() {
        String createDB = "CREATE DATABASE IF NOT EXISTS " + DBName;
        String createTableUser = "CREATE TABLE IF NOT EXISTS user"
                + "(u_email VARCHAR(30) PRIMARY KEY NOT NULL, "
                + "u_password VARCHAR(30) NOT NULL,"
                + "u_first_name VARCHAR(30) NOT NULL,"
                + "u_last_name VARCHAR(30) NOT NULL,"
                + "photo BLOB)";
        String createTableCandidate = "CREATE TABLE IF NOT EXISTS candidate"
                + "(c_email VARCHAR(30) PRIMARY KEY NOT NULL, "
                + "political_party VARCHAR(30) NOT NULL,"
                + "FOREIGN KEY(c_email) REFERENCES user(u_email))";
        String createTableOfficial = "CREATE TABLE IF NOT EXISTS official"
                + "(o_email VARCHAR(30) PRIMARY KEY NOT NULL, "
                + "FOREIGN KEY(o_email) REFERENCES user(u_email))";
        String createTableVoter = "CREATE TABLE IF NOT EXISTS voter"
                + "(v_email VARCHAR(30) PRIMARY KEY NOT NULL, "
                + "state VARCHAR(30) NOT NULL, "
                + "candidate_email VARCHAR(30),"
                + "FOREIGN KEY(v_email) REFERENCES user(u_email),"
                + "FOREIGN KEY(candidate_email) REFERENCES candidate(c_email))";
        FileInputStream p1 = null;
        FileInputStream p2 = null;
        FileInputStream p3 = null;
        FileInputStream p4 = null;
        FileInputStream p5 = null;
        FileInputStream p6 = null;
        FileInputStream p7 = null;
        FileInputStream p8 = null;
        FileInputStream p9 = null;
        FileInputStream p10 = null;
        FileInputStream p11 = null;
        FileInputStream p12 = null;
        FileInputStream p13 = null;
        FileInputStream p14 = null;
        FileInputStream p15 = null;
        FileInputStream p16 = null;
        FileInputStream p17 = null;
        FileInputStream p18 = null;
        FileInputStream p19 = null;
        FileInputStream p20 = null;
        FileInputStream p21 = null;
        FileInputStream p22 = null;
        FileInputStream p23 = null;
        FileInputStream p24 = null;
        FileInputStream p25 = null;
        FileInputStream p26 = null;
        FileInputStream p27 = null;
        FileInputStream p28 = null;
        FileInputStream p29 = null;
        FileInputStream p30 = null;
        FileInputStream p31 = null;
        FileInputStream p32 = null;
        try
        {
            p1 = new FileInputStream("C:\\Users\\Seb\\Pictures\\dupont-aignan.jpg");
            p2 = new FileInputStream("C:\\Users\\Seb\\Pictures\\le_pen.jpg");
            p3 = new FileInputStream("C:\\Users\\Seb\\Pictures\\macron.jpg");
            p4 = new FileInputStream("C:\\Users\\Seb\\Pictures\\hamon.jpg");
            p5 = new FileInputStream("C:\\Users\\Seb\\Pictures\\arthaud.jpg");
            p6 = new FileInputStream("C:\\Users\\Seb\\Pictures\\poutou.jpg");
            p7 = new FileInputStream("C:\\Users\\Seb\\Pictures\\cheminade.jpg");
            p8 = new FileInputStream("C:\\Users\\Seb\\Pictures\\lassalle.jpg");
            p9 = new FileInputStream("C:\\Users\\Seb\\Pictures\\melanchon.jpg");
            p10 = new FileInputStream("C:\\Users\\Seb\\Pictures\\asselineau.jpg");
            p11= new FileInputStream("C:\\Users\\Seb\\Pictures\\fillon.jpg");
            p12 = new FileInputStream("C:\\Users\\Seb\\Pictures\\official1.jpg");
            p13 = new FileInputStream("C:\\Users\\Seb\\Pictures\\official2.jpg");
            p14 = new FileInputStream("C:\\Users\\Seb\\Pictures\\official3.jpg");
            p15 = new FileInputStream("C:\\Users\\Seb\\Pictures\\official4.jpg");
            p16 = new FileInputStream("C:\\Users\\Seb\\Pictures\\official5.jpg");
            p17 = new FileInputStream("C:\\Users\\Seb\\Pictures\\official6.jpg");
            p18 = new FileInputStream("C:\\Users\\Seb\\Pictures\\amadeo.jpg");
            p19 = new FileInputStream("C:\\Users\\Seb\\Pictures\\bestaven.jpg");
            p20 = new FileInputStream("C:\\Users\\Seb\\Pictures\\burton.jpg");
            p21 = new FileInputStream("C:\\Users\\Seb\\Pictures\\cremer.jpg");
            p22 = new FileInputStream("C:\\Users\\Seb\\Pictures\\davies.jpg");
            p23 = new FileInputStream("C:\\Users\\Seb\\Pictures\\seguin.jpg");
            p24 = new FileInputStream("C:\\Users\\Seb\\Pictures\\escoffier.jpg");
            p25 = new FileInputStream("C:\\Users\\Seb\\Pictures\\le_cam.jpg");
            p26 = new FileInputStream("C:\\Users\\Seb\\Pictures\\dalin.jpg");
            p27 = new FileInputStream("C:\\Users\\Seb\\Pictures\\thomson.jpg");
            p28 = new FileInputStream("C:\\Users\\Seb\\Pictures\\destremau.jpg");
            p29 = new FileInputStream("C:\\Users\\Seb\\Pictures\\herrmann.jpg");
            p30 = new FileInputStream("C:\\Users\\Seb\\Pictures\\ruyant.jpg");
            p31 = new FileInputStream("C:\\Users\\Seb\\Pictures\\tripon.jpg");
            p32 = new FileInputStream("C:\\Users\\Seb\\Pictures\\beyou.jpg");
            
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Connecting.class.getName()).log(Level.SEVERE, null, ex);
        }
        String addUser = "INSERT INTO user(u_email, u_password, u_first_name, u_last_name, photo)"
                + "VALUES"
                + "('nicolas.dupont-aignan@mail.com', 'abcdef', 'Nicolas', 'Dupont-Aignan', '" + p1 + "'),"
                + "('marine.lepen@mail.com', 'abcdef', 'Marine', 'Le Pen', '" + p2 + "'),"
                + "('emmanuel.macron@mail.com', 'abcdef', 'Emmanuel', 'Macron', '" + p3 + "'),"
                + "('benoit.hamon@mail.com', 'abcdef', 'Benoît', 'Hamon', '" + p4 + "'),"
                + "('nathalie.arthaud@mail.com', 'abcdef', 'Nathalie', 'Arthaud', '" + p5 + "'),"
                + "('philippe.poutou@mail.com', 'abcdef', 'Philippe', 'Poutou', '" + p6 + "'),"
                + "('jacques.cheminade@mail.com', 'abcdef', 'Jacques', 'Cheminade', '" + p7 + "'),"
                + "('jean.lassalle@mail.com', 'abcdef', 'Jean', 'Lassalle', '" + p8 + "'),"
                + "('jean-luc.melanchon@mail.com', 'abcdef', 'Jean-Luc', 'Melanchon', '" + p9 + "'),"
                + "('francois.asselineau@mail.com', 'abcdef', 'François', 'Asselineau', '" + p10 + "'),"
                + "('francois.fillon@mail.com', 'abcdef', 'François', 'Fillon', '" + p11 + "'),"
                + "('official1@mail.com', 'abcdef', 'Jean', 'Petit', '" + p12 + "'),"
                + "('official2@mail.com', 'abcdef', 'Nicolas', 'Grand', '" + p13 + "'),"
                + "('official3@mail.com', 'abcdef', 'Alice', 'Moyen', '" + p14 + "'),"
                + "('official4@mail.com', 'abcdef', 'Léa', 'Dupuis', '" + p15 + "'),"
                + "('official5@mail.com', 'abcdef', 'Romane', 'Dupont', '" + p16 + "'),"
                + "('official6@mail.com', 'abcdef', 'Louis', 'Dufour', '" + p17 + "'),"
                + "('fabrice.amadeo@mail.com', 'abcdef', 'Fabrice', 'Amadeo', '" + p18 + "'),"
                + "('yannick.bestaven@mail.com', 'abcdef', 'Yannick', 'Bestaven', '" + p19 + "'),"
                + "('louis.burton@mail.com', 'abcdef', 'Louis', 'Burton', '" + p20 + "'),"
                + "('clarisse.cremer@mail.com', 'abcdef', 'Clarisse', 'Cremer', '" + p21 + "'),"
                + "('samanta.davies@mail.com', 'abcdef', 'Samanta', 'Davies', '" + p22 + "'),"
                + "('damien.seguin@mail.com', 'abcdef', 'Damien', 'Seguin', '" + p23 + "'),"
                + "('kevin.escoffier@mail.com', 'abcdef', 'Kevin', 'Escoffier', '" + p24 + "'),"
                + "('jean.lecam@mail.com', 'abcdef', 'Jean', 'Le Cam', '" + p25 + "'),"
                + "('charlie.dalin@mail.com', 'abcdef', 'Charlie', 'Dalin', '" + p26 + "'),"
                + "('alex.thomson@mail.com', 'abcdef', 'Alex', 'Thomson', '" + p27 + "'),"
                + "('sebastien.destremau@mail.com', 'abcdef', 'Sébastien', 'Destremau', '" + p28 + "'),"
                + "('boris.hermann@mail.com', 'abcdef', 'Boris', 'Hermann', '" + p29 + "'),"
                + "('thomas.ruyant@mail.com', 'abcdef', 'Thomas', 'Ruyant', '" + p30 + "'),"
                + "('armel.tripon@mail.com', 'abcdef', 'Armel', 'Tripon', '" + p31 + "'),"
                + "('jeremie.beyou@mail.com', 'abcdef', 'Jérémie', 'Beyou', '" + p32 + "'),";
        String addCandidate = "INSERT INTO candidate(c_email, political_party)"
                + "VALUES"
                + "('nicolas.dupont-aignan@mail.com', 'Debout la France'),"
                + "('marine.lepen@mail.com', 'Rassemblement National'),"
                + "('emmanuel.macron@mail.com', 'La République En Marche'),"
                + "('benoit.hamon@mail.com', 'Parti Socialiste'),"
                + "('nathalie.arthaud@mail.com', 'Lutte Ouvrière'),"
                + "('philippe.poutou@mail.com', 'Nouveau Parti Anticapitaliste'),"
                + "('jacques.cheminade@mail.com', 'Solidarité et Progrès'),"
                + "('jean.lassalle@mail.com', 'Résistons !'),"
                + "('jean-luc.melanchon@mail.com', 'La France Insoumise'),"
                + "('francois.asselineau@mail.com', 'Frexit'),"
                + "('francois.fillon@mail.com', 'Les Républicains');";
        String addOfficial = "INSERT INTO official(o_email)"
                + "VALUES"
                + "('official1@mail.com'),"
                + "('official2@mail.com'),"
                + "('official3@mail.com'),"
                + "('official4@mail.com'),"
                + "('official5@mail.com'),"
                + "('official6@mail.com');";
        String addVoter = "INSERT INTO voter(v_email, state)"
                + "VALUES"
                + "('fabrice.amadeo@mail.com', 'Pays de la Loire'),"
                + "('yannick.bestaven@mail.com', 'Pays de la Loire'),"
                + "('louis.burton@mail.com', 'Ile-de-France'),"
                + "('clarisse.cremer@mail.com', 'Ile-de-France'),"
                + "('samanta.davies@mail.com', 'Royaume-Uni'),"
                + "('damien.seguin@mail.com', 'Rhône-Alpes'),"
                + "('kevin.escoffier@mail.com', 'Bretagne'),"
                + "('jean.lecam@mail.com', 'Bretagne'),"
                + "('charlie.dalin@mail.com', 'Normandie'),"
                + "('alex.thomson@mail.com', 'Royaume-Uni'),"
                + "('sebastien.destremau@mail.com', 'Bretagne'),"
                + "('boris.hermann@mail.com', 'Allemagne'),"
                + "('thomas.ruyant@mail.com', 'Hauts-de-France'),"
                + "('armel.tripon@mail.com', 'Pays de la Loire'),"
                + "('jeremie.beyou@mail.com', 'Bretagne');";
        try {
            newDBConnection(true);
            Statement statement = connection.createStatement();
            statement.execute(createDB);
            newDBConnection();
            statement = connection.createStatement();
            statement.execute(createTableUser);
            statement.execute(createTableCandidate);
            statement.execute(createTableOfficial);
            statement.execute(createTableVoter);
            statement.execute(addUser);
            statement.execute(addCandidate);
            statement.execute(addOfficial);
            statement.execute(addVoter);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteDB() {
        try {
            connection = getDBConnection();
            Statement statement = connection.createStatement();
            String deleteDB = "DROP DATABASE voting";
            statement.execute(deleteDB);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
