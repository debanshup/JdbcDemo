package insert_action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import insert_info.InsertInfo;
import test_app.auth_cred.AuthCred;

public class InsertData {


    public static boolean insert(InsertInfo info) {

            boolean flag = false;

            final String name = info.getName();
            final String mobile_no = info.getMobile_no();
            final String full_address = info.getFull_address();
            final String pin_code = info.getPin_code();
            final String query = "INSERT INTO Customers (name, mobile_no, full_address, pin_code) VALUES (?, ?, ?, ?)";
            final AuthCred cred = new AuthCred();

            try (Connection con = DriverManager.getConnection(cred.getUrl(), cred.getUser(), cred.getPassword());
                    PreparedStatement pstmt = con.prepareStatement(query)) {

                pstmt.setString(1, name);
                pstmt.setString(2, mobile_no);
                pstmt.setString(3, full_address);
                pstmt.setString(4, pin_code);
                pstmt.executeUpdate();
                flag = true;

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }
            return flag;
        }

}
