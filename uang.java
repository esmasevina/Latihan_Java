import java.util.Scanner;
public class uang {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.println("masukkan angka :");
        int uang = masukkan.nextInt();
        if (uang > 999999) {
            System.out.println("angka yang anda masukkan melebihi ratusan ribu");
        } else {
            int ratusanribu = uang / 100000;
            if (ratusanribu == 0) {
                System.out.println(0 + " ratusan ribu");
            } else {
                System.out.println(ratusanribu + " ratusan ribu");
            }
            int puluhanribu = (uang - ratusanribu * 100000) / 10000;
            if (puluhanribu == 0) {
                System.out.println(0 + " puluhan ribu");
            } else {
                System.out.println(puluhanribu + " puluhan ribu");
            }
            int ribuan = (uang - ratusanribu * 100000 - puluhanribu * 10000) / 1000;
            if (ribuan == 0) {
                System.out.println(0 + " ribuan");
            } else {
                System.out.println(ribuan + " ribuan");
            }
            int ratusan = (uang - ratusanribu * 100000 - puluhanribu * 10000 - ribuan * 1000) / 100;
            if (ratusan == 0) {
                System.out.println(0 + " ratusan");
            } else {
                System.out.println(ratusan + " ratusan");
            }
            int puluhan = (uang - ratusanribu * 100000 - puluhanribu * 10000 - ribuan * 1000 - ratusan * 100) / 10;
            if (puluhan == 0) {
                System.out.println(0 + " puluhan");
            } else {
                System.out.println(puluhan + " puluhan");
            }
            int satuan = (uang - ratusanribu * 100000 - puluhanribu * 10000 - ribuan * 1000 - ratusan * 100 - puluhan * 10);
            if (satuan == 0) {
                System.out.println(0 + " satuan");
            } else {
                System.out.println(satuan + " satuan");
            }
        }
    }
}