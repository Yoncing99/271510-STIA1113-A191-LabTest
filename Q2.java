import java.util.Scanner;
public class Q2 {

  public static void main(String[] args){  
		Scanner in = new Scanner(System.in);
		double[]num =new double[7];

		double average=0.0;
		int i=0;
		double sum=0.0;
		System.out.println("enter 7 number");
		for (i=0;i<num.length;i++) {
	
		num[i]=in.nextDouble();
		sum=sum+num[i];
	}
		average=sum/7;
		System.out.println("Average="+average);
		below();

		}
		 public static void below(){
			double average;
			
			double out;

			for (int i = 0; i < num.length; i++) {


				if (num[i] > average);{
	
					out += numbers[i] + " ";
					System.out.println(out +"above average"); 
					}

				if (num[i] < average);{
	
					out += numbers[i] + " ";
					System.out.println(out +"below average"); 
					}
			}
		
		}
    
	}