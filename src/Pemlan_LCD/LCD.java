package Pemlan_LCD;

public class LCD {
    /* Inisialisasi */
    private String status_lcd;
    private int volume_lcd;
    private int brightness_lcd;
    private String cable_ke;

    /* Ketentuan Method */
    public void turnOff() {
        // jika dipanggil maka status LCD sedang mati
        this.status_lcd = "Mati";
    }

    public void turnOn() {
        // jika dipanggil maka status LCD sedang menyala
        this.status_lcd = "Menyala";
    }

    public void Freeze() {
        // jika dipanggil maka status LCD dipastikan sudah menyala namun masih sedang freeze
        if (!(this.status_lcd.equals("Mati"))) {
                this.status_lcd = "Freeze";
        }
        else{
            System.out.println("Status LCD dalam Keadaan Mati");
        }
    }

    public void volumeUp() {
        // pengecekan jika status LCD dipastikan sudah menyala
        if (!(this.status_lcd.equals("Mati"))) {
                this.volume_lcd++; //loop-increment terjadi jika volumeUp() dipanggil sehingga volume_lcd bertambah 1
        }
        else {
            System.out.println("Status LCD dalam Keadaan Mati");
        }
    }

    public void volumeDown() {
        // pengecekan jika status LCD dipastikan sudah menyala
        if (!(this.status_lcd.equals("Mati"))) {
            this.volume_lcd--; //loop-decrement terjadi jika volumeDown() dipanggil sehingga volume_lcd berkurang 1
        }
        else {
            System.out.println("Status LCD dalam Keadaan Mati");
        }
    }

    public void setVolume(int volume_lcd) {
               this.volume_lcd = volume_lcd;
    }

    public void brightnessUp() {
        // pengecekan jika status LCD dipastikan sudah menyala
        if (!(this.status_lcd.equals("Mati"))) {
              this.brightness_lcd++;//loop-increment terjadi jika brightnessUp() dipanggil sehingga brightness_lcd bertambah 1
        }
        else {
            System.out.println("Status LCD dalam Keadadan Mati");
        }
    }

    public void brightnessDown() {
        // pengecekan jika status LCD dipastikan sudah menyala
        if (!(this.status_lcd.equals("Mati"))) {
               this.brightness_lcd--;//loop-decrement terjadi jika brightnessDown() dipanggil sehingga brightness_lcd berkurang 1
        }
        else {
            System.out.println("Status LCD dalam Keadaan Mati");
        }
    }

    public void setBrightness(int brightness_lcd) {
                this.brightness_lcd = brightness_lcd;
    }
    /* Method menentukan 5 jenis kabel menggunakan array */
    public void setCable(int cable_ke) {
        String[] kabel = {"DVI", "VGA", "HDMI", "USB", "Display Port"};
        // memastikan semua jenis bisa terpanggil (length=5)
        if (cable_ke >= 0 && cable_ke < kabel.length) { 
            this.cable_ke = kabel[cable_ke]; //menyimpan String yang terpilih dari array ke variabel cable_ke
        }
    }
    /* Method untuk tampilan */
    public void displayMessage() {
        System.out.println("LCD Status: " + this.status_lcd);
        System.out.println("Volume: " + this.volume_lcd);
        System.out.println("Brightness: " + this.brightness_lcd);
        System.out.println("Cable: " + this.cable_ke);
    }
}