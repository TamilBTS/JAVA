
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC {
    public static void main(String[] args) {
        studentDao s=new studentDao();
        s.connect();
         s.get();
       // s.add(1, "arasi");
    //s.delete(2);
    //s.update(1, "machi");
    }
          
}
class student{
int sno;
String sname;
}
class studentDao{
    Connection con=null;
void connect(){
try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tamil","root","");
}catch(ClassNotFoundException e){} catch (SQLException e) {
        }
       
}
void get(){
try{
    String query="select * from `table`" ;
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(query);
    
    student s=new student();
    while(rs.next()){
    s.sno=rs.getInt(1);
    s.sname=rs.getString(2);
    System.out.println("reg no :" + s.sno + "\n" + "name :" + s.sname);
    }
    
}catch(Exception e){}
}
void add(int a,String name){
try{
String query="INSERT INTO `table`(`sno`, `sname`) VALUES (?,?)";
PreparedStatement pt=con.prepareStatement(query);
pt.setInt(1, a);
pt.setString(2,name);
pt.executeUpdate();
    System.out.println("record inserted successfully");
}
catch(Exception e){System.out.println(e);}
}
void delete(int a){
try{
String query="delete from `table` where sno=" + a;
Statement st=con.createStatement();
int b=st.executeUpdate(query);
    System.out.println("Deleted successfully");
}
catch(Exception e){}
}
void update(int a,String name){
try{
String query="UPDATE `table` SET `sno`=?,`sname`=? WHERE `sno`="+a;
PreparedStatement pt=con.prepareStatement(query);
pt.setInt(1, a);
pt.setString(2, name);

pt.executeUpdate();
    System.out.println("Record updated");
}catch(Exception e){System.out.println(e);}
}
}
