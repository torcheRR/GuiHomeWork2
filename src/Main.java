import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Main extends JFrame {

    Main(){
        String[] sesliHarfler = new String[]{"a", "e", "ı", "i", "o", "ö", "u", "ü"};
        String[] sessizHarfler = new String[]{"z", "y", "v", "t", "ş", "s", "r", "p", "n", "r", "m", "l", "k", "h", "j", "ğ", "g", "d", "ç", "c", "b"};
        String isim="";
        Random rnd = new Random();

        int adet = Integer.parseInt(JOptionPane.showInputDialog("Kaç adet hayvan ismi üretilmesini istiyorsunuz: "));
        int harfAdet = Integer.parseInt(JOptionPane.showInputDialog(adet + " adet hayvanın isimleri kaç harfli olsun: "));
        String[] total = new String[adet];

        try {
            for (int i = 0; i<adet ; i++){
                for (int j = 0; j<harfAdet; j++){
                    if (j % 2 == 0){
                        isim+=((sessizHarfler[rnd.nextInt(sessizHarfler.length)]));
                    }else {
                        isim+=((sesliHarfler[rnd.nextInt(sesliHarfler.length)]));
                    }
                }
                total[i]=((isim));
                isim="";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null,"Hayvanların isimleri: "+ Arrays.toString(total));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new Main();
    }
}