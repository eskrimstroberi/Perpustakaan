package ukl.perpus;
public interface user {
    
    public abstract void setNama(String nama);
    public abstract void setAlamat(String alamat); //set untuk mengubah nilai
    public abstract void setTelpon(String telp);
    
    public abstract String getNama(int id); //get untuk mengambil
    public abstract String getalamat(int id);
    public abstract String getTelpon(int id);
    
    
}
