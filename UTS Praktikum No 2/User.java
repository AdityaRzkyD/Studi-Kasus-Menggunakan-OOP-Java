public class User extends Pengguna{
    void customer(){
        pengguna = "User";
    }

    public String getPengguna() {
        return super.getPengguna();
    }

    public void Pengelolaan(){
        System.out.println("Hak Pengelolaan");
        System.out.println("1. Melihat Buku");
        System.out.println("Lakukan Pengelolaan?(1(ya)/2(no)) : ");
    }
}
