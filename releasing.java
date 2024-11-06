
package ivon11;

import java.util.Scanner;




public class releasing {
      Scanner sc = new Scanner(System.in);

    public void rtransaction() {
        String response;
        do {
            System.out.println("\n---------------------------");
            System.out.println("RELEASING PANEL:");
            System.out.println("1. Add released:");
            System.out.println("2. View released:");
            System.out.println("3. Update released:");
            System.out.println("4. Delete released:");
            System.out.println("5. Exit:");

            System.out.print("Enter Selection: ");
            int act = sc.nextInt();
          
            switch (act) {
                case 1: addreleasing();
                  
                    
                    
                    break; 
                case 2:
                   
                    break;
                case 3: 
                   
                    break;
                case 4:
                     
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }

            System.out.println("Do you want to continue? (yes/no):");
            response = sc.next();
            
        } while (response.equalsIgnoreCase("yes"));     
    }

    
    public  void addreleasing(){
        Scanner sc= new Scanner(System.in);
        config conf= new config();
        
        beneficiary bs =new beneficiary();
        bs.viewbeneficiary();
        
        System.out.print("Enter the ID of the Beneficiary:");
        int bid = sc.nextInt();
        
        String bsql = "SELECT b_id FROM tbl_beneficiary WHERE b_id =?"; 
        while(conf.getSingleValue(bsql, bid)== 0){
          
            System.out.print("Beneficiary does not exist,Please Select Again:");
            bid = sc.nextInt();
        }
             program pm =new program();
             pm.viewprogram();
        
            
             System.out.print("Enter the ID of the Program:");
        int pid = sc.nextInt();
        
            
        String pslq = "SELECT p_id FROM tbl_program WHERE p_id =?"; 
        while(conf.getSingleValue(pslq, pid)== 0){
          
            System.out.print("Program does not exist,Please Select Again:");
            pid = sc.nextInt();}
        }
   
    
    
    }
    
    
    
    

   
       
    




