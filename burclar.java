import java.util.Scanner;
public class burclar {
    public static void main(String[] args) {
        int month,day;
        String burc="";
        boolean isError=false;

        Scanner inp=new Scanner(System.in);
        System.out.print("Doğduğunuz ay:");
        month=inp.nextInt();

        System.out.print("Doğduğunuz gün:");
        day=inp.nextInt();

        switch (month){
            case 1:
                if (day>=1 && 31>day) {
                    if (day < 22) {
                        burc="Oğlak";
                    } else {
                        burc="Kova";
                    }
                }else {
                    isError=true;
                }
                break;

            case 2:
                if (day>=1 && 28>day) {
                    if (day < 20) {
                        burc="Kova";
                    } else {
                        burc="Balık";
                    }
                }else {
                    isError=true;
                }
                break;
            case 3:
                if (day>=1 && 31>day) {
                    if (day<21){
                        burc="Balık";
                    }else {
                        burc="Koc";
                    }
                }else {
                    isError=true;
                }
                break;
            case 4:
                if (day>=1 && 31>day) {
                    if (day<21){
                        burc="Koc";
                    }else {
                        burc="Boğa";
                    }
                }else {
                    isError=true;
                }
                break;
            case 5:
                if (day>=1 && 31>day) {
                    if (day<22){
                        burc="Boğa";
                    }else {
                        burc="İkizler";
                    }
                }else {
                    isError=true;
                }
                break;
            case 6:
                if (day>=1 && 31>day) {
                    if (day<23){
                        burc="İkizler";
                    }else {
                        burc="Yengec";
                    }
                }else {
                    isError=true;
                }
                break;
            case 7:
                if (day>=1 && 31>day){
                    if (day<23){
                        burc="Yengeç";
                    }else {
                        burc="Aslan";
                    }
                }else {
                    isError=true;
                }
                break;
            case 8:
                if (day>=1 && 31>day){
                    if (day<23){
                        burc="Aslan";
                    }else {
                        burc="Başak";
                    }
                }else {
                    isError=true;
                }
                break;
            case 9:
                if (day>=1 && 31>day){
                    if (day<23){
                        burc="Başak";
                    }else {
                        burc="Terazi";
                    }
                }else {
                    isError=true;
                }
                break;
            case 10:
                if (day>=1 && 31>day){
                    if (day<23){
                        burc="Terazi";
                    }else {
                        burc="Akrep";
                    }
                }else {
                    isError=true;
                }
                break;
            case 11:
                if (day>=1 && 31>day){
                    if (day<22){
                        burc="Akrep";
                    }else {
                        burc="Yay";
                    }
                }else {
                    isError=true;
                }
                break;
            case 12:
                if (day>=1 && 31>day){
                    if (day<22){
                        burc="Yay";
                    }else {
                        burc="Oğlak";
                    }
                }else {
                    isError=true;
                }
                break;
            default:
                isError=true;
        }
        if (isError){
            System.out.print("Hatalı bir giriş yaptınız,tekrar deneyiniz.");
        }else {
            System.out.print("Burcunuz:"+burc);
        }
    }
}
