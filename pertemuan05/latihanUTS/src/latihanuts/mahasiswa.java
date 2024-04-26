package latihanuts;

/**
 * @author Ni Kadek Dwi Pratiwi
 * Nim = 2201010051
 * Kelas = U
 * Tgl = 26 April 2024
 */
public class mahasiswa {
    private String nim,nama;

    void SetNIM(String vnim){
        nim = vnim;
    }
    void SetNAMA(String vnama){
        nama = vnama;
    }
    String GetNim(){
       return nim;
    }
    String GetNama(){
       return nama;
    }
}
