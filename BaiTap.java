import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap Ten");
        String name = sc.nextLine();

        System.out.println("Nhap Tuoi");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap Gioi Tinh");
        String gender = sc.nextLine();

        System.out.println("Noi Sinh Song Va Lam Viec");
        String address = sc.nextLine();

        System.out.println("Xin Chao Cac Ban, minh ten la " + name + " nam nay minh " + age + " tuoi,gioi tinh " + gender + ".Hien tai minh dang song va lam viec tai " +
                "" + address);
        // Dien Tich
        System.out.println("Tinh Dien Tich Hinh Chu Nhat");
        System.out.println("Chieu Dai :");
        double width = sc.nextDouble();

        System.out.println("Chieu Rong :");
        double height = sc.nextDouble();

        System.out.println("Voi width = " + width + " va height = " + height + " thi dien tich hinh chu nhat la = " + dientich(width, height));
        // Chu Vi
        System.out.println("Tinh Chu Vi Hinh Chu Nhat");
        System.out.println("Chieu Dai :");
        double chieudai = sc.nextDouble();

        System.out.println("Chieu Rong :");
        double chieurong = sc.nextDouble();

        System.out.println("Voi chieu dai = " + chieudai + " va chieu rong = " + chieurong + " thi chu vi hinh chu nhat la = " + chuvi(chieudai, chieurong));
    }

    public static double dientich(double width, double height) {
        return width * height;
    }

    public static double chuvi(double chieudai, double chieurong) {
        return (chieudai + chieurong) * 2;
    }
}
