package Model;

import java.sql.*;

public class Connecting {
    private final static String DBName = "voting";
    private final static String url1 = "jdbc:mysql://localhost:3306/";
    private final static String url2 = url1 + DBName;
    private final static String username = "root";
    private final static String password = "";

    public static Connection getDBConnection() {
        try {
            Connection connection = DriverManager.getConnection(url2, username, password);
            return connection;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
        public static Connection getDBConnection(boolean arg) {
        try {
            Connection connection = DriverManager.getConnection(url1, username, password);
            return connection;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void initDB() {
        String createDB = "CREATE DATABASE IF NOT EXISTS " + DBName;
        String createTableUser = "CREATE TABLE IF NOT EXISTS user"
                + "(u_email VARCHAR(30) NOT NULL, "
                + "u_password VARCHAR(30) NOT NULL)";
        String createTableCandidate = "CREATE TABLE IF NOT EXISTS candidate"
                + "(c_email VARCHAR(30) PRIMARY KEY NOT NULL, "
                + "c_password VARCHAR(30) NOT NULL,"
                + "political_party VARCHAR(30) NOT NULL, "
                + "c_firstname VARCHAR(30) NOT NULL, "
                + "c_lastname VARCHAR(30) NOT NULL)";
        String createTableOfficial = "CREATE TABLE IF NOT EXISTS official"
                + "(o_email VARCHAR(30) PRIMARY KEY NOT NULL, "
                + "o_password VARCHAR(30) NOT NULL,"
                + "o_firstname VARCHAR(30) NOT NULL, "
                + "o_lastname VARCHAR(30) NOT NULL)";
        String createTableVoter = "CREATE TABLE IF NOT EXISTS voter"
                + "(v_email VARCHAR(30) PRIMARY KEY NOT NULL, "
                + "v_password VARCHAR(30) NOT NULL,"
                + "v_firstname VARCHAR(30) NOT NULL, "
                + "v_lastname VARCHAR(30) NOT NULL, "
                + "state VARCHAR(30) NOT NULL)";
        String createTableCandidate_voter = "CREATE TABLE IF NOT EXISTS candidate_voter"
                + "(candidate_email VARCHAR(30) NOT NULL,"
                + "voter_email VARCHAR(30) NOT NULL,"
                + "PRIMARY KEY(candidate_email, voter_email));";
        /*String addUser = "INSERT INTO user(email, password)"
                + "VALUES"
                + "('jean.lassalle@gmail.com', 'abcdef'),"
                + "('nicolas.sarkozy@gmail.com', 'abcdef'),"
                + "('emmanuel.macron@gmail.com', 'abcdef'),"
                + "('official1@gmail.com', 'abcdef'),"
                + "('official2@gmail.com', 'abcdef'),"
                + "('official3@gmail.com', 'abcdef'),"
                + "('voter1@gmail.com', 'abcdef'),"
                + "('voter2@gmail.com', 'abcdef'),"
                + "('voter3@gmail.com', 'abcdef');";
                // à compléter*/
        String addCandidate = "INSERT INTO candidate(c_email, c_password, political_party, c_firstname, c_lastname)"
                + "VALUES"
                + "('nicolas.dupont-aignan@mail.com', 'abcdef', 'Debout la France', 'Nicolas', 'Dupont-Aignant'),"
                + "('marine.lepen@mail.com', 'abcdef', 'Rassemblement National', 'Marine', 'Le Pen'),"
                + "('emmanuel.macron@mail.com', 'abcdef', 'La République En Marche', 'Emmanuel', 'Macron'),"
                + "('benoit.hamon@mail.com', 'abcdef', 'Parti Socialiste', 'Benoît', 'Hamon'),"
                + "('nathalie.arthaud@mail.com', 'abcdef', 'Lutte Ouvrière', 'Nathalie', 'Arthaud'),"
                + "('philippe.poutou@mail.com', 'abcdef', 'Nouveau Parti Anticapitaliste', 'Philippe', 'Poutou'),"
                + "('jacques.cheminade@mail.com', 'abcdef', 'Solidarité et Progrès', 'Jacques', 'Cheminade'),"
                + "('jean.lassalle@mail.com', 'abcdef', 'Résistons !', 'Jean', 'Lassalle'),"
                + "('jean-luc.melanchon@mail.com', 'abcdef', 'La France Insoumise', 'Jean-Luc', 'Mélanchon'),"
                + "('francois.asselineau@mail.com', 'abcdef', 'Frexit', 'François', 'Asselineau'),"
                + "('francois.fillon@mail.com', 'abcdef', 'Les Républicains', 'François', 'Fillon');";
        String addOfficial = "INSERT INTO official(o_email, o_password, o_firstname, o_lastname)"
                + "VALUES"
                + "('official1@gmail.com', 'abcdef', 'Jean', 'Petit'),"
                + "('official2@gmail.com', 'abcdef', 'Nicolas', 'Grand'),"
                + "('official3@gmail.com', 'abcdef', 'Alice', 'Moyen'),"
                + "('official4@gmail.com', 'abcdef', 'Léa', 'Dupuis'),"
                + "('official5@gmail.com', 'abcdef', 'Romane', 'Dupont'),"
                + "('official6@gmail.com', 'abcdef', 'Louis', 'Dufour');";
        String addVoter = "INSERT INTO voter(v_email, v_password, v_firstname, v_lastname, state)"
                + "VALUES"
                + "('fabrice.amadeo@mail.com', 'abcdef', 'Fabrice', 'Amadeo', 'Pays de la Loire'),"
                + "('yannick.bestaven@mail.com', 'abcdef', 'Yannick', 'Bestaven', 'Pays de la Loire'),"
                + "('louis.burton@mail.com', 'abcdef', 'Louis', 'Burton', 'Ile-de-France'),"
                + "('clarisse.cremer@mail.com', 'abcdef', 'Clarisse', 'Cremer', 'Ile-de-France'),"
                + "('samanta.davies@mail.com', 'abcdef', 'Samanta', 'Davies', 'Royaume-Uni'),"
                + "('damien.seguin@mail.com', 'abcdef', 'Damien', 'Seguin', 'Rhône-Alpes'),"
                + "('kevin.escoffier@mail.com', 'abcdef', 'Kevin', 'Escoffier', 'Bretagne'),"
                + "('jean.lecam@mail.com', 'abcdef', 'Jean', 'Le Cam', 'Bretagne'),"
                + "('charlie.dalin@mail.com', 'abcdef', 'Charlie', 'Dalin', 'Normandie'),"
                + "('alex.thomson@mail.com', 'abcdef', 'Alex', 'Thomson', 'Royaume-Uni'),"
                + "('sebastien.destremau@mail.com', 'abcdef', 'Sébastien', 'Destremau', 'Bretagne'),"
                + "('boris.hermann@mail.com', 'abcdef', 'Boris', 'Hermann', 'Allemagne'),"
                + "('thomas.ruyant@mail.com', 'abcdef', 'Thomas', 'Ruyant', 'Hauts-de-France'),"
                + "('armel.tripon@mail.com', 'abcdef', 'Armel', 'Tripon', 'Pays de la Loire'),"
                + "('jeremie.beyou@mail.com', 'abcdef', 'Jérémie', 'Beyou', 'Bretagne');";
        try {
            Connection connection = getDBConnection(true);
            Statement statement = connection.createStatement();
            statement.execute(createDB);
            connection = getDBConnection();
            statement = connection.createStatement();
            statement.execute(createTableUser);
            statement.execute(createTableCandidate);
            statement.execute(createTableOfficial);
            statement.execute(createTableVoter);
            statement.execute(createTableCandidate_voter);
            //statement.execute(addUser);
            statement.execute(addCandidate);
            statement.execute(addOfficial);
            statement.execute(addVoter);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteDB() {
        try {
            Connection connection = getDBConnection();
            Statement statement = connection.createStatement();
            String deleteDB = "DROP DATABASE voting";
            statement.execute(deleteDB);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}