import java.util.ArrayList;

public class App {

    private ArrayList<Data> DataWarga;
    static float ZakatUang = 0,ZakatBeras = 0,TotalUangsSedekah = 0,TotalWargaZakat = 0; 
    public static void main(String[] args) throws Exception {  
        App Screen = new App();
        Screen.inputData();
        Screen.CetakData();
    }

    private void inputData(){
        DataWarga = new ArrayList<Data>();
        String jawaban;
        do{
            System.out.println("________________________________");
            System.out.println("1. Zakat \n2. Sedekah");
            System.out.print("Zakat atau Sedekah = ");
            
            int pilihan = Integer.parseInt(System.console().readLine());

            if(pilihan == 1){
                
                System.out.print("Masukan Nama = ");
                String nama = System.console().readLine();
                System.out.println("1. Uang \n2. Beras");
                System.out.print("Zakat beras atau uang = ");
                
                int pilihanZakat = Integer.parseInt(System.console().readLine());
            
                if (pilihanZakat == 1){
                    TotalWargaZakat++;
                    ZakatUang += 35000f;
                    Data data = new Data(nama,35000f,"Zakat","Uang");
                    DataWarga.add(data);
                }
                else{
                    TotalWargaZakat++;
                    ZakatBeras += 2.5f;
                    Data data = new Data(nama,2.5f,"Zakat","Beras");
                    DataWarga.add(data);
                }
            }

            else{
                System.out.print("Masukan Nama = ");
                String nama = System.console().readLine();
                
                System.out.print("Berapa uang yang di sedekah kan = ");
                int jumlahUangSedekah = Integer.parseInt(System.console().readLine());
                TotalUangsSedekah += jumlahUangSedekah;
                Data data = new Data(nama,jumlahUangSedekah,"Sedekah","Uang");
                DataWarga.add(data);
            }
    
            System.out.print("Apakah anda ingin menambahkan data lagi? (Y/N)");
            jawaban = System.console().readLine();

        }while(jawaban.equals("Y")|| jawaban.equals("y"));
    }

    private void CetakData(){

        System.out.println("\n\n=====================================================================================================");
        System.out.println("\t\t\tDATA ZAKAT DAN SEDEKAH WARGA KAMPUNG DURIAN RUNTUH");
        System.out.println("=====================================================================================================");
        System.out.println();
        System.out.println("\t\t\t\tDATA WARGA YANG SEDEKAH DAN ZAKAT");
        System.out.println("=====================================================================================================");
        System.out.println("No.\tNama \t\t\tKategori \t\tJenis \t\tJumlah" );
        System.out.println("=====================================================================================================");

        for(int i = 0; i < DataWarga.size();i++){
            System.out.println(i+1 + ".\t" + DataWarga.get(i).nama + "\t\t" + DataWarga.get(i).jenis + "\t\t\t" +DataWarga.get(i).materi + "\t\t" + DataWarga.get(i).jumlah);
        }

        System.out.println("\nJumlah warga yang zakat dengan beras atau uang = " + (int)TotalWargaZakat + " Orang");
        System.out.println("Jumlah Zakat beras terkumpul = " + ZakatBeras + " Kg");
        System.out.println("Jumlah Zakat uang terkumpul = Rp " + (int)ZakatUang);
        System.out.println("Jumlah Uang sedekah yang terkumpul = Rp " + (int)TotalUangsSedekah);

    }

}
