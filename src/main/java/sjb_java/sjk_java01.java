package sjb_java;
import java.sql.*;
public class sjk_java01 {
    static final String USER = "root";
    static final String PASS = "95927.szy";
    static final String DB_URL="jdbc:mysql://localhost/sjk_04";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting to database...");
        Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        System.out.println(conn);
        System.out.println("Creating statement...");


        Statement stmt = conn.createStatement();
        String sql;
        sql = "SELECT id,sg,mz,bj FROM st_sf";
        ResultSet rs = stmt.executeQuery(sql);

        //STEP 5: Extract data from result set
        while(rs.next()){
            //Retrieve by column name
            int id  = rs.getInt(1);
            int sg = rs.getInt(2);
            String mz = rs.getString(3);
            int bj = rs.getInt(4);

            //Display values
            System.out.print("ID号:" + id+"  ");
            System.out.print("身高:" + sg+"  ");
            System.out.print("名字:" + mz+"  ");
            System.out.println("班级:" + bj+"  ");
        }
    }
}
