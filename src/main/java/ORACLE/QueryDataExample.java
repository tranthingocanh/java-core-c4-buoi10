package ORACLE;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;

public class QueryDataExample {
    public static void main(String[] args) throws SQLException {
        // Lấy ra đối tượng Connection kết nối vào DB.
        Connection connection = ConnectionUtils.getOracleConnection();
        // Tạo đối tượng Statement.
        Statement statement = connection.createStatement();
        String sql = "SELECT ID, NAME, EMAIL, PHONE FROM EMPLOYEE";
        // Thực thi câu lệnh SQL trả về đối tượng ResultSet.
        ResultSet rs = statement.executeQuery(sql);
        // Duyệt trên kết quả trả về.
        while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
            String maNV = rs.getString(1);
            String tenNV = rs.getString(2);
            String email = rs.getString(3);
            String phone = rs.getString(4);
            System.out.println("--------------------");
            System.out.println("Ma NV:" + maNV);
            System.out.println("Ten NV:" + tenNV);
            System.out.println("EMAIL:" + email);
            System.out.println("SDT:" + phone);
        }
        // Đóng kết nối
        connection.close();

    }
}
