
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int num= 37;
		boolean isPrime = IsPrimeNumberWhile(num);
		if(!isPrime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		num=300;
		isPrime = false;
		isPrime = IsPrimeNumberDoWhile(num);
		if(!isPrime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		
		num=88;
		isPrime=false;
		isPrime = IsPrimeNumberFor(num);
		if(!isPrime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		
		// Print 2-100 even numbers using +2 increment
		for(int i=2;i<=100;i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println();
		// Print 2-100 even numbers using continue statement
		for(int i=1;i<=100;i++) {
			if (i%2!=0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
	
	public static boolean IsPrimeNumberWhile(int num) {
		int count = 2;	
		boolean isPrime = false;
//				True && (True || True)
//				True && (True)
//				True
		while(count<num/2 && (num!=0 || num!=1)) { // usually no need to iterate num-1
			if(num%count==0) {
				isPrime=true;
				break;
			}
			count++;
		}
		return isPrime;
	}
	public static boolean IsPrimeNumberDoWhile(int num) {
		int count = 2;	
		boolean isPrime = false;
//				True && (True || True)
//				True && (True)
//				True
		do {
			if(num%count==0) {
				isPrime=true;
				break;
			}
			count++;
		}while(count<num/2 && (num!=0 || num!=1));
		return isPrime;
	}
	public static boolean IsPrimeNumberFor(int num) {
			
		boolean isPrime = false;
//				True && (True || True)
//				True && (True)
//				True
		for(int c=2;c<num/2 && (num!=0 || num!=1);c++) {
		if(num%c==0) {
			isPrime = true;
			break;
		}
	}
		return isPrime;
	}
}

