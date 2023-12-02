package assign_1_jakarta;
import java.sql.*;
public class program 
{
	public static void main(String [] args)
	{
		product ref=new product(1,10,97.99,"Notebook");
		String ss="jdbc:mysql://localhost:3306/bit";
		
		/*try(Connection con =DriverManager.getConnection(ss,"root","root");)
		{
			PreparedStatement pst= con.prepareStatement("insert into product values(?,?,?,?)");
			pst.setInt(1, ref.getPid());
			pst.setInt(2, ref.getQty());
			pst.setDouble(3, ref.getCost());
			pst.setString(4, ref.getPname());
			int val=pst.executeUpdate();
			if(val>0)
			{
				System.out.println("records are successfully added");
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		ref=null;
		System.out.println("============="+ref+"==========");
		try(Connection con =DriverManager.getConnection(ss,"root","root");)
		{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select *from product");
			while(rs.next())
			{
				int pid=rs.getInt(1);
				int qty=rs.getInt(2);
				double cost=rs.getDouble(3);
				String pname=rs.getString(4);
				ref = new product(pid,qty,cost,pname);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println(ref);
	}
}
