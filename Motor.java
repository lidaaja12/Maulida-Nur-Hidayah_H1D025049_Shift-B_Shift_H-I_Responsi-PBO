public class Motor extends Kendaraan implements Perawatan {
    private String tipeRantai;

    public Motor(String idKendaraan, String merk, int tahun, double kapasitasTangki, String tipeRantai) {
        super(idKendaraan, merk, tahun, kapasitasTangki);
        this.tipeRantai = tipeRantai;
    }
    @Override
    public void isiBBM(double jumlahLiter) {
        if (jumlahLiter <= 0) {
            System.out.println("Pengisian BBM " + getMerk() + " : GAGAL | Jumlah liter harus lebih dari 0");
        } else if (getSisaBBM() + jumlahLiter > getKapasitasTangki()) {
            setSisaBBM(getKapasitasTangki());
            System.out.println("Pengisian BBM " + getMerk() + " (" + jumlahLiter + " L) : BERHASIL | Tangki Penuh (Max: " + getKapasitasTangki() + " L)");
        } else {
            setSisaBBM(getSisaBBM() + jumlahLiter);
            System.out.println("Pengisian BBM " + getMerk() + " (" + jumlahLiter + " L) : BERHASIL | Total BBM: " + getSisaBBM() + " L");
        }
    }
    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Tipe Rantai  : " + tipeRantai);
    }
    @Override
    public void servisRutin() {
        System.out.println("Servis Rutin Motor: Pelumasan rantai, cek rem, dan ganti oli.");
    }
    public String getTipeRantai() { return tipeRantai; }
    public void setTipeRantai(String tipeRantai) { this.tipeRantai = tipeRantai; }
}