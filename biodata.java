import java.util.Scanner;
public class Main{
    public static void main (String [] args) {
        Scanner scan=new Scanner(System.in);
     
        String namaDepan, namaBelakang, alamat, tempatLahir, tanggalLahir;
     
        System.out.println();
        System.out.println("\t--------------------------------------------");
        System.out.println("\t\tProgram Biodata Dengan Java");
        System.out.println("\t--------------------------------------------");
        System.out.println();
        System.out.println("\tIsi biodata diri dengan lengkap!");
        System.out.println("\t--------------------------------------------");
       
        System.out.print("\tNama Depan\t: ");
        namaDepan=scan.nextLine();
       
        System.out.print("\tNama Belakang\t: ");
        namaBelakang=scan.nextLine();
       
        System.out.print("\tAlamat Lengkap\t: ");
        alamat=scan.nextLine();
       
        System.out.print("\tTempat Lahir\t: ");
        tempatLahir=scan.nextLine();
        // Created by : http://www.anakblogger.com
        System.out.print("\tTanggal Lahir\t: ");
        tanggalLahir=scan.nextLine();
       
        System.out.println();
        System.out.println("\t========================================================================");
        System.out.println("\t\t\t\tBiodataku");
        System.out.println("\t========================================================================");
        System.out.println("\tNama Lengkap\t\t: "+namaDepan+" "+namaBelakang);
        System.out.println("\tAlamat\t\t\t: "+alamat);
        System.out.println("\tTempat/Tanggal Lahir\t: "+tempatLahir+", "+tanggalLahir);
        System.out.println("\t========================================================================");
    }
}
