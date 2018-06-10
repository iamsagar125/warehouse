
package tempproj;
import java.util.Scanner;


/**
 *
 * @author VENKATESH SAGAR SAGAR
 */
class FinishedProduct{
    
    int productID;
    String[] size={"LARGE","MEDIUM","SMALL"};
    int quantity[]=new int[3];
    int emplCount;
    Scanner inp=new Scanner(System.in);
    
    
    void addProduct(int pid,int s){
        productID=pid;
        //size[s]=s;
        System.out.println("Enter the no.of products : ");
        int data=0;
        do{
            data=inp.nextInt();
            if(data<=0)
                System.out.println("Quantity need to be more than 0");
        }
        while(data<=0);        
        quantity[s]+=data;        
            
    }
    
    void removeProduct(int pid,int s){
        int data=0;
        int flag=0;
        do{
            System.out.println("Enter the no.of products to be removed: ");
            data=inp.nextInt();
            if(data<=0)
                System.out.println("Quantity need to be more than 0");
            else if(data>quantity[s]){
                System.out.println("Insufficient no. of products in the warehouse");
                displayInfo();
                System.out.println("Willing to unload less no. of products");
                System.out.println("Press\n 1:YES \n 0:NO");
                boolean choice=true;
                int value=inp.nextInt();
                if(quantity[s]==0 && value==1){
                    System.out.println("There are no products in the storage location");
                    break;
                }
                if(value==0){
                    choice=false;
                    flag=1;
                }
                if(!choice)
                    break;
            }
        }
        while(data<0 || data>quantity[s]);        
        if(quantity[s]!=0 && flag==0)
            quantity[s]-=data;
    }
    
    void allotEmployee(){
        int eval;
        int extra;
        int i;
        for(i=0;i<=2;i++){
            eval=quantity[i]/100;
            extra=quantity[i]%100;
            switch(i){
                case 0:eval=eval*4;
                       if(extra!=0 && extra<50)
                            extra=2;
                       else if(extra>=50)
                            extra=4;
                       break;
                case 1:eval=eval*3;
                       if(extra!=0 && extra<50)
                            extra=2;
                       else if(extra>=50)
                            extra=3;
                       break;       
                case 2:eval=eval*2;
                       if(extra!=0 && extra<50)
                            extra=1;
                       else if(extra>=50)
                            extra=2;
                       break;
            }
        System.out.println("Eval="+eval);
        System.out.println("Extra="+extra);
        emplCount+=eval+extra;
        
    }
    }
        
    
    void displayInfo(){
        System.out.println("Product ID is: "+productID);
        System.out.println("Product Details are:");
        System.out.println("SIZE\t QUANTITY\t");
        System.out.println("------------------------");
        for(int i=0;i<=2;i++){
            System.out.println(size[i]+"\t"+quantity[i]);
        }
        allotEmployee();
        System.out.println("Employees count is: "+emplCount );
        
    }   
}
class BasicMaterials{
    
    int materialID;
    String[] size={"LOW","MEDIUM","HIGH"};
    int quantity[]=new int[3];
    int emplCount;
    Scanner inp=new Scanner(System.in);
    
    
    void addProduct(int mid,int s){
        materialID=mid;
        //size[s]=s;
        System.out.println("Enter the no.of MATERIALS : ");
        int data=0;
        do{
            data=inp.nextInt();
            if(data<=0)
                System.out.println("Quantity need to be more than 0");
        }
        while(data<=0);        
        quantity[s]+=data;        
            
    }
    
    void removeProduct(int mid,int s){
        int data=0;
        int flag=0;
        do{
            System.out.println("Enter the no.of materials to be removed: ");
            data=inp.nextInt();
            if(data<=0)
                System.out.println("Quantity need to be more than 0");
            else if(data>quantity[s]){
                System.out.println("Insufficient no. of materials in the warehouse");
                displayInfo();
                System.out.println("Willing to unload less no. of materials");
                System.out.println("Press\n 1:YES \n 0:NO");
                boolean choice=true;
                int value=inp.nextInt();
                if(quantity[s]==0 && value==1){
                    System.out.println("There are no materials in the storage location");
                    break;
                }
                if(value==0){
                    choice=false;
                    flag=1;
                }
                if(!choice)
                    break;
            }
        }
        while(data<0 || data>quantity[s]);        
        if(quantity[s]!=0 && flag==0)
            quantity[s]-=data;
    }
    
    void allotEmployee(){
        int eval;
        int extra;
        int i;
        for(i=0;i<=2;i++){
            eval=quantity[i]/100;
            extra=quantity[i]%100;
            switch(i){
                case 0:eval=eval*4;
                       if(extra!=0 && extra<50)
                            extra=2;
                       else if(extra>=50)
                            extra=4;
                       break;
                case 1:eval=eval*3;
                       if(extra!=0 && extra<50)
                            extra=2;
                       else if(extra>=50)
                            extra=3;
                       break;       
                case 2:eval=eval*2;
                       if(extra!=0 && extra<50)
                            extra=1;
                       else if(extra>=50)
                            extra=2;
                       break;
            }
        System.out.println("Eval="+eval);
        System.out.println("Extra="+extra);
        emplCount+=eval+extra;
        
    }
    }
        
    
    void displayInfo(){
        System.out.println("Material ID is: "+materialID);
        System.out.println("Material Details are:");
        System.out.println("CLASS\t QUANTITY\t");
        System.out.println("------------------------");
        for(int i=0;i<=2;i++){
            System.out.println(size[i]+"\t"+quantity[i]);
        }
        allotEmployee();
        System.out.println("Employees count is: "+emplCount );
        
    }   
} 
class FabricatedParts{
    
    int partID;
    String[] size={"LARGE","MEDIUM","SMALL"};
    int quantity[]=new int[3];
    int emplCount;
    Scanner inp=new Scanner(System.in);
    
    
    void addProduct(int pid,int s){
        partID=pid;
        //size[s]=s;
        System.out.println("Enter the no.of parts : ");
        int data=0;
        do{
            data=inp.nextInt();
            if(data<=0)
                System.out.println("Quantity need to be more than 0");
        }
        while(data<=0);        
        quantity[s]+=data;        
            
    }
    
    void removeProduct(int pid,int s){
        int data=0;
        int flag=0;
        do{
            System.out.println("Enter the no.of parts to be removed: ");
            data=inp.nextInt();
            if(data<=0)
                System.out.println("Quantity need to be more than 0");
            else if(data>quantity[s]){
                System.out.println("Insufficient no. of partss in the warehouse");
                displayInfo();
                System.out.println("Willing to unload less no. of parts");
                System.out.println("Press\n 1:YES \n 0:NO");
                boolean choice=true;
                int value=inp.nextInt();
                if(quantity[s]==0 && value==1){
                    System.out.println("There are no parts in the storage location");
                    break;
                }
                if(value==0){
                    choice=false;
                    flag=1;
                }
                if(!choice)
                    break;
            }
        }
        while(data<0 || data>quantity[s]);        
        if(quantity[s]!=0 && flag==0)
            quantity[s]-=data;
    }
    
    void allotEmployee(){
        int eval;
        int extra;
        int i;
        for(i=0;i<=2;i++){
            eval=quantity[i]/100;
            extra=quantity[i]%100;
            switch(i){
                case 0:eval=eval*4;
                       if(extra!=0 && extra<50)
                            extra=2;
                       else if(extra>=50)
                            extra=4;
                       break;
                case 1:eval=eval*3;
                       if(extra!=0 && extra<50)
                            extra=2;
                       else if(extra>=50)
                            extra=3;
                       break;       
                case 2:eval=eval*2;
                       if(extra!=0 && extra<50)
                            extra=1;
                       else if(extra>=50)
                            extra=2;
                       break;
            }
        System.out.println("Eval="+eval);
        System.out.println("Extra="+extra);
        emplCount+=eval+extra;
        
    }
    }
        
    
    void displayInfo(){
        System.out.println("Part ID is: "+partID);
        System.out.println("Partt Details are:");
        System.out.println("SIZE\t QUANTITY\t");
        System.out.println("------------------------");
        for(int i=0;i<=2;i++){
            System.out.println(size[i]+"\t"+quantity[i]);
        }
        allotEmployee();
        System.out.println("Employees count is: "+emplCount );
        
    }   
}
        
public class Tempproj {

    public static void main(String[] args) {
        int choice;
        Scanner inp=new Scanner(System.in);
        
        for(;;){
        System.out.println("THE WAREHOUSE CONTAINS\n1.Basic Materials\n"
                + "2.Fabricated parts\n3.Finished Products\n4.Exit Enter your choice:");
        choice=inp.nextInt();
        
        
        switch(choice){
            case 1: 
                   
                
                BasicMaterials bm[]=new BasicMaterials[10];
                for(int i=0;i<bm.length;i++){
                          bm[i]=new BasicMaterials();  
                        } 
                
                for(;;){
                System.out.println("\nYou are dealing with Storage area of Basic Materials!!!");
                System.out.println("Permitted material IDs are 100-109");
                System.out.println("Available choices to deal with particular material are \n"
                        + " 1.Add/update any material\n"
                        + " 2.Remove the material\n"
                        + " 3.Employee Count \n"
                        + " 4.Display material details\n"
                        + " 5.Go back to main menu\n"
                        + "Choose your option :");
                choice=inp.nextInt();
                int matID,pos;
                int size;
               
                switch(choice){
                    case 1:
                        matID=acceptPID();
                        System.out.println("Size Menu Includes: \n 1.Low\n 2.Medium\n 3.High\n"
                                + "Choose the size of the product to be added(0,1,2 only permitted) :");
                        size=inp.nextInt();
                        pos=matID%100;
                        
                        for(int i=0;i<bm.length;i++){
                            if(i==pos){
                                bm[i].addProduct(matID, size);
                                bm[i].allotEmployee();
                                break;
                            }
                        }
                        break;
                    case 2:
                        matID=acceptPID();
                        System.out.println("Size Menu Includes: \n 1.Large\n 2.Medium\n 3.Small\n"
                                + "Choose the size of the product to be removed(0-2) :");
                        size=inp.nextInt();
                        pos=matID%100;
                        
                        for(int i=0;i<bm.length;i++){
                            if(i==pos){
                                bm[i].removeProduct(matID, size);
                                bm[i].allotEmployee();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int ecount=0;                     
                        for(int i=0;i<bm.length;i++){
                            ecount+=bm[i].emplCount;
                            }
                        System.out.println("Total number of employees in the warehouse=" +ecount);
                        break;
                    case 4:
                        matID=acceptPID();
                        pos=matID%100;
                        bm[pos].displayInfo();
                        break;  
                        
                }
                if(choice==5)
                    break;
                    
            }
            break;
                
                
                
            case 2:
                    FabricatedParts f[]=new FabricatedParts[10];
                for(int i=0;i<f.length;i++){
                          f[i]=new FabricatedParts();  
                        } 
                
                for(;;){
                System.out.println("\nYou are dealing with Storage area of Fabricated Parts!!!");
                System.out.println("Permitted Fabricate Part IDs are 100-109");
                System.out.println("Available choices to deal with particular part are \n"
                        + " 1.Add/update any part\n"
                        + " 2.Remove the part\n"
                        + " 3.Employee Count \n"
                        + " 4.Display part details\n"
                        + " 5.Go back to main menu\n"
                        + "Choose your option :");
                choice=inp.nextInt();
                int partID,pos;
                int size;
               
                switch(choice){
                    case 1:
                        partID=acceptPID();
                        System.out.println("Size Menu Includes: \n 1.Large\n 2.Medium\n 3.Small\n"
                                + "Choose the size of the product to be added(0,1,2 only permitted) :");
                        size=inp.nextInt();
                        pos=partID%100;
                        
                        for(int i=0;i<f.length;i++){
                            if(i==pos){
                                f[i].addProduct(partID, size);
                                f[i].allotEmployee();
                                break;
                            }
                        }
                        break;
                    case 2:
                        partID=acceptPID();
                        System.out.println("Size Menu Includes: \n 1.Large\n 2.Medium\n 3.Small\n"
                                + "Choose the size of the product to be removed(0-2) :");
                        size=inp.nextInt();
                        pos=partID%100;
                        
                        for(int i=0;i<f.length;i++){
                            if(i==pos){
                                f[i].removeProduct(partID, size);
                                f[i].allotEmployee();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int ecount=0;                     
                        for(int i=0;i<f.length;i++){
                            ecount+=f[i].emplCount;
                            }
                        System.out.println("Total number of employees in the warehouse=" +ecount);
                        break;
                    case 4:
                        partID=acceptPID();
                        pos=partID%100;
                        f[pos].displayInfo();
                        break;  
                        
                }
                if(choice==5)
                    break;
                    
            }
                
                break;
                
            case 3:
                int i;
                FinishedProduct fp[]=new FinishedProduct[10];
                for(i=0;i<fp.length;i++){
                          fp[i]=new FinishedProduct();  
                        } 
                
                for(;;){
                System.out.println("\nYou are dealing with Storage area of Finished Products!!!");
                System.out.println("Permitted product IDs are 100-109");
                System.out.println("Available choices to deal with particular product are \n"
                        + " 1.Add/update any product\n"
                        + " 2.Remove the product\n"
                        + " 3.Employee Count \n"
                        + " 4.Display product details\n"
                        + " 5.Go back to main menu\n"
                        + "Choose your option :");
                choice=inp.nextInt();
                int proID,pos;
                int size;
               
                switch(choice){
                    case 1:
                        proID=acceptPID();
                        System.out.println("Size Menu Includes: \n 0.Large\n 1.Medium\n 2.Small\n"
                                + "Choose the size of the product to be added(0,1,2 only permitted) :");
                        size=inp.nextInt();
                        pos=proID%100;
                        
                        for(i=0;i<fp.length;i++){
                            if(i==pos){
                                fp[i].addProduct(proID, size);
                                fp[i].allotEmployee();
                                break;
                            }
                        }
                        break;
                    case 2:
                        proID=acceptPID();
                        System.out.println("Size Menu Includes: \n 0.Large\n 1.Medium\n 2.Small\n"
                                + "Choose the size of the product to be removed(0-2) :");
                        size=inp.nextInt();
                        pos=proID%100;
                        
                        for(i=0;i<fp.length;i++){
                            if(i==pos){
                                fp[i].removeProduct(proID, size);
                                fp[i].allotEmployee();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int ecount=0;                     
                        for(i=0;i<fp.length;i++){
                            ecount+=fp[i].emplCount;
                            }
                        System.out.println("Total number of employees in the warehouse=" +ecount);
                        break;
                    case 4:
                        proID=acceptPID();
                        pos=proID%100;
                        fp[pos].displayInfo();
                        break;  
                        
                }
                if(choice==5)
                    break;
                    
            }
            break;
            
            
            
            case 4:System.exit(0);
            
        }
        
    }
    
}
    static int acceptPID(){
        int proID;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the product ID :");
        do{
                proID=inp.nextInt();
                if(proID>109 || proID<100){
                    System.out.println("Enter a valid product ID (100-109)");
                }
        }while(proID>109 || proID<100);
        return proID;
    }
}
    
   
