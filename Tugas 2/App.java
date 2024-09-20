import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Map<Integer, String> Mahasiswa = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int pil;

        do {
            System.out.println("====================================");
            System.out.println("Manajemen Sistem Informasi Mahasiswa");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Daftar Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");
            pil = sc.nextInt();
            sc.nextLine(); 

            switch (pil) {
                case 1: {
                    System.out.print("Masukkan NIM: ");
                    int nim = sc.nextInt();
                    sc.nextLine(); 
                    if (Mahasiswa.containsKey(nim)) {
                        System.out.println("NIM sudah ada!");
                        break;
                    }
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    Mahasiswa.put(nim, nama);
                    System.out.println("Mahasiswa berhasil ditambahkan.");
                    break;
                }
                
                case 2: {
                    if (Mahasiswa.isEmpty()) {
                        System.out.println("Tidak ada mahasiswa yang terdaftar.");
                    } else {
                        System.out.println("Daftar Mahasiswa:");
                        for (Map.Entry<Integer, String> data : Mahasiswa.entrySet()) {
                            System.out.println("NIM: " + data.getKey() + ", Nama: " + data.getValue());
                        }
                    }
                    break;
                }

                case 3: {
                    System.out.print("Masukkan NIM yang akan di-update: ");
                    int nimUp = sc.nextInt();
                    sc.nextLine(); // Membersihkan buffer
                    if (Mahasiswa.containsKey(nimUp)) {
                        System.out.print("Masukkan Nama Baru: ");
                        String namaUp = sc.nextLine();
                        Mahasiswa.put(nimUp, namaUp);
                        System.out.println("Data berhasil diperbarui.");
                    } else {
                        System.out.println("NIM tidak ditemukan.");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Masukkan NIM yang akan dihapus: ");
                    int nimDl = sc.nextInt();
                    sc.nextLine(); // Membersihkan buffer
                    if (Mahasiswa.containsKey(nimDl)) {
                        Mahasiswa.remove(nimDl);
                        System.out.println("Data berhasil dihapus.");
                    } else {
                        System.out.println("NIM tidak ditemukan.");
                    }
                    break;
                }

                case 0: {
                    System.out.println("Keluar dari program.");
                    break;
                }

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

        } while (pil != 0);

        sc.close();
    }
}
