import java.util.Scanner;
public class StudiKasus120 {
    public static void main(String[] args) {
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang Bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;     
        } else {
            diskon = 0;
            }       
    
        totalBayar= totalHarga - diskon;
        System.out.println("Total harga Rp" + totalHarga);
        System.out.println("Diskon Rp" + diskon);
        System.out.println("Total bayar Rp" + totalBayar);
        
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }
    }
    
}
