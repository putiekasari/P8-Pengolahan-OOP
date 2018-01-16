public class CetakSiswa1{


    public static void main(String args[]){
        Siswa data = new Siswa(); //deklarasi objek, agar Class CetakSiswa1 ini bisa memanggil perintah yang ada di Kelas Siswa
        data.infoSiswa(); // memanggil method infosiswa pada class Siswa
        // data = objek

        data.no_absen = 1;   //pemberian nilai pada objek no siswa dengan nilai 1
        System.out.println(data.no_absen);

        data.setNis("161530030");  //memberikan nilai setNis yang memiliki parameter string
        System.out.println(data.nis);

        data.setNama("Fatamalia Dewi"); 
        System.out.println(data.nama_siswa);

        data.setTtl("Pekalongan","09-02-1998");
        System.out.println(data.tmp_lahir +", "+data.tgl_lahir);

        data.setNilai(75.5, 80.5);
        System.out.println(data.nilai_ipa +", "+data.nilai_ips);
    }
}

// Cara memanggil atau memakai class diluar Class :
// 1. deklarasikan objek
// 2. tuliskan objek
// 3. nama method