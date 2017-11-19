import java.util.Scanner;

public class BlaBlaBla {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Я игровой автомат!");
		System.out.println("Запускаю баробан");
		int a = 1;
		int b = 6;
		int first = a + (int) (Math.random() * b) ;
		System.out.print(" ");
		int second = a + (int) (Math.random() * b);
		System.out.print(" ");
		int third = a + (int) (Math.random() * b);
		System.out.print(" ");
		System.out.print(first);
		System.out.print(" ");
		System.out.print(second);
		System.out.print(" ");
		System.out.print(third);
		System.out.print(" ");
		if(first != second ){
			System.out.println("Первое и второе числа не савпадают");
      	  
      	  }else {
      		     if (second == third) {
      		    	System.out.println("Джек пот");
      		    	 
      		                                                               }else {System.out.println("Ничья :)");       
      		                                                                      }
      		     } 
      		  
      		  
      	  }
      	  
	}
