import java.util.*;
class Wastecollectionpoints
{
    static double calculateTotalWaste(double point1waste,double point2waste)
    {
        return  point1waste + point2waste;
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the waste collected at point 1");
       double point1waste=sc.nextDouble();
       System.out.println("Enter the waste collected at point 2");
       double point2waste=sc.nextDouble();
       double totalwaste = calculateTotalWaste(point1waste,point2waste);
       System.out.println("Total waste collected :" + totalwaste);


    }
}