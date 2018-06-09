package tempproj;
import java.util.Scanner;


/**
 *
 * @author 3designers
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
        while(data<0);        
        quantity[s]+=data;        
            
    }
    
    void removeProduct(int pid,int s){
        System.out.println("Enter the no.of products to be removed: ");
        int data=0;
        do{
            data=inp.nextInt();
            if(data<=0)
                System.out.println("Quantity need to be more than 0");
            else if(data>quantity[s]){
                System.out.println("Insufficient no. of products in the warehouse");
                displayInfo();
                System.out.println("Willing to unload less no. of products");
                System.out.println("Press\n 1:YES \n 0:NO");
                boolean choice=true;
                choice=inp.nextBoolean();
                if(!choice)
                    System.exit(0);
            }
        }
        while(data<0 || data>quantity[s]);        
        quantity[s]+=data;
    }
    
    void employee(){
        int eval;
        int extra;
        int i;
        for(i=0;i<=2;i++){
            eval=quantity[i]/100;
            extra=quantity[i]%100;
            switch(i){
                case 0:eval=eval*4;
                       break;
                case 1:eval=eval*3;
                       break;       
                case 2:eval=eval*2;
                       break;
            }
            
            if(extra!=0 && extra<50)
                extra=2;
            else
            extra=4;
        
        emplCount=eval+extra;
        
    }
    
    void displayInfo(){
        System.out.println("Product ID is: "+productID);
        System.out.println("");
        
        
    
    
        
        
        
public class Tempproj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
