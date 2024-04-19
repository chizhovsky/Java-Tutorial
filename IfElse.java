import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        if (age < 10){
            System.out.println("You are a child");
        }
        if (age >= 10 && age < 19){
            System.out.println("You are a teen");
        }
        if (age >= 19){
            System.out.println("You are an adult");
        }
        int while_count = 2;
        int do_while_count = 2;
        while(while_count > 0){
            System.out.println("While: " + while_count);
            while_count = while_count - 1;
        }
        do{
             System.out.println("Do while: " + do_while_count);
             do_while_count = do_while_count - 1;
        }
        while (do_while_count > 0);
        for (int count = 2; count > 0; count = count - 1) {
            for (int a = 2; a > 0; a = a - 1) {
                System.out.println("For loop: " + count);
            }
        }
    }
}
