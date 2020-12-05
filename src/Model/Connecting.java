package Model;

import java.sql.*;

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
                + "u_last_name VARCHAR(30) NOT NULL)";
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
        String addUser = "INSERT INTO user(u_email, u_password, u_first_name, u_last_name)"
                + "VALUES"
                + "('nicolas.dupont-aignan@mail.com', 'abcdef', 'Nicolas', 'Dupont-Aignan'),"
                + "('marine.lepen@mail.com', 'abcdef', 'Marine', 'Le Pen'),"
                + "('emmanuel.macron@mail.com', 'abcdef', 'Emmanuel', 'Macron'),"
                + "('benoit.hamon@mail.com', 'abcdef', 'Benoît', 'Hamon'),"
                + "('nathalie.arthaud@mail.com', 'abcdef', 'Nathalie', 'Arthaud'),"
                + "('philippe.poutou@mail.com', 'abcdef', 'Philippe', 'Poutou'),"
                + "('jacques.cheminade@mail.com', 'abcdef', 'Jacques', 'Cheminade'),"
                + "('jean.lassalle@mail.com', 'abcdef', 'Jean', 'Lassalle'),"
                + "('jean-luc.melanchon@mail.com', 'abcdef', 'Jean-Luc', 'Melanchon'),"
                + "('francois.asselineau@mail.com', 'abcdef', 'François', 'Asselineau'),"
                + "('francois.fillon@mail.com', 'abcdef', 'François', 'Fillon'),"
                + "('official1@gmail.com', 'abcdef', 'Jean', 'Petit'),"
                + "('official2@gmail.com', 'abcdef', 'Nicolas', 'Grand'),"
                + "('official3@gmail.com', 'abcdef', 'Alice', 'Moyen'),"
                + "('official4@gmail.com', 'abcdef', 'Léa', 'Dupuis'),"
                + "('official5@gmail.com', 'abcdef', 'Romane', 'Dupont'),"
                + "('official6@gmail.com', 'abcdef', 'Louis', 'Dufour'),"
                + "('fabrice.amadeo@mail.com', 'abcdef', 'Fabrice', 'Amadeo'),"
                + "('yannick.bestaven@mail.com', 'abcdef', 'Yannick', 'Bestaven'),"
                + "('louis.burton@mail.com', 'abcdef', 'Louis', 'Burton'),"
                + "('clarisse.cremer@mail.com', 'abcdef', 'Clarisse', 'Cremer'),"
                + "('samanta.davies@mail.com', 'abcdef', 'Samanta', 'Davies'),"
                + "('damien.seguin@mail.com', 'abcdef', 'Damien', 'Seguin'),"
                + "('kevin.escoffier@mail.com', 'abcdef', 'Kevin', 'Escoffier'),"
                + "('jean.lecam@mail.com', 'abcdef', 'Jean', 'Le Cam'),"
                + "('charlie.dalin@mail.com', 'abcdef', 'Charlie', 'Dalin'),"
                + "('alex.thomson@mail.com', 'abcdef', 'Alex', 'Thomson'),"
                + "('sebastien.destremau@mail.com', 'abcdef', 'Sébastien', 'Destremau'),"
                + "('boris.hermann@mail.com', 'abcdef', 'Boris', 'Hermann'),"
                + "('thomas.ruyant@mail.com', 'abcdef', 'Thomas', 'Ruyant'),"
                + "('armel.tripon@mail.com', 'abcdef', 'Armel', 'Tripon'),"
                + "('jeremie.beyou@mail.com', 'abcdef', 'Jérémie', 'Beyou');";
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
                + "('official1@gmail.com'),"
                + "('official2@gmail.com'),"
                + "('official3@gmail.com'),"
                + "('official4@gmail.com'),"
                + "('official5@gmail.com'),"
                + "('official6@gmail.com');";
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
