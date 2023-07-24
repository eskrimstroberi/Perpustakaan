package ukl.perpus;

import java.util.ArrayList;
public class siswa implements user{   
 
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telpon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    private ArrayList<Integer> idbuku = new ArrayList<Integer>();
    
    public siswa (){
        this.namaSiswa.add("Naya");
        this.alamat.add("Malang");
        this.telpon.add("08234569");
        this.status.add(false);
        this.idbuku.add(0);
        
        this.namaSiswa.add("Kirana");
        this.alamat.add("jakarta");
        this.telpon.add("08237823");
        this.status.add(false);
        this.idbuku.add(0);
        
        this.namaSiswa.add("nana");
        this.alamat.add("Bandung");
        this.telpon.add("08288832");
        this.status.add(false);
        this.idbuku.add(0);
    }
    
    public int getbanyaksiswa(){
        return this.namaSiswa.size();
    }
    
    public void editStatus(int id,boolean status){
        this.status.set(id, status);
    }
    
    public void setStatus(boolean status){
        this.status.add(status);
    }
    public void setidbuku(int id, int idbuku){
        this.idbuku.set(id, idbuku);
    }
    public int getidbuku(int id){
       return this.idbuku.get(id);
    }
    public boolean getStatus(int id){
        return this.status.get(id);
    }
    

    @Override
    public void setNama(String nama) {
     this.namaSiswa.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
     this.alamat.add(alamat);
    }

    @Override
    public void setTelpon(String telp) {
     this.telpon.add(telp);
    }

    @Override
    public String getNama(int id) {
     return this.namaSiswa.get(id);
    }

    @Override
    public String getalamat(int id) {
     return this.alamat.get(id);
    }

    @Override
    public String getTelpon(int id) {
     return this.telpon.get(id);
    }
      
  }