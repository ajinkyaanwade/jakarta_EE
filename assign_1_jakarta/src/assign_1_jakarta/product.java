package assign_1_jakarta;

public class product 
{
	private int pid,qty;
	private double cost;
	private String pname;
	
	public product(int pid, int qty, double cost, String pname)
	{
		super();
		this.pid = pid;
		this.qty = qty;
		this.cost = cost;
		this.pname = pname;
	}
	
	
	public int getPid()
	{
		return pid;
	}
	
	public void setPid(int pid) 
	{
		this.pid = pid;
	}
	
	public int getQty() 
	{
		return qty;
	}
	
	public void setQty(int qty) 
	{
		this.qty = qty;
	}
	
	public double getCost() 
	{
		return cost;
	}
	
	public void setCost(double cost) 
	{
		this.cost = cost;
	}
	
	public String getPname() 
	{
		return pname;
	}
	
	public void setPname(String pname) 
	{
		this.pname = pname;
	}

	@Override
	public String toString() 
	{
		return "product [pid=" + pid + ", qty=" + qty + ", cost=" + cost + ", pname=" + pname + "]";
	}
	
}
