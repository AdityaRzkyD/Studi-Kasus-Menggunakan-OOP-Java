import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String Enter;
        int pengguna, P, delete;
        Admin admin = new Admin();
        User user = new User();

        System.out.println("List Pengguna");
        System.out.println("1. Admin");
        System.out.println("2. User");
        System.out.print("Masukkan Nomor Pengguna       : ");
        pengguna = Input.nextInt();
            if (pengguna == 1){
                admin.customer();
                System.out.println("Selamat Datang "+admin.getPengguna());
                admin.Pengelolaan();
                P = Input.nextInt();
                    if (P == 1){
                        System.out.println("Penambahan Buku");
                        System.out.println("");
                        Enter = Input.nextLine();
                        System.out.print("Masukkan Genre Buku     : ");
                        String Genre = Input.nextLine();
                        System.out.print("Masukkan Judul Buku     : ");
                        String Judul = Input.nextLine();
                        SimpanBuku simpan = new SimpanBuku(Judul, Genre) {   
                        };
                        System.out.println("Judul Buku : "+simpan.getJudulBuku());
                        System.out.println("Genre Buku : "+simpan.getGenre());
                        System.out.print("Delete Buku dan logout?(1(ya)/2(no)) : ");
                        delete = Input.nextInt();
                        if(delete == 1){
                            System.out.println("Buku Didelete");
                        }
                        else{
                            System.out.println("Tekan Enter Untuk logout");
                            Enter = Input.nextLine();
                        }
                    }
                    else{
                        System.out.println("Tekan Enter Untuk Logout");
                        Enter = Input.nextLine();
                    }
            }
            else if(pengguna == 2){
                user.customer();
                System.out.println("Selamat Datang "+user.getPengguna());
                user.Pengelolaan();
                P = Input.nextInt();
                if(P == 1){
                    SimpanBuku simpan = new SimpanBuku("Malam Jumat Kliwon", "Horror") {
                    };
                    System.out.println("Buku Yang Tersedia");
                    System.out.println("Judul Buku      : "+simpan.getJudulBuku());
                    System.out.println("Genre Buku      : "+simpan.getGenre());
                    System.out.print("Tekan Enter untuk Exit Program");
                    Enter = Input.nextLine();
                }
                else{
                    System.out.println("Tekan Enter untuk logout");
                    Enter = Input.nextLine();
                }
            }
            else{
                System.out.println("Username dan Password tidak terdaftar");
            }
    }
}
