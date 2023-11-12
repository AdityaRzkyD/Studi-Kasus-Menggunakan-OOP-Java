public class Admin extends Pengguna{
    void customer(){
        pengguna = "Admin";
    }

    public String getPengguna() {
        return super.getPengguna();
    }

    public void Pengelolaan(){
        System.out.println("Hak Pengelolaan");
        System.out.println("1. Menambahkan Buku");
        System.out.println("2. Melihat Buku");
        System.out.println("3. Menghapus Buku");
        System.out.print("Lakukan Pengelolaan?(1(ya)/2(no)) ");
    }
}
