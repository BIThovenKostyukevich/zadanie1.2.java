import java.util.Scanner;

class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое цисло");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Кокую операцию вы хотите провести (<, >, =");
        char opper = sc.next().charAt(0);
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("b > a");
        } else {
            System.out.println("a = b");
        }
    }
}