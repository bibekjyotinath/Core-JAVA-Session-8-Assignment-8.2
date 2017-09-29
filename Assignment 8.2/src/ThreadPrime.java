class CheckPrime extends Thread {				//class created CheckPrime extends Thread class
	public void Run(int num) {					//run method created and pass an argument
		
		if(num % 2 == 0) {											//condition to check prime number
			System.out.println("The number " +num+ " is prime");     //statement prints on console
		}
		else
		{
			System.out.println("The number " +num+ " is not prime");   //statement prints on console
		}
	}
}

class CheckPrime1 implements Runnable {			//class created CheckPrime1 extends Runnable class		

	@Override
	public void run() {						   //overriding the method declared in Runnable Interface
		int i;								   //integer variable declaration
		System.out.println("The prime numbers are: ");
		for(i=0; i<20; i++)					   //for loop to print prime number between 20
		{
			if(i % 2 == 0) {						//checks the prime number 
				System.out.println(i);     //prints the number on console
			}
		}
		
	}
	
}
public class ThreadPrime {          //main class 

	public static void main(String[] args) {      //main method of  the program
		
		CheckPrime cp = new CheckPrime();        //object creation of CheckPrime
		CheckPrime1 cp1 = new CheckPrime1();		//object creation of CheckPrime1
		
		cp.Run(155);				//calling of method Run using object cp
		cp.Run(280);				//calling of method Run using object cp
		cp1.run();				//calling of method run using object cp1
	}

}
