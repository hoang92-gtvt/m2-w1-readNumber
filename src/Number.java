import java.net.ConnectException;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên dương ");
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();

        int hangdonvi = number1%10;
        int hangchuc = ((number1-hangdonvi)/10)%10;
        int hangtram = (number1-hangdonvi-hangchuc)/100;
        System.out.println(number1);
        System.out.println(hangtram);
        System.out.println(hangchuc);
        System.out.println(hangdonvi);


        switch (hangtram){
            case 1:
                System.out.print("one hunder and");
                break;
            case 2:
                System.out.print("two hunder and");
                break;
            case 3:
                System.out.print("three hunder and");
                break;
            case 4:
                System.out.print("four hunder and");
                break;
            case 5:
                System.out.print("five hunder and");
                break;
            case 6:
                System.out.print("six hunder and");
                break;
            case 7:
                System.out.print("seven hunder and");
                break;
            case 8:
                System.out.print("eight hunder and");
                break;
            case 9:
                System.out.print("night hunder and");
                break;
            default:
                System.out.print("");
                break;
        }
        switch (hangchuc){
            case 2:
//                if(hangdonvi==0){
//                    System.out.print("twenty");
//                }
                System.out.print("  twenty-");
                break;
            case 3:
                System.out.print("  threety-");
                break;
            case 4:
                System.out.print("  fourty-");
                break;
            case 5:
                System.out.print("  fivety-");
                break;
            case 6:
                System.out.print(" sixty-");
                break;
            case 7:
                System.out.print(" seventy-");
                break;
            case 8:
                System.out.print(" eighty-");
                break;
            case 9:
                System.out.print("  nighty-");
                break;
            case 1:
                switch (hangdonvi){
                    case 1:
                        System.out.print("  eleven");
                        break;
                    case 2:
                        System.out.print("  twelve");
                        break;
                    case 3:
                        System.out.print("  threeteen");
                        break;
                    case 4:
                        System.out.print("  fourteen");
                        break;
                    case 5:
                        System.out.print("  fiveteen");
                        break;
                    case 6:
                        System.out.print("  sixteen");
                        break;
                    case 7:
                        System.out.print("  seventeen");
                        break;
                    case 8:
                        System.out.print("  eightteen");
                        break;
                    case 9:
                        System.out.print("   nightteen");
                        break;
                    default:
                        System.out.print("");
                        break;


                }
            default:
                System.out.print("");
                break;

        }
        switch(hangdonvi){
            case 0:
                if(hangchuc==1) {
                    System.out.print("  ten");
                }
                break;
            case 1:
                System.out.print(" one");
                break;
            case 2:
                System.out.print(" two");
                break;
            case 3:
                System.out.print("  three");
                break;
            case 4:
                System.out.print(" four");
                break;
            case 5:
                System.out.print(" five");
                break;
            case 6:
                System.out.print(" six");
                break;
            case 7:
                System.out.print(" seven");
                break;
            case 8:
                System.out.print(" eight");
                break;
            case 9:
                System.out.print(" night");
                break;
            default:
                System.out.print("");
                break;

        }




    }
}
