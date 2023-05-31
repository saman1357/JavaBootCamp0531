import java.util.Scanner;
public class Java0531 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Summe zweier eingegebenen Integer in einer Methode berechnen. Einmal mit return als int und einmal als String.
        System.out.println("Bitte gebe zwei Integer-Werte zum Summieren ein:");
        System.out.println("erste Zahl:");
        int a=scanner.nextInt();
        System.out.println("zweite Zahl:");
        int b=scanner.nextInt();

        System.out.println(sum(a,b));
        System.out.println(sumString(a,b));

        //Fakultät berechnen. Zwei Methoden: einmal mit for und einmal mit while...
        System.out.println("Bitte gebe eine Integer-Zahl ein um die Fakultät zu berechnen:");
        int x=scanner.nextInt();
        System.out.println("Fakultät von "+ x+ " ist "+factorial(x));
        System.out.println("Fakultät von "+ x+ " ist "+factorial2(x));

        //Methode zum Vergleichen zweier Integer-Werte ob mindestens eines der beiden größer ist als 100.
        System.out.println("Bitte gebe zwei Integer-Werte ein um zu vergleichen, ob mindestens einer der beiden größer ist als 100:");
        System.out.println("erste Zahl:");
        int i=scanner.nextInt();
        System.out.println("zweite Zahl:");
        int j=scanner.nextInt();
        System.out.println(isGreaterThen100(i,j));
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static String sumString(int a, int b){
        return "Summe: "+(a+b);
    }
    public static int factorial(int x){
        int answer=1;
        for (int i=x; i>0; i--){
            answer*=i;
        }
        return answer;
    }
    public static int factorial2(int x){
        int answer=1;
        int i=x;
        while (i>0){
            answer*=i;
            i--;
        }
        return answer;
    }
    public static boolean isGreaterThen100(int a, int b) {
        return (a > 100 || b > 100);
    }
}
