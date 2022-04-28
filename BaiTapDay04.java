import java.util.Scanner;

public class BaiTapDay04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("\n\n Nhập Tên Của Bạn : ");
        name = sc.nextLine();
        char [] names = name.toCharArray();
        boolean upCase = true;
        for (int i = 0; i < names.length; i++) {
            if (Character.isLetter(names[i])){
                if (upCase){
                    names[i] = Character.toUpperCase(names[i]);
                    upCase = false;
                }
            }
            else {
                upCase = true;
            }
        }
        name = String.valueOf(names);
        System.out.println("Tên Viết Hoa : \n" + name);
    }
}
