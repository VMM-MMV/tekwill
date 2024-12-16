import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class DatabaseSetup {

    private static final String URL = "jdbc:postgresql://junction.proxy.rlwy.net:33116/railway";
    private static final String USER = "postgres";
    private static final String PASSWORD = "UMWSUDrpIFpDQgGqdTXZIWbNtlvPGBfZ";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            createSpeciesTable(connection);

            insertSpeciesData(connection);

            createAnimalsTable(connection);

            insertAnimalsData(connection);

            System.out.println("Database setup completed successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createSpeciesTable(Connection connection) throws SQLException {
        String createSpeciesTableSQL =
                "CREATE TABLE IF NOT EXISTS species (" +
                        "    id SERIAL PRIMARY KEY," +
                        "    name CHARACTER VARYING(255)," +
                        "    num_acres NUMERIC" +
                        ")";

        try (PreparedStatement pstmt = connection.prepareStatement(createSpeciesTableSQL)) {
            pstmt.execute();
        }
    }

    private static void insertSpeciesData(Connection connection) throws SQLException {
        String insertSpeciesSQL =
                "INSERT INTO species (name, num_acres) VALUES (?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(insertSpeciesSQL)) {
            // Insert African Elephant
            pstmt.setString(1, "African Elephant");
            pstmt.setDouble(2, 7.5);
            pstmt.addBatch();

            // Insert Zebra
            pstmt.setString(1, "Zebra");
            pstmt.setDouble(2, 1.2);
            pstmt.addBatch();

            // Execute batch insert
            pstmt.executeBatch();
        }
    }

    private static void createAnimalsTable(Connection connection) throws SQLException {
        String createAnimalsTableSQL =
                "CREATE TABLE IF NOT EXISTS animals (" +
                        "    id SERIAL PRIMARY KEY," +
                        "    species_id INTEGER," +
                        "    name CHARACTER VARYING(255)," +
                        "    date_born TIMESTAMP WITHOUT TIME ZONE," +
                        "    FOREIGN KEY (species_id) REFERENCES species (id)" +
                        ")";

        try (PreparedStatement pstmt = connection.prepareStatement(createAnimalsTableSQL)) {
            pstmt.execute();
        }

    }

    private static void insertAnimalsData(Connection connection) throws SQLException {
        String insertAnimalsSQL =
                "INSERT INTO animals (species_id, name, date_born) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(insertAnimalsSQL)) {
            // Insert Elsa - African Elephant
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Elsa");
            pstmt.setObject(3, LocalDateTime.of(2001, 5, 6, 2, 15, 0));
            pstmt.addBatch();

            // Insert Zelda - Zebra
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Zelda");
            pstmt.setObject(3, LocalDateTime.of(2002, 8, 15, 9, 12, 0));
            pstmt.addBatch();

            // Insert Ester - African Elephant
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Ester");
            pstmt.setObject(3, LocalDateTime.of(2002, 9, 9, 10, 36, 0));
            pstmt.addBatch();

            // Insert Eddie - African Elephant
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Eddie");
            pstmt.setObject(3, LocalDateTime.of(2010, 6, 8, 1, 24, 0));
            pstmt.addBatch();

            // Insert Zoe - Zebra
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Zoe");
            pstmt.setObject(3, LocalDateTime.of(2005, 11, 12, 3, 44, 0));
            pstmt.addBatch();

            // Execute batch insert
            pstmt.executeBatch();
        }
    }
}
