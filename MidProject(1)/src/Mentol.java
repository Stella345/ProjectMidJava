import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;

public class Mentol {
	
	
	public Mentol() {
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Scanner scan0 = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		Scanner check= new Scanner(System.in);
		
		String nama;
		String gender;
		String jabatan;
		int a=1;
		
		Random ranNum = new Random();
		Random rnd= new Random();
		char randChar= (char) ((char) 'A'+ rnd.nextInt(26));
		int gaji;
		
		ArrayList arr_data = new ArrayList();
		
		int input;
		
		do {
			System.out.println("Selamat datang di Aplikasi PT. Mentol!");
			System.out.println("======================================");
			System.out.println("1. Insert data karyawan");
			System.out.println("2. View data karyawan");
			System.out.println("3. Update data karyawan");
			System.out.println("4. Delete data karyawan");
			System.out.println("5. Exit");
			System.out.print("Silakan input pilihan Anda [1-5]: ");
			
			input= scan.nextInt();
			
			
			if(input == 1) {
				
				System.out.print("Banyak data yang ingin dimasukan: ");
				int angka= scan0.nextInt();
				
				for(int i=0;i<angka;i++) {
					System.out.print("Input nama karyawan [>=3]: ");
					nama = scan1.nextLine();
				
					System.out.print("Input jenis kelamin [Laki-laki | Perempuan]: ");
					gender = scan2.nextLine();
				
					System.out.print("Input jabatan [Manager | Supervisor | Admin]: ");
					jabatan = scan3.nextLine();
				
					arr_data.add(nama);
					arr_data.add(gender);
					arr_data.add(jabatan);
				}
				
				Scanner randNum = null;
				System.out.printf("Berhasil menambahkan karyawan dengan id %c%c.%d%d%d%d");
				

			}else if(input == 2) {
		
				if(jabatan.equals("Manager")) {
					gaji= 8000000;
				}else if(jabatan.equals("Supervisor")) {
					gaji= 6000000;
				}else if(jabatan.equals("Admin")) {
					gaji= 4000000;
				}
					System.out.println("|----|-------------------|---------------|----------------|--------------|");
					System.out.println("|No  |Kode Karyawan      |Jenis Kelamin  |Jabatan         |Gaji Karyawan |");
					System.out.println("|----|-------------------|---------------|----------------|--------------|");
		            for(Object o : arr_data)
		        {
					System.out.println(o);
		        }
		            
			}else if(input == 3) {
				
				
				
				
				
			}else if(input == 4) {
				
				System.out.println("Silakan diinput data yang ingin dihapus (berupa nomor): ");
				int index = check.nextInt();
				arr_data.remove(index);
				
				
				
			}else if(input == 5) {
				a=2;
				System.out.println(" ");
				System.out.println("\tSee you next time!\t");
				
			}else {
				System.out.println("Maaf, tidak ada dalam menu");
			}
		}while(a==1);
				
			
		}


}
