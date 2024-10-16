/**
 *
 * @author Rifqi Thokz
 */
import java.io.*;
 
public class Konversi_Angka_ke_Jam_Menit_Detik {
 
    public static void main(String[] args) {
        int jam=0, menit=0, detik=0, s_jam=0, s_menit = 0;
        String input = "";
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
         
        System.out.print("Input data angka : ");
 
            try{
                input = buffer.readLine();
            }
            catch(Exception e){}
             
        int x = Integer.valueOf(input);
 
        if(x<0){
            System.out.println("Masukkan banyak angka >= 0");
        }
        else{
            jam = x / 3600;
            s_jam = x - (jam*3600);
            menit = s_jam / 60;
            s_menit = s_jam - (menit*60);
            detik = s_menit;
             
            if(jam>0)System.out.println(jam + " Jam ");
            if(menit>0)System.out.println(menit + " Menit ");
            if(detik>0)System.out.println(detik + " Detik");
        }
             
    }
}