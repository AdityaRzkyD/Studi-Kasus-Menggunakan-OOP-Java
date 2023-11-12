import java.util.Scanner;

public class HewanDemo {
    public static void main(String[] args) {
        String Ciri;

        Scanner Input = new Scanner(System.in);
        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();

        System.out.println("Jenis Hewan");
        System.out.println("1. Kucing");
        System.out.println("2. Anjing");
        System.out.print("Pilih Jenis Hewan(1-2) : ");
        int Jenis = Input.nextInt();

        if (Jenis == 1 ){
            System.out.println("Jenis Hewan     : Kucing");
            kucing.Suara();
            System.out.println("Jenis Suara     : "+kucing.Bersuara());
            Ciri = "Mempunyai Kelenjar Susu";
            if (Ciri == "Mempunyai Kelenjar Susu") {
                System.out.println("Hewan ini Merupakan Hewan Mamalia");
            }
            else{
                System.out.println("Hewan ini Bukan Merupakan Hewan Mamalia");
            }
        }
        else if (Jenis == 2) {
            System.out.println("Jenis Hewan     : Anjing");
            anjing.Suara();
            System.out.println("Jenis Suara     : "+anjing.Bersuara());
            Ciri = "Mempunyai Kelenjar Susu";
            if (Ciri == "Mempunyai Kelenjar Susu") {
                System.out.println("Hewan ini Merupakan Hewan Mamalia");
            }
            else{
                System.out.println("Hewan ini Bukan Merupakan Hewan Mamalia");
            }
        }
    }
}
