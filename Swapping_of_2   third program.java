import java.util.Scanner;

class Swapping
{
    public static void main(String[] args) {
        int a , b , temp = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println("value of A:"+a);
        System.out.println("value of B:"+b);
        System.out.println("After Swapping");
        temp = a;
        a = b;
        b = temp;
        System.out.println("value of A:"+a);
        System.out.println("value of B:"+b);

        }
}