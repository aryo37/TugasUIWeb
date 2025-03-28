# Proyek Pengujian Otomatis Saucedemo

Proyek ini berisi pengujian otomatis untuk fitur login dan verifikasi produk pada website [SauceDemo](https://www.saucedemo.com/), menggunakan Selenium WebDriver dan JUnit 5.

## Fitur yang Diuji
- Fungsi login dengan kredensial valid
- Verifikasi produk setelah login berhasil

## Prasyarat
- JDK 8 atau lebih baru
- Maven 3.6.3+
- Browser Chrome versi terbaru
- Koneksi internet (untuk mengunduh dependencies dan mengakses Saucedemo)

## Setup Proyek

1. **Clone repositori**:
   ```bash
   git clone [URL_REPOSITORI_ANDA]
   cd nama-direktori-proyek

   Menjalankan Pengujian
   Menggunakan IDE
Buka proyek di IntelliJ IDEA/Eclipse

Jalankan file LoginTest.java sebagai JUnit Test

Konfigurasi
Mengubah Waktu Tunggu
Untuk mengubah timeout implicit wait, edit baris berikut di LoginTest.java:
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

Dependencies
Selenium Java 4.x

WebDriverManager 5.x

JUnit Jupiter 5.x

Laporan Hasil Test
Setelah menjalankan test, hasilnya akan muncul di:

Console output

Direktori target/surefire-reports/ (laporan XML)

Troubleshooting
Jika Test Gagal
Pastikan koneksi internet stabil

Periksa versi browser yang terinstall

Verifikasi elemen UI di website Saucedemo belum berubah
