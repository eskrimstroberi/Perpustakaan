package ukl.perpus;
import java.util.Scanner;
public class UklPerpus {

public static Scanner masukkan=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        laporan laporan = new laporan();
        peminjaman peminjaman = new peminjaman();
        siswa siswa=new siswa ();
        petugas petugas= new petugas ();
        buku buku= new buku ();
        
        laporan.laporan(buku);
        System.out.println("");
        laporan.laporan(siswa);
        System.out.println("");
        laporan.laporan(petugas);
        System.out.println("");
        
        
        while (true){
        System.out.println(">>>>> SELAMAT DATANG DI PERPUS <<<<<");
        System.out.println("[1] PEMINJAMAN");
        System.out.println("[2] PENGEMBALIAN");
        System.out.println("[3] KELUAR");
        System.out.print("Masukkan pilihan=");
        int no=masukkan.nextInt();
        
        if (no==1){ //peminjaman
            System.out.println("");
         peminjaman.prosesPeminjaman(siswa, buku, peminjaman);
        
        }
        else if(no==2){ //pengembalian
        System.out.println("");
        peminjaman.prosesPengembalian(siswa, buku, peminjaman);
        }
        else if(no==3){ //keluar//
            System.out.println("");
            System.out.println(">> TERIMAKASIH <<");
            System.exit(0);
        }
        else{
            System.out.println("");
            System.out.println("SALAH INPUT!!!");
            System.exit(0);
        }
        }  
        
    }
    
}
  
   



    
    

