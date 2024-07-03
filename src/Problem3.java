public class Problem3 {
    public static void main(String [] args){

        double tuition = 10000;
        double percent = 1.07;
        int year = 0;


       while(tuition < 20000) {
           tuition = tuition * percent;
           year++;

       }
       System.out.println(year);
    }
}
