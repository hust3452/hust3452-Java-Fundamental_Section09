package Section09_002;

import java.util.Scanner;

public class Main {
    static Pet[] petArr = new Pet[100];
    static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*********************QUẢN LÝ THÚ CƯNG********************\n" +
                    "1.Hiển thị danh sách thú cưng\n" +
                    "2.Thêm thú cưng\n" +
                    "3.Gọi tiếng kêu\n" +
                    "4.Xóa thú cưng\n" +
                    "5.Tìm thú cưng theo tên\n" +
                    "6.Thoát");
            //
            System.out.print("Nhập vào sự lựa chọn: ");
            String input = scanner.nextLine().trim();
            if (!input.matches("[1-6]")) {
                System.err.println("❌ Vui lòng nhập số từ 1 đến 6.");
                continue;
            }
            int choice = Integer.parseInt(input);
            //

            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    add(scanner);
                    break;
                case 3:
                    for (int i=0;i<counter;i++){
                        System.out.println("ID %d :"+ petArr[i].getPetID()+ " " + petArr[i].speak());
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui long lua chon tu 1-6");
            }
        } while (true);
    }

    //xay dung phuong thuc hien thi
    public static void display() {
        for (int i = 0; i < counter; i++) {
            petArr[i].displayData();
        }
    }

    //xay dung phuong thuc them
    public static void add(Scanner scanner) {
        System.out.println("Nhap vao loai thu ma ban muon them : Dog or Cat ");
        String type = scanner.nextLine();
        if (type.toLowerCase().equals("dog")) {
            petArr[counter] = new Dog();

        } else if (type.toLowerCase().equals("cat")) {
            petArr[counter] = new Cat();

        }else{
            System.out.println("Ban nhap vao gia tri khong dung yeu cau");
            return;
        }
        petArr[counter].inputData(scanner);
        petArr[counter].displayData();
        counter++;
    }
    public static void animalsSpeak(){

    }

}


