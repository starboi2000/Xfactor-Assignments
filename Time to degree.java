
import java.util.*;  
class Main
{
    
    public static int findAngle(int hour, int min)
    {
        
        int h = (hour * 360) / 12 + (min * 360) / (12 * 60);
 
        
        int m = (min * 360) / (60);
 
        
        int angle = Math.abs(h - m);
 
        
        if (angle > 180) {
            angle = 360 - angle;
        }
 
        return angle;
    }
 
    
    public static void main(String[] args)
    {
        
        Scanner sc= new Scanner(System.in);      
        System.out.print("Enter Hour- ");  
        int hour= sc.nextInt();  
        System.out.print("Enter  minute- ");  
        int min= sc.nextInt();  
        System.out.print(findAngle(hour, min));
    }
}