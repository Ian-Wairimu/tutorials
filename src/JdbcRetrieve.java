import java.sql.*;

public class JdbcRetrieve {
    public static void main(String args[]){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection(
                        "jdbc:mysql://139.177.180.24:3306/tracom","muturi","254KeNYA&&!!");
                //here tracom is database name, muturi is username and 254KeNYA&&!! is the password
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from student");
                while(rs.next())
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
                con.close();
            }
            catch(Exception e)
            { System.out.println(e);}
        }
    }

