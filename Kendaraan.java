public abstract class Kendaraan {
    public static final String NAMA_BENGKEL = "CIHUYYY BANGET";
    private final String idKendaraan;

    private String merk;
    private int tahun;
    private double kapasitasTangki;
    private double sisaBBM;

    public Kendaraan(String idKendaraan, String merk, int tahun, double kapasitasTangki) {
        this.idKendaraan = idKendaraan;
        this.merk = merk;
        this.tahun = tahun;
        this.kapasitasTangki = kapasitasTangki;
        this.sisaBBM = 5.0;
    }
    public abstract void isiBBM(double jumlahLiter);

    public void tampilkanInformasi() {
        System.out.println("ID Kendaraan : " + idKendaraan);
        System.out.println("Merk         : " + merk);
        System.out.println("Tahun        : " + tahun);
        System.out.println("Kapasitas    : " + kapasitasTangki + " Liter");
        System.out.println("Sisa BBM     : " + sisaBBM + " Liter");
    }
    public String getIdKendaraan() { return idKendaraan; }
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }
    public int getTahun() { return tahun; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    public double getKapasitasTangki() { return kapasitasTangki; }
    public void setKapasitasTangki(double kapasitasTangki) { this.kapasitasTangki = kapasitasTangki; }
    public double getSisaBBM() { return sisaBBM; }
    public void setSisaBBM(double sisaBBM) { this.sisaBBM = sisaBBM; }
}