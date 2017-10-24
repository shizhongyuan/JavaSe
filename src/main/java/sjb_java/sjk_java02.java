package sjb_java;
import java.sql.*;
public class sjk_java02 {
    static final String USER = "root";                                   //用户名
    static final String PASS = "95927.szy";                             //密码
    static final String DB_URL="jdbc:mysql://localhost/sjk_06";     //进入表名
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting to database...");
        Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        System.out.println(conn);
        System.out.println("Creating statement...");
        Statement stmt = conn.createStatement();
        String sql;


//        sql = "INSERT INTO sjb06_1 " +
//                "VALUES (10, '谷子',26,1599999, '广西柳州')";       // 插入数据
//        stmt.executeUpdate(sql);
//        System.out.println("Inserted records into the table...");
//
//
//        sql = "SELECT id,name,age,phone_number,addr FROM sjb06_1";
//        ResultSet rs = stmt.executeQuery(sql);
//        while(rs.next()){
//            int id  = rs.getInt("id");
//            String name = rs.getString("name");
//            int age = rs.getInt("age");
//            int phone_number = rs.getInt("phone_number");
//            String addr = rs.getString("addr");
//
//            //Display values
//            System.out.print(" ID: " + id);
//            System.out.print("  名字: " + name);
//            System.out.print(", 年龄: " + age);
//            System.out.println(", 号码: " + phone_number);
//            System.out.println(", 地址: "+addr);


            sql = "UPDATE sjb06_1 " +               // 更新数据
                    "SET age = 22 WHERE id=1";
            stmt.executeUpdate(sql);
        }
}
