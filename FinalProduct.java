package FinalProduct;


import java.util.Scanner;

/**
 *
 * @author SAGAR KALAL
 */
public class FinalProduct {
    
    int productID;
    String[] size={"LARGE","MEDIUM","SMALL"};
    int quantity[]=new int[3];
    int emplCount;
    Scanner inp=new Scanner(System.in);
    
    
    void addProduct(int pid,int s,int quan){
        productID=pid;
        int data=0;
        do{
            data=quan;
            if(data<=0)
                System.out.println("Quantity need to be more than 0");
        }
        while(data<=0);        
        quantity[s]+=data;        
            
    }
    
    void removeProduct(int pid,int s,int quan){
        productID=pid;
        int data=0;
        int flag=0;
        do{
            System.out.println("Enter the no.of products to be removed: ");
            data=quan;
            if(data<=0)
                System.out.println("Quantity need to be more than 0");
            else if(data>quantity[s]){
                System.out.println("Insufficient no. of products in the warehouse");
                
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
    
    void allotEmployee(int quan0,int quan1,int quan2){
        int eval;
        int extra;
        int i;
        quantity[0]=quan0;
        quantity[1]=quan1;
        quantity[2]=quan2;
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
        allotEmployee(quantity[0],quantity[1],quantity[2]);
        System.out.println("Employees count is: "+emplCount );
        
    }   
}
    

