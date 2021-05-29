package oop.example;


public class App 
{
    public static void main( String[] args )
    {
        Paint userPaint = new Paint();
        userPaint.setLength();
        userPaint.setWidth();
        double userArea = userPaint.findArea();
        int userGallons = userPaint.getGallons();

        System.out.printf("You will need to purchase %d gallons of paint to cover %.2f square feet.%n",userGallons,userArea);
    }
}
