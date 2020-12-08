// Aplikasi Tanaman
import java.util.Scanner;

public class aplikasiTanaman{
	public static void main(String args[]){
		// deklarasi
		int[] kode = new int[4];
		int[] harga = new int[4];
		String[] barang = new String[5];
		Scanner input = new Scanner(System.in);
		int total = 0;
		// program aplikasi Tanaman
		System.out.println("-- SELAMAT DATANG DI APLIKASI PENJUALAN TANAMAN --");
		System.out.println("-- TANAMAN YANG TERSEDIA --");
		System.out.println("1. Tanaman Hias Aglaonema Pictum");
		System.out.println("2. Tanaman Hias Monstera Variegata");
		System.out.println("3. Tanaman Hias Philo jari");
		System.out.println("");
		System.out.print("Berapa banyak yang anda ingin beli: ");
		int jum = input.nextInt();
		
		System.out.println("");
		
		//masukan element array
		for(int i = 0; i<jum; i++){
			System.out.print("Masukan kode barang: ");
			kode[i] = input.nextInt();
			switch(kode[i]){
				case 1 :
					barang[i] = "Tanaman Hias Aglaonema Pictum";
					harga[i] = 10000;
					break;
				case 2 :
					barang[i] = "Tanaman Hias Monstera Variegata";
					harga[i] = 15000;
					break;
				case 3 :
					barang[i] = "Tanaman Hias Philo Jari";
					harga[i] = 20000;
					break;
				default :
					System.out.println("kode barang tidak tersedia");
			}
			
		} 
		
		// menampilkan array
		for(int i = 0; i<jum; i++){
			total += harga[i];
			System.out.print(barang[i]+ " " + harga[i]);
			System.out.println("");
		}
		// menampilkan total pembayaran
		System.out.print("Total Bayar: " + total);
	}
}