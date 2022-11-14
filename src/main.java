import  java.util.Arrays;
import java.util.Random;
import  java.util.Scanner;

public class main {

    int jumlahProdi = 3;
    static int totalpenerimamaba = 1050;
    public static String[] TI = new String[500];
    public static String[] DKV = new String[300];
    public static String[] TK = new String[250];

    public static void infomaba() {
        int NIKTI= 0;
        int sisakouta = 0;
        for (int index = 0; index < TI.length; index++) {
            if (TI[index] != null) {
                NIKTI++;
            }
        }
        int NIKDKV = 0;
        for (int index = 0; index < DKV.length; index++) {
            if (DKV[index] != null) {
                NIKDKV++;
            }
        }
        int NIKTK= 0;
        for (int index = 0; index < TK.length; index++) {
            if (TK[index] != null) {
                NIKTK++;
            }
        }
        sisakouta = totalpenerimamaba - NIKTI - NIKDKV - NIKTK;
        System.out.println("nik anda : " + NIKTI + " | nik anda : " + NIKDKV + " | nik anda : " + NIKTI);
        System.out.println("jumlah Seluruh Maba : " + totalpenerimamaba + "Total Sisa Kouta:" + sisakouta);
        System.out.println();
    }

    public static void checkindexarray(String[] myArray, String Maba) {
        int indexNow = 0;
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] != null) {
                indexNow = index + 1;
            }
        }
        if (indexNow< myArray.length){
            myArray[indexNow] = Maba;
        }
    }



    public static void simpanMaba(int angkaRandom , String Maba) {


        switch (angkaRandom){
            case 1:
                checkindexarray(TI,Maba);
                System.out.println("Nik anda : ");
                infomaba();
                break;
            case 2:
                checkindexarray(DKV,Maba);
                System.out.println("Nik anda : ");
                infomaba();
                break;
            case 3:
                checkindexarray(TK,Maba);
                System.out.println("Nik anda : ");
                infomaba();
                break;
        }

    }

    public static void inputMaba() {
        Scanner inputData = new Scanner(System.in);
        while (true){
            System.out.println("Nama = ");
            String namamaba = inputData.nextLine();
            if(namamaba.isBlank()){
                System.out.println("Nama Wajib biisi");
                inputMaba();
            }else {
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3)+1;
                simpanMaba(JenisRandom,namamaba);
            }
        }
    }

    public static void main(String[] args) {
        inputMaba();
    }
}