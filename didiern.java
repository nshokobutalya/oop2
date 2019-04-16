
import java.util.Scanner;
public class Djomel {

    
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("enter name");
        String name=a.nextLine();
        String courses[]={"java","physics","mathematics","geography","english","history"};
        
        double marks[]=new double[6];
        for(int i=0;i<=5;i++){
        
        System.out.print("enter mark"+""+i);
        marks[i]=a.nextDouble();
        }        
        double sum=0;
       
        for(int x=0;x<=5;x++){   
        sum=sum+marks[x];
        }
        System.out.print("STUDENT Name"+name);
        System.out.println();
        for(int y=0;y<=5;y++){
        System.out.println(courses[y]+""+marks[y]);}
        double average;
        average=sum/6;
        System.out.print("your average is" +average);
        
                
    }
    
}
