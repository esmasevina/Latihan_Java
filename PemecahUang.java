import java.util.Scanner;
public class PemecahUang {
     //kembalian 
    public static void main(String[] args) {
       
          int[] nominal={100000,50000,20000,10000,5000,2000,1000,500,200,100};
         
          Scanner scan = new Scanner(System.in);
          System.out.print("Masukan Jumlah Uang     : ");
          int uang = scan.nextInt();
          System.out.print("Masukan Total Belanja :  ");
          int tot = scan.nextInt();
          int kem = uang-tot;
          System.out.println("Total Kembalian : " + kem);
          System.out.println("Uang Kembalian yang harus diberkina pada pelanggan : ");
         
          for(int i=0;i<10;i++){
             
              int jml = kem/nominal[i];
              kem-= jml*nominal[i];
              if(jml==0){
              }else{
               System.out.println("*" + ") " + "Rp."+ nominal[i] + "= " + jml );  
              }
              }
           
       
    }
       
    }