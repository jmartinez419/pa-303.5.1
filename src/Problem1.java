//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Problem1 {
    public static void main(String[] args) {

        int num = 12;

        for(int i = 1; i <= num -1; i++){
            for(int j = 1; j <= num -1; j++){
                System.out.print( i * j + "\t");
            }
            System.out.println();
        }
    }
}