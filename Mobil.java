public class Mobil extends Kendaraan implements Perawatan, Pajak {
    private int jumlahPintu;

    public Mobil(String idKendaraan, String merk, int tahun, double kapasitasTangki, int jumlahPintu) {
        super(idKendaraan, merk, tahun, kapasitasTangki);
        this.jumlahPintu = jumlahPintu;
    }
    @Override
    public void isiBBM(double jumlahLiter) {
        if (getSisaBBM() + jumlahLiter > getKapasitasTangki()) {
            System.out.println("Pengisian BBM " + getMerk() + " (" + jumlahLiter + " L) : GAGAL | Melebihi Kapasitas Tangki (Max: " + getKapasitasTangki() + " L)");
        } else {
            setSisaBBM(getSisaBBM() + jumlahLiter);
            System.out.println("Pengisian BBM " + getMerk() + " (" + jumlahLiter + " L) : BERHASIL | Total BBM: " + getSisaBBM() + " L");
        }
    }
    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
    @Override
    public void servisRutin() {
        System.out.println("Servis Rutin Mobil: Ganti oli mesin, ganti filter udara, dan tune-up.");
    }
    @Override
    public double hitungEstimasiPajak() {
        return 2500000.0 + (getTahun() - 2020) * 150000.0;
    }

    public int getJumlahPintu() { return jumlahPintu; }
    public void setJumlahPintu(int jumlahPintu) { this.jumlahPintu = jumlahPintu; }
}