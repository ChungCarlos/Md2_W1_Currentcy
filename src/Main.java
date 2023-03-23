import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int VND;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tỉ giá USD:");
        VND = scanner.nextInt();
        int currentcy = VND * 23000;
        System.out.println("Giá trị VND: " + currentcy);
    }
}