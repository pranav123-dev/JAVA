import java.util.Scanner;
  
public class Complex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real and imaginary part of first complex number:");
        double real1=sc.nextDouble();
        double imag1=sc.nextDouble();

       
        System.out.println("Enter real and imaginary part of first complex number:");
        double real2=sc.nextDouble();
        double imag2=sc.nextDouble();

        double sumReal=real1+real2;
        double sumImag=imag1+imag2;

        System.out.println("sum:"+sumReal+"+"+sumImag+"i");
        
        sc.close();

    }
}
