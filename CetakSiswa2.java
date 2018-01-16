public class CetakSiswa2 {


    public static void main (String [] args){
        Siswa data = new Siswa();  //deklarasi objek class siswa dg nama objeknya adalah data
        data.infoSiswa();

        data.no_absen = 2; //pemberian nilai pada objek no siswa dengan nilai 2 pada Class Siswa
        System.out.println("No. Absen\t\t: "+data.no_absen);

        data.setNis("161530030"); // setNis = method // pemanggilan nama method objek klass siswa dg nilai parameternya diberi 161530030
        System.out.println("NIS\t\t\t: "+data.nis);

        data.setNama("Fatamalia Dewi");
        System.out.println("Nama Siswa\t\t: "+data.nama_siswa);

        data.setTtl("Pekalongan", "09-02-1998");
        System.out.println("Tempat, Tgl Lahir\t: "+data.tmp_lahir +", "+data.tgl_lahir);

        data.setNilai(75.5, 80.75); //
        System.out.println("Nilai IPA\t\t : "+data.nilai_ipa);
        System.out.println("Nilai IPS\t\t : "+data.nilai_ips);
    }
}