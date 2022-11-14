import java.util.Scanner;

public class JawabanNomerTiga {



        int jumlahplatmobile = 5;
        static int totaljumlahmobile=55;
        public static String[] Kudus = new  String[9];
        public static String[] Jakarta= new String[10];
        public static String[] Jogja= new String[11];
        public static String [] Karawang = new String[12];
        public static String [] Solo = new String[13];
        public static void infoplat(){
            int totalkudus =0;
            int sisamobile =0;
            for (int i=0;i<Kudus.length;i++){
                if(Kudus[i] !=null)
                    totalkudus++;
            }
            int totaljakarta =0;
            for (int i=0;i<Jakarta.length;i++){
                if (Jakarta[i] !=null)
                    totaljakarta++;
            }
            int totaljogja =0;
            for (int i=0;i< Jogja.length;i++){
                if (Jogja[i] !=null)
                    totaljogja++;
            }
            int totalkarawang =0;
            for (int i=0;i<Karawang.length;i++){
                if (Karawang[i] !=null)
                    totalkarawang++;
            }
            int totalsolo = 0;
            for (int i=0;i<Solo.length;i++){
                if (Solo[i] !=null)
                    totalsolo++;
            }


            sisamobile= totaljumlahmobile-totalkudus-totaljogja-totaljakarta-totalkarawang-totalsolo;
            System.out.println(" Total plat mobil Kudus:"+ totalkudus+"| Total plat mobil Jakarta:"+ totaljakarta
                    +"|Total plat mobil Jogja" +totaljogja+"|Total plat mobil Karawang : " + totalkarawang+"|Total plat mobil Solo:"  +  totalsolo);
            System.out.println(" Jumlah seluruh mobil "+ totaljumlahmobile +"|Total sisa mobile "+ sisamobile);
            System.out.println();
        }


        public static void CheckIndexArray(String[] myArray, int mobil ){
            int inow=0;
            for (int i=0;i<myArray.length;i++){
                if (myArray[i] !=null){
                    inow= i+1;
                }
            }
            if (inow<myArray.length){
                myArray[inow] = String.valueOf(mobil);
            }
            if (mobil % 2 == 0) {
                System.out.println(" Nomor plat termasuk plat genap ");
            } else {
                System.out.println(" Nomor plat termasuk plat ganjil ");

                int i, j, k = 0, jlh_genap = 0, jlh_ganjil = 0;


                for (i = 0; i <= totaljumlahmobile; i++) {
                    if (i  == 0) {
                        jlh_genap++;
                    }
                }

                for (i = 0; i <= totaljumlahmobile; i++) {
                    if (i == 0) {
                        jlh_ganjil++;
                    }
                }

                System.out.println("Jumlah Plat Genap : " + jlh_genap);
                System.out.println("Jumlah Plat Ganjil : " + jlh_ganjil);

            }
        }

        public static void simpanmobil(String lokasi, String mobil){
            switch (lokasi) {
                case "K":
                    CheckIndexArray(Kudus, Integer.parseInt(mobil));
                    System.out.println(" plat nomor Kudus ");
                    infoplat();
                    break;
                case "B":
                    CheckIndexArray(Jakarta, Integer.parseInt(mobil));
                    System.out.println("plat nomor Jakarta ");
                    infoplat();
                    break;
                case "AB":
                    CheckIndexArray(Jogja, Integer.parseInt(mobil));
                    System.out.println("plat nomor Jogja ");
                    infoplat();
                    break;
                case "T":
                    CheckIndexArray(Karawang, Integer.parseInt(mobil));
                    System.out.println("plat nomor Karawang ");
                    infoplat();
                    break;
                case "AD":
                    CheckIndexArray(Solo, Integer.parseInt(mobil));
                    System.out.println("plat nomor Solo");
                    infoplat();
                    break;
            }
        }

        public static void input(){
            Scanner aku = new Scanner(System.in);
            do {

                System.out.println(" Masukan kode dan nomor plat  :  ");
                simpanmobil(aku.nextLine(), aku.nextLine());
            }while (totaljumlahmobile<=56);


        }

        public static void main(String[] args) {
            input();
        }
    }




