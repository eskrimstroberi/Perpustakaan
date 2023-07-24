package ukl.perpus;
import java.util.ArrayList;
public class buku {
 
    private ArrayList <String> namaBuku = new ArrayList <String>();
    private ArrayList <Integer> stok = new ArrayList <Integer>();
    private ArrayList <Integer> harga = new ArrayList <Integer>();
    
    public buku (){
        this.namaBuku.add("Buku MTK");
        this.stok.add(12);
        this.harga.add(5000);
        
        this.namaBuku.add("Buku fisika");
        this.stok.add(18);
        this.harga.add(7000);
        
        this.namaBuku.add("Buku kimia");
        this.stok.add(20);
        this.harga.add(6000);
        
    }
    
    public int banyakBuku(){
        return this.namaBuku.size();
    }
    
    public void editStok(int id,int stok){
        this.stok.set(id, stok);
    }
    
    public void setNamaBuku(String nama){
        this.namaBuku.add(nama);
    }
    
    public void setStok(int stok){
        this.stok.add(stok);
    }
    
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
     public String getNamaBuku(int id) {
        return this.namaBuku.get(id);
    }

    public int getStok(int id) {
        return this.stok.get(id);
    }

    public int getHarga(int id) {
        return this.harga.get(id);
    }  

    void setStok(int ID, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

