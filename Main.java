public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM MANAJEMEN OTOMOTIF - " + Kendaraan.NAMA_BENGKEL + " ===\n");

        Mobil mobil1 = new Mobil("MOB-001", "Toyota Avanza", 2022, 45.0, 5);
        Motor motor1 = new Motor("MTR-001", "Honda Vario", 2021, 5.5, "V-Belt");

        System.out.println("--- DATA MOBIL ---");
        mobil1.tampilkanInformasi();

        System.out.println("\n--- DATA MOTOR ---");
        motor1.tampilkanInformasi();

        System.out.println("\n--- TRANSAKSI PENGISIAN BBM ---");
        mobil1.isiBBM(30.0);
        mobil1.isiBBM(25.0);
        motor1.isiBBM(2.0);

        System.out.println("\n--- JADWAL SERVIS KENDARAAN ---");
        Perawatan p1 = mobil1;
        Perawatan p2 = motor1;
        p1.servisRutin();
        p2.servisRutin();

        System.out.println("\n--- ESTIMASI PAJAK KENDARAAN ---");
        Pajak pajakMobil = mobil1;
        System.out.println("Estimasi Pajak Tahunan " + mobil1.getMerk() + " : Rp" + pajakMobil.hitungEstimasiPajak());
    }
}