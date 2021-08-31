import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class JdbcDelete {
    static final String url = "jdbc:mysql://139.177.180.24/tracom";
    static final String user = "muturi";
    static final String pass = "254KeNYA&&!!";
    static final String query = "SELECT * FROM student";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "DELETE FROM student " +
                    "WHERE regno = 110";
            stmt.executeUpdate(sql);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                //Display values
                System.out.println(rs.getInt(1)+" " +
                        " "+rs.getString(2)+"" +
                        "  "+rs.getString(3)+"" +
                        " "+rs.getString(4)+"" +
                        " "+rs.getString(5));
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
