package kumar.gautam.jdbc;

import java.io.*;
import java.sql.*;
public class JdbcApp01 {
      
	public static void main(String args[]) throws Exception {
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM","Java");
		Statement st=con.createStatement();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Table name:");
		String tname=br.readLine();
		String query = "create table "+tname+"(eno number(3) primary key,ename varchar2(10),esal float(5),eadd varchar2(12))";
		st.executeUpdate(query);
		System.out.println("table "+tname+" created successfully...");
		
		con.close();
	

	}
	
}
