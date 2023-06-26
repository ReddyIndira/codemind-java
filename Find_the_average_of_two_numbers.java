import java.util.*;
public class Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        double avg;
        avg=(a+b)/2.0;
        System.out.format("%.4f",avg);
    }
}