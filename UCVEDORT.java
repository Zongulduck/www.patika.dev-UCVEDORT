import java.util.Scanner;
public class UCVEDORT {
    public static void main(String[]args){
        int sayı,toplam,sayac;
        double ort = 0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Sayı giriniz");
        sayı= inp.nextInt();
        if(sayı<=0){
System.out.println("Sayı 0 dan büyük olmalıdır lütfen yeniden başlatın.");
        }
        toplam=0;
        sayac=0;
        System.out.println("3'e ve 4'e tam bölünen sayılar;");
        for(int i=0;i<=sayı;i++){
            if(i%4==0 && i%3==0 && i!=0) {
                System.out.println(i);
                sayac++;
                toplam=(toplam+i);
            }
        }
        if(toplam==0){
            System.out.println("3'e ve 4'e tam bölünen hiç sayı yok");
        }
        System.out.println("3'e ve 4'e tam bölünen kaç sayı var: "+sayac);
        ort=(toplam/sayac);
        System.out.println("Ortalama: "+ort);
        
    }
}
