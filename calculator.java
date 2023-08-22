import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
// import java.util.*;
// import java.math.*;

class Main {
    public static void main(String[] args){
        while( true){
            System.out.println("     ********     CALCULATOR    *********");     
            System.out.println("       ");       
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Divide");
            System.out.println("Enter 5 for Factorial");
            System.out.println("Enter 6 for Power");
            System.out.println("Enter 7 for Root");
            System.out.println("Enter 8 for Remainder");
            System.out.println("Enter 9 for Random No.Genreator");
            System.out.println("Enter 10 for exit");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            if (num1==10){
                break;
            }
            double num2,num3,res=0;
            switch(num1)
                {
                case 1:
                    
                    System.out.println("Enter the First Number (number should be in integer):");
                    num2 = sc.nextDouble();
                    System.out.println("Enter the Second Number (number should be in integer):");
                    num3 = sc.nextDouble();
                    res = num2+num3;
                    res = (long)res;

                    // String str1,str2;
                    // System.out.println("Enter the First Number :");
                    // str1=sc.next();
                    // System.out.println("Enter the Second Number :");
                    // str2=sc.next();
                    // BigInteger A = new BigInteger(str1);
                    // BigInteger B = new BigInteger(str2);

                    // BigInteger c =(A.add(B));
                    // res = c.doubleValue();
                break;

                case 2:
                    System.out.println("Enter the First Number (number should be in integer):");
                    num2 = sc.nextDouble();
                    System.out.println("Enter the Second Number (number should be in integer) :");
                    num3 = sc.nextDouble();
                    res=num2-num3;
                break;

                case 3:
                    System.out.println("Enter the First Number (number should be in integer):");
                    num2 = sc.nextDouble();
                    System.out.println("Enter the Second Number (number should be in integer):");
                    num3 = sc.nextDouble();
                    res=num2*num3;
                break;

                case 4:
                    System.out.println("Enter the First Number (number should be in integer):");
                    num2 = sc.nextDouble();
                    System.out.println("Enter the Second Number (Denominator is not equal to zero):");
                    num3 = sc.nextDouble();

                    // while (num3==0){
                    //     System.out.println("Denominator is not equal to zero please enter another number : ");
                    //     num3 = sc.nextDouble();
                    // }

                    try {
                        res=num2/num3;
                    }
                     catch (Exception e) {
                        System.out.println("  CANNOT DIVIDE BY ZERO   ");

                    }
                    
                break;
            
                case 5:
                    System.out.println("Enter the Number (number should be in natural number) :");
                    num2 =sc.nextDouble();
                    res =1;
                    for(double i=num2;i>0;i--){
                        res *= i;
                    }
                break;
            
                case 6:
                    System.out.println("Enter the Base (number should be in integer):");
                    num2 = sc.nextDouble();
                    System.out.println("Enter the exponent (number should be in integer):");
                    num3 =sc.nextDouble();
                    res = Math.pow(num2,num3);
                break;

                case 7:
                    System.out.println("Enter the Number (number should be in positive integer) :");
                    num2 = sc.nextDouble();
                    res =Math.sqrt(num2);
                break;

                case 8:
                    System.out.println("Enter the First Number (number should be in integer):");
                    num2 = sc.nextDouble();
                    System.out.println("Enter the Second Number (number should be in integer):");
                    num3 = sc.nextDouble();
                    res=num2%num3;
                break;

                case 9:
                    Random rand = new Random();
                    double max ,min;
                    System.out.println("Random number  is generate from range  a to b ");
                    System.out.println("Enter the integer number a: ");
                    min =sc.nextDouble();
                    System.out.println("Enter the integer number b: ");
                    max =sc.nextDouble();
                    res=rand.nextDouble(max-min+1)+min;
                break;
                    
                default:
                    System.out.println("Please enter the number from 1 to 10 .");
                continue;
            }
            System.out.println("       ");
            System.out.println("       ");
            System.out.println("Answer is "+ res);
            System.out.println("       ");
            System.out.println("-------------------------------------------------------");
            System.out.println("       ");
        }
    }   
}
