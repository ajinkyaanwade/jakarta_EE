package mypack;

public class Logic 
{
	String s;
	public void setS(String s)
	{
		this.s=s;
	}
	public String getS()
	{
		if(s.equalsIgnoreCase("B.E"))
			return "You are allowed to do C-Dac";
		else
			return "Invalid Input";
	}
}
