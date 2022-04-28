import java.util.Scanner;

public class BaiTap04 {
    public static void main(String[] args) {

        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào độ dài của mảng : ");
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Các giá trị trong mảng là : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " \t");
        }

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]%2) == 0) {
                arr[i] += 1;
            }
        }
        System.out.println();

        System.out.println("Các giá trị sau khi làm lẻ là");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " \t");
        }

    }
}
