import java.util.Random;
import  java.util.Scanner;

public class vaksine {

    int jumlahvaksin = 3;
    static int totalpenerimavaksin = 180;
    public static String[] pfizer = new String[50];
    public static String[] moderna = new String[60];
    public static String[] sinopharm = new String[70];

    public static void infopasienvaksin() {
        int totalpfizer = 0;
        int sisakouta = 0;
        for (int index = 0; index<pfizer.length; index++) {
            if (pfizer[index] != null) {
                totalpfizer++;
            }
        }
        int totalmoderna = 0;
        for (int index = 0; index<moderna.length; index++) {
            if (moderna[index] != null) {
                totalmoderna++;
            }
        }
        int totalsinopharm = 0;
        for (int index = 0; index<sinopharm.length; index++) {
            if (sinopharm[index] != null) {
                totalsinopharm++;
            }
        }
        sisakouta = totalpenerimavaksin - totalpfizer - totalmoderna - totalsinopharm;
        System.out.println("Total Pasien Pfizer: " + totalpfizer + " Total Pasien Moderna: " + totalmoderna + "Total Pasien Sinopharm;" + totalsinopharm);
        System.out.println("jumlah Seluruh vaksin: " + totalpenerimavaksin + "Total Sisa Kouta:" + sisakouta);
        System.out.println();
    }

    public static void checkindexarray(String[] myArray, String pasien) {
        int indexNow = 0;
        for (int index=0; index<myArray.length; index++) {
            if (myArray[index] != null) {
                indexNow = index + 1;
            }
        }
        if(indexNow< myArray.length){
            myArray[indexNow] = pasien;
        }
    }



    public static void simpanPasien(int angkaRandom , String pasien) {


        switch (angkaRandom){
            case 1:
                checkindexarray(pfizer,pasien);
                System.out.println("anda Mendapat vaksin pfizer");
                infopasienvaksin();
                break;
            case 2:
                checkindexarray(moderna,pasien);
                System.out.println("anda mendapat vaksin moderna");
                infopasienvaksin();
                break;
            case 3:
                checkindexarray(sinopharm,pasien);
                System.out.println("anda mendapat vaksin sinopharm");
                infopasienvaksin();
                break;
        }

    }

    public static void inputPasien() {
        Scanner inputData = new Scanner(System.in);
        while (true){
            System.out.println("Pasien = ");
            String namapasien = inputData.nextLine();
            if(namapasien.isBlank()){
                System.out.println("Nama Pasien Wajib biisi");
                inputPasien();
            }else {
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3)+1;
                simpanPasien(JenisRandom,namapasien);
            }
        }
    }
    public static void main(String[] args) {

    }
}


