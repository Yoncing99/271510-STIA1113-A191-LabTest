public class Q1{

    public static void main(String[] args) {

        int[] age = { 20, 21, 22, 18, 23, 24, 25, 51, 26, 70, 27, 28 };
        double[] weight = { 56.1, 70.5, 65.4, 49.3, 55.8 };

        int total=totalAge(age);
        System.out.println("Total Age:"+ total);
        double average = averageAge(age);
        System.out.println("Average Age:"+ average);
        int more = countAgeMore50(age);
        System.out.println("Age More Than 50: " + more);
        double min=0,max=0;
        max = maxWeight(weight);
        System.out.println("Maximum Weight:"+max);
        min = minWeight(weight);
        System.out.println("Minimum Weight:"+min);

    }

    public static int totalAge(int[]we) {
    int total = 0;
    for (int i = 0; i < we.length; i++) {
    total = total + we[i];
    }
    return total;
    }
    public static double averageAge(int[] age) {
    double average = 0;
    int total = 0;
    for (int i = 0; i < age.length; i++) {
    total = (int) (total + age[i]);

    average = total / age.length;
    }
    return average;
    }

    public static int countAgeMore50(int[] yon) {

        int more = 0;
        for (int i = 0; i < yon.length; i++) {
            if (yon[i] > 50) {
                more = yon[i];
            }
        }
        return more;
    }
    public static double maxWeight(double[]yon){
        int max=0;
        for (int i = 0; i < yon.length; i++){
            if(yon[i]>max){
                max=(int) yon[i];
            }
        }   
        return max;     
    }
    public static double minWeight(double[]yon){
    
        // int min=0;
        double min= yon[0];
        for (int i = 0; i < yon.length; i++){
            if(yon[i]<min){
                min=(int) yon[i];
               
            }     
            }
        return min;       
    }
}