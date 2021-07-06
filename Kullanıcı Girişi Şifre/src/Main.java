import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        String scan;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz :");

        String sys_kullanici = "patika";
        String sys_parola = "java123";


        String kullanici = inp.nextLine();
        System.out.print("Parolanızı giriniz :");

        String parola = inp.nextLine();
        // not : String==String yapamıyoruz String.equals(String) ile veya !String.equals(String) olarak yapmalıyız.
        if (kullanici.equals(sys_kullanici) && parola.equals(sys_parola)) {
            System.out.println("Sisteme başarılı bir şekilde giriş yapabildiniz...");

        } else if (kullanici.equals(sys_kullanici) && !parola.equals(sys_parola)) {
            System.out.println("Şifreniz Yanlış .Şifrenizi Yenilemek İster misiniz?:");
            System.out.println("1-Evet\n2-Hayır");
            System.out.print("Seçiminizi Giriniz :");
            int secim;

            secim = inp.nextInt();

            String yeniSifre ;
            yeniSifre  = inp.nextLine();
            System.out.println("Yeni Şifrenizi Giriniz  :");


            if (kullanici.equals(sys_kullanici) && yeniSifre.equals(sys_parola)) {
                System.out.println("Lütfen Yeni Şifreniz Eski Şifreniz İle Aynı Olmayacak Şekilde Giriniz");


            } else
                System.out.println("Şifreniz başarıyla oluşturulmuştur!");

        }
    }
}





