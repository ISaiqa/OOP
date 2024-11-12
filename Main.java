import java.util.*;
public class Main {
    public static void main(String[] args) {
        Owner [] obj  =new Owner[4];

        Scanner sc=new Scanner(System.in);
        String name,CNIC,size,color,make,number;
        for(int i=0;i<=4;i++)
        {
            obj [i]=new Owner();
            System.out.println("Enter Information Owner "+(i+1));
            System.out.println(" Enter owner name:");
            name=sc.nextLine();
            obj[i].setName(name);
            System.out.println("Enter CNIC:");
            CNIC=sc.nextLine();
            obj[i].setCNIC(CNIC);
            System.out.println(" Enter owner "+(i+1)+" mobile info");
            System.out.println("Enter Screen Size:");
            size=sc.nextLine();
            System.out.println("Enter mobile color");
            color= sc.nextLine();
            obj[i].m1.objMobile(size,color);
            System.out.println(" Enter owner "+(i+1)+" car info");
            System.out.println("Enter car number:");
            number=sc.nextLine();
            System.out.println("Enter car make");
            make= sc.nextLine();
            obj[i].car1.objCar(number,make);
 obj[i].showInfo();

        }
        sc.close();
        for (int i=0;i<4;i++)
        {

            obj[i].showInfo();
        }
        
    }
}