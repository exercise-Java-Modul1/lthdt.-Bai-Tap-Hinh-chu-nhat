import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the width: ");
        double width = sc.nextDouble();
        System.out.print("Input the height: ");
        double height = sc.nextDouble();

        Rectangle rec = new Rectangle(width, height);

        System.out.println("Diện tích hình chữ nhật với width = " + width + " và height = " + height + " là: " + rec.getArea());
        System.out.println("Chu vi hình chữ nhật với width = " + width + " và height = " + height + " là: " + rec.getPerimeter());
    }
}
