import java.sql.*;
class DBDelete
{
public static void main(String s[])
{
try
{
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Avdhut@767");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("Select * From Student");
while(rs.next())
{
System.out.println("Name : " + rs.getString(1) + " Roll NO : " + rs.getString(2));
}
st.executeUpdate("Delete From Student where roll_no = 2");
rs = st.executeQuery("Select * From Student");
while(rs.next())
{
System.out.println("Name : " + rs.getString(1) + " Roll NO : " + rs.getString(2));
}
st.close();
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}

