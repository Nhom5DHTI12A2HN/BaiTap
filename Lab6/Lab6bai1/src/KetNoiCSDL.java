
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author LENOVO
 */
public class KetNoiCSDL {

    Connection cn = null;

    public KetNoiCSDL() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/qlsv";
        this.cn = DriverManager.getConnection(url, "root", "");
    }

    public ResultSet LayDL(String tenbang) throws SQLException {
        ResultSet kq = null;
        Statement st = this.cn.createStatement();
        String sql = "select * from sinhvien";
        kq = st.executeQuery(sql);
        return kq;
    }

    public static void main(String[] args) throws SQLException {
        KetNoiCSDL a = new KetNoiCSDL();
        ResultSet rs = a.LayDL("sinhvien");
        while (rs.next()) {
            System.out.println("ID: "+rs.getString(1)+"   user: "+rs.getString(2)+"   pass: "+rs.getString(3)+"   name: "+rs.getString(4));
        }
    }
}
