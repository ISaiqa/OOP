import java.util.*;
public class Main {
    public static void main(String[] args) {
      
        Owner [] obj  =new Owner[5];

        Scanner sc=new Scanner(System.in);
        String name,CNIC,size,color,make,number;
        for(int i=0;i<=4;i++)
        {
            obj [i]=new Owner();
            System.out.println("\tEnter Information Owner "+(i+1));
            System.out.print("Enter owner name:");
            name=sc.nextLine();
            obj[i].setName(name);
            System.out.print("Enter CNIC:");
            CNIC=sc.nextLine();
            obj[i].setCNIC(CNIC);
            System.out.println("\tEnter owner "+(i+1)+" mobile info");
            System.out.print("Enter Screen Size:");
            size=sc.nextLine();
            System.out.print("Enter mobile color:");
            color= sc.nextLine();
            obj[i].m1.objMobile(size,color);
            System.out.println("\tEnter owner "+(i+1)+" car info");
            System.out.print("Enter car number:");
            number=sc.nextLine();
            System.out.print("Enter car make:");
            make= sc.nextLine();
            obj[i].car1.objCar(number,make);
            System.out.println("\tInformation of Owner "+(i+1));
      obj[i].showInfo();

        }
        sc.close();
        System.out.println("Displaying Information of All owners:");
        for (int i=0;i<4;i++)
        {
            System.out.println("\tInformation of owner"+(i+1)) ;

            obj[i].showInfo();
        }
      
    
}

}
