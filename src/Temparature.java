import java.util.Scanner;
public class Temparature {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temparatur: ");

        double temp = scanner.nextDouble();
        if (temp <=30 && temp >0){
            System.out.println("The room is cool");
        }

        else{
            System.out.println("The room is hot!");
        }


        scanner.close();
    }
}
