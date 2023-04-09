public class Data {
    public String nama,jenis,materi;
    public float jumlah;


    public Data(String nama,float jumlah,String jenis,String materi){
        this.nama = nama.length() < 8 ? nama+"\t" : nama;
        this.jumlah = jumlah;
        this.jenis = jenis;
        this.materi = materi;

    }

   
}

