package sjb_java;
import java.sql.*;
/**
 * Created by Administrator on 2017/9/24 0024.
 */
public class Jdbc01 {
    static final String USER = "root";                                   //用户名
    static final String PASS = "95927.szy";                             //密码
    static final String DB_URL="jdbc:mysql://localhost/sjk_05";     //进入表名
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting to database...");
        Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        System.out.println(conn);
        System.out.println("Creating statement...");
        Statement stmt = conn.createStatement();
        String sql;


//
//        sql = "CREATE TABLE xiaoxx01 " +            //  创建数据表 表名
//                "(id INTEGER not NULL, " +        // 21到24为属性
//                " mz VARCHAR(10), " +
//                " xb VARCHAR(10), " +
//                " PRIMARY KEY ( id ))";
//        stmt.executeUpdate(sql);
//        System.out.println("Created table in given database...");



//        sql = "INSERT INTO xiaoxx01 " +
//                "VALUES (100, 'C++', 'Li'),(101, 'java', 'bai')";       // 插入数据
//        stmt.executeUpdate(sql);
//        System.out.println("Inserted records into the table...");



        sql = "SELECT id,xb FROM xiaoxx01";                     // 表的删除数据
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            int id  = rs.getInt(1);
            String xb = rs.getString(2);
            System.out.print("ID:" + id+" ");
            System.out.println("小宝:" +xb+" ");
        }




        sql = "SELECT id,mz,kh,je  from sjb_lx01";    //  查看表数据 要执行的表动作加表名
        rs = stmt.executeQuery(sql);
        while(rs.next()){
            //Retrieve by column name
            int id  = rs.getInt(1);
            String mz = rs.getString(2);
            String kh = rs.getString(3);
            Double je = rs.getDouble(4);
            System.out.print("ID: " + id);
            System.out.print("序号: " + kh);
            System.out.print("名字: " + mz);
            System.out.println("钱: " + je);
        }


//        sql = "DROP TABLE sjb_mm ";                  // 删除表
//        stmt.executeUpdate(sql);
//        System.out.println("Table  deleted in given database...");
    }
}
