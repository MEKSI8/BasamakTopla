import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı girin: ");
        String say= input.nextLine();
        int toplam=0;
        for (int i=0;i<say.length();i++){
            int say2=Integer.parseInt(String.valueOf(say.charAt(i)));
            toplam+=say2;
        }

        System.out.println(toplam);
    }
}