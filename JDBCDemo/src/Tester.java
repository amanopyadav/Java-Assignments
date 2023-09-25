import java.sql.*;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws Exception	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, make and cost");
		int lid = sc.nextInt();
		String make = sc.next();
		double cost = sc.nextDouble();
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");//name,usrename,pasword
				PreparedStatement pstmt=conn.prepareStatement("Insert into Laptop values(?,?,?)");
				pstmt.setInt(1,  lid);
				pstmt.setString(2,  make);
				pstmt.setDouble(3, cost);
				boolean status = pstmt.execute();
				if(!status)
					System.out.println("Row inserted successfully");
	}
}
