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
		System.out.printf("Average=%.3f\n",average);
		below(num,average);
		}
		 public static void below(double[] out,double ave){

			for (int i = 0; i < out.length; i++) {
				if (out[i] >= ave)
					System.out.println(out[i]+" above average"); 
				else if (out[i] <= ave)
					System.out.println(out[i] +" below average"); 	
			}
		}
	}
