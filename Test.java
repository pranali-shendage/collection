class Test extends Thread 
{
  public void run()
  {
         try{
	    for(int i=1; i<=5; i++)
		{ System.out.printf("I = %d\n",i);
		  Thread.sleep(10000);
		}
	 }
	 catch(InterruptedException ex)
	 { System.out.println("Error is "+ex);
	 }
  }
}
