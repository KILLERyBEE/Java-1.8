import java.sql.*;
class DBInsert
{
public static void main(String s[])
{
try
{
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Avdhut@767");
PreparedStatement st= con.prepareStatement("Insert Into Student Value (?,?)");
st.setString(1,"Parish");
st.setInt(2,3);
st.executeUpdate();
ResultSet rs = st.executeQuery("Select * From Student");
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

