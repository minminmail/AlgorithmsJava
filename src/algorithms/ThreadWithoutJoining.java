package algorithms;

import  java.io.*;

public class ThreadWithoutJoining extends Thread{
	
	@Override
	public void run()
	{
		for( int i=0;i<2;i++)
		{
			try
			{
				Thread.sleep(5000);
				System.out.println("Current Thread:"+Thread.currentThread().getName());
			}
			catch(Exception ex)
			{
				System.out.println("Excetpion has"+"been caught"+ex);
			}
			
			System.out.println(i);
		}
			
		}
		
	 static class GFG
	 {
		 public static void main(String[] args) {
			 
			 ThreadJoining t1=new ThreadJoining();
			 ThreadJoining t2= new ThreadJoining();
			 ThreadJoining t3= new ThreadJoining();
			 
			 t1.start();
			 
			 try {
				 System.out.println("Current Thread: before t1.join() "+Thread.currentThread().getName());
				
			 }catch(Exception ex)
			 {
				 System.out.println("Exception has "+"been caught"+ex);
				 
			 }
			 
			 t2.start();
			 
			 //starts t3 after when thread t2 has died.
			 try
			 {
				 System.out.println("Current Thread:before t2.join()"+Thread.currentThread().getName());
			
			 }
			 catch(Exception ex)
			 {
				System.out.println("Exception has been"+"caught"+ex); 
				
				 
			 }
			 
			 t3.start();
			 
		 }
	 }

}
