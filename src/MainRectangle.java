public class MainRectangle {
    public static void main(String[] args) {

        double width1 = 4;
        double height1 = 40;
        Rectangle rec1 = new Rectangle(width1, height1);
        System.out.println("Diện tích hình chữ nhật với width = " + width1 + " và height = " + height1 + " là: " + rec1.getArea());
        System.out.println("Chu vi hình chữ nhật với width = " + width1 + " và height = " + height1 + " là: " + rec1.getPerimeter());

        double width2 = 3.5;
        double height2 = 35.9;
        Rectangle rec2 = new Rectangle(width2, height2);
        System.out.println("Diện tích hình chữ nhật với width = " + width2 + " và height = " + height2 + " là: " + rec2.getArea());
        System.out.println("Chu vi hình chữ nhật với width = " + width2 + " và height = " + height2 + " là: " + rec2.getPerimeter());
    }
}
