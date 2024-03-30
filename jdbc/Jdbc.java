import java.sql.*;
class jdbc {
     public static void main(String args[]){
        String url="";
        String unmae="";
        String query="";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,unmae,pass);
        ResultSet rs=st.executeQuery(query);
        Statement st=con.createSatement();
        String name =st.executeQuery("username");
        rs.next();
        System.out.println(uname);
        st.close();
        con.close();
     }
}