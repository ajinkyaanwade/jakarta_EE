package practice;

//import java.util.*;
//import java.util.*;
//class MyAritException extends Exception 
//{
//	public MyAritException(String s)
//	{
//		super(s);
//	}
//}
//class Calculator
//{
//	public static int caldouble(int num)throws MyAritException
//	{
//		if(num==0)
//		{
//			throw new MyAritException("zero not allowed");
//		}
//		else if(num<0)
//		{
//			throw new MyAritException("negative not allowed");
//		}
//		return(num+num);
//	}
//}
//public class Demo
//{
//	public static void main(String[] args) 
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num=sc.nextInt();
//		int result=0;
//		try
//		{
//			result=Calculator.caldouble(num);
//			System.out.println(result);
//		}
//		catch(MyAritException aju)
//		{
//			System.out.println(aju);
//		}
//	}
//}


//package practice;
//import java.util.*;
//class NumberNotDivisibleBySevenException extends Exception
//{
//	public NumberNotDivisibleBySevenException(String ref) 
//	{
//		super(ref);
//	}
//}
//class MyMath
//{
//	public void disp(int num) throws NumberNotDivisibleBySevenException
//	{
//		if(num%7!=0)
//		{
//			throw new NumberNotDivisibleBySevenException("number not divisible by seven");
//		}
//	}
//}
//public class Demo
//{
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		MyMath m=new MyMath();
//		int a=sc.nextInt();
//		int result=0;
//		try
//		{
//			m.disp(a);
//			System.out.println("number is divisible by 7");
//		}
//		catch(NumberNotDivisibleBySevenException mess)
//		{
//			System.out.println(mess);
//		}
//	}
//}


//package practice;
//import java.util.*;
//class MyException extends Exception
//{
//	public MyException(String message) 
//	{
//		super(message);
//	}
//}
//class Demo
//{
//	public void show1()
//	{
//		try
//		{
//			show2();
//			System.out.println("number is less than 10");
//		}
//		catch(MyException mess) 
//		{
//			mess.printStackTrace();
//		}
//	}
//	public void show2()throws MyException
//	{
//		show3();
//	}
//	public void show3()throws MyException
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number");
//		int a=sc.nextInt();
//		if(a>10)
//		{
//			throw new MyException("number is greater than 10");
//		}
//		
//	}
//	public static void main(String[] args)
//	{
//		Demo d=new Demo();
//		d.show1();
//	}
//}


//package practice;
import java.util.*;
class InvalidLengthException extends Exception
{
	public InvalidLengthException(String message)
	{
		super(message);
    }
	
}
class Authentication
{
	public Authentication(String ss) throws InvalidLengthException
	{
		if(ss.length()<5 || ss.length()>9)
		{
			throw new InvalidLengthException("InvalidLengthException");
		}
	}
	public void done()
	{
		System.out.println("successful authentication");
	}
}
public class Demo
{
	public static void main(String[] args) 
	{
	try
	  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the password");
		String a=sc.next();
	   Authentication a1=new Authentication(a);
	   a1.done();
	  }
	catch(InvalidLengthException ref)
	  {
		ref.printStackTrace();
	  }
	}
}

//
////Que5)
//
//package devpack;
//
//
///**
// * @author JISHAN MULANI
// *
// */
//public class ResourceNotAllocatedException extends Exception
//{
//	public  ResourceNotAllocatedException(String ss)
//	{
//		super(ss);
//	}
//}
//
////____________
//
//package devpack;
//
//
///**
// * @author JISHAN MULANI
// *
// */
//
//public class MyResource implements AutoCloseable
//{
//	public MyResource(int capacity) throws ResourceNotAllocatedException
//	{
//		if(capacity>100)
//		{
//			throw new ResourceNotAllocatedException("not sufficient space");
//		}
//	}
//	
//	public void disp()
//	    {
//	    	System.out.println("successful");
//	    }
//	 
//	 @Override
//		public void close()  
//	 {
//			System.out.println("resource is closed");
//			
//	 }
//}
//
////_______________
//
//package clientpack;
//import java.util.Scanner;
//import devpack.*;
//
//package practice;
//import java.util.*;
//class MyAritException extends Exception 
//{
//	public MyAritException(String s)
//	{
//		super(s);
//	}
//}
//class Calculator
//{
//	public static int caldouble(int num)throws MyAritException
//	{
//		if(num==0)
//		{
//			throw new MyAritException("zero not allowed");
//		}
//		else if(num<0)
//		{
//			throw new MyAritException("negative not allowed");
//		}
//		return(num+num);
//	}
//}
//public class MyCalcApp
//{
//	public static void main(String[] args) 
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num=sc.nextInt();
//		int result=0;
//		try
//		{
//			result=Calculator.caldouble(num);
//			System.out.println(result);
//		}
//		catch(MyAritException aju)
//		{
//			System.out.println(aju);
//		}
//	}
//}
//
//
//package practice;
//import java.util.*;
//class NumberNotDivisibleBySevenException extends Exception
//{
//	public NumberNotDivisibleBySevenException(String ref) 
//	{
//		super(ref);
//	}
//}
//class MyMath
//{
//	public void disp(int num) throws NumberNotDivisibleBySevenException
//	{
//		if(num%7!=0)
//		{
//			throw new NumberNotDivisibleBySevenException("number not divisible by seven");
//		}
//	}
//}
//public class Demo
//{
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		MyMath m=new MyMath();
//		int a=sc.nextInt();
//		int result=0;
//		try
//		{
//			m.disp(a);
//			System.out.println("number is divisible by 7");
//		}
//		catch(NumberNotDivisibleBySevenException mess)
//		{
//			System.out.println(mess);
//		}
//	}
//}
//
//
//package practice;
//import java.util.*;
//class MyException extends Exception
//{
//	public MyException(String message) 
//	{
//		super(message);
//	}
//}
//class Demo
//{
//	public void show1()
//	{
//		try
//		{
//			show2();
//			System.out.println("number is less than 10");
//		}
//		catch(MyException mess) 
//		{
//			mess.printStackTrace();
//		}
//	}
//	public void show2()throws MyException
//	{
//		show3();
//	}
//	public void show3()throws MyException
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number");
//		int a=sc.nextInt();
//		if(a>10)
//		{
//			throw new MyException("number is greater than 10");
//		}
//		
//	}
//	public static void main(String[] args)
//	{
//		Demo d=new Demo();
//		d.show1();
//	}
//}
//
//
//package practice;
//import java.util.*;
//class InvalidLengthException extends Exception
//{
//	public InvalidLengthException(String message)
//	{
//		super(message);
//    }
//	
//}
//class Authentication
//{
//	public Authentication(String ss) throws InvalidLengthException
//	{
//		if(ss.length()<5 || ss.length()>9)
//		{
//			throw new InvalidLengthException("InvalidLengthException");
//		}
//	}
//	public void done()
//	{
//		System.out.println("successful authentication");
//	}
//}
//public class Demo
//{
//	public static void main(String[] args) 
//	{
//	try
//	  {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the password");
//		String a=sc.next();
//	   Authentication a1=new Authentication(a);
//	   a1.done();
//	  }
//	catch(InvalidLengthException ref)
//	  {
//		ref.printStackTrace();
//	  }
//	}
//}
//
//
////Que5)
//
//package devpack;
//
//
///**
// * @author JISHAN MULANI
// *
// */
//public class ResourceNotAllocatedException extends Exception
//{
//	public  ResourceNotAllocatedException(String ss)
//	{
//		super(ss);
//	}
//}
//
////____________
//
//package devpack;
//
//
///**
// * @author JISHAN MULANI
// *
// */
//
//public class MyResource implements AutoCloseable
//{
//	public MyResource(int capacity) throws ResourceNotAllocatedException
//	{
//		if(capacity>100)
//		{
//			throw new ResourceNotAllocatedException("not sufficient space");
//		}
//	}
//	
//	public void disp()
//	    {
//	    	System.out.println("successful");
//	    }
//	 
//	 @Override
//		public void close()  
//	 {
//			System.out.println("resource is closed");
//			
//	 }
//}
//*/