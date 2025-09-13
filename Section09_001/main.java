package Section09_001;

import java.util.Scanner;

public class main {
    static StudentManagement[] studentManagements = new StudentManagement[100];
    static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*********************QUẢN LÝ SINH VIÊN********************\n" +
                    "1.Hiển thị danh sách sinh viên\n" +
                    "2.Thêm sinh viên\n" +
                    "3.Cập nhật thông tin sinh viên theo mã sinh viên\n" +
                    "4.Xóa sinh viên theo mã sinh viên\n" +
                    "5.Tìm sinh viên theo tên sinh viên\n" +
                    "6.Thoát");
            System.out.println("Nhap vao su lua chon cua ban");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    if (counter == 0) {
                        System.err.println("Khong co doi tuong Sinh Vien nao ton tai!!!");
                    } else {
                        displayData();
                    }
                    break;
                case 2:
                    addStudent(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 5:
                    findStudent(scanner);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui long nhap lai su lua chon tu 1-5");
            }
        } while (true);
    }

    public static void displayData() {
        for (int i = 0; i < counter; i++) {
            studentManagements[i].display();
        }
    }

    public static void addStudent(Scanner scanner) {
        System.out.println("Nhap vao so sinh vien can them");
        int n = Integer.parseInt(scanner.nextLine());
        //khoi tao doi tuong moi de nhap vao sinh vien
        System.out.println(n);

        for (int i = 0; i < n; i++) {
            studentManagements[counter] = new StudentManagement();
            studentManagements[counter].inputData(scanner);
            counter++;
        }
    }

    public static void updateStudent(Scanner scanner) {
        System.out.println("Nhap vao ma ID cua sinh vien can cap nhat");
        String updateId = scanner.nextLine();
        int updateIndex=-1;

        for (int i = 0; i < counter; i++) {
            if (studentManagements[i].getId().equals(updateId)) {
                updateIndex = i;
                boolean updateCheck = true;
                do {
                    System.out.println("Ban muon Update thong tin gi : \n" +
                            "1.Cập nhật tên sinh viên\n" +
                            "2.Cập nhật tuổi sinh viên\n" +
                            "3.Cập nhật chuyên ngành sinh viên\n" +
                            "4.Thoát");

                    int updateChoice = Integer.parseInt(scanner.nextLine());
                    switch (updateChoice) {
                        case 1:
                            System.out.println("Nhập vào tên mới của sinh viên");
                            String updateName = scanner.nextLine();
                            studentManagements[updateIndex].setStudentName(updateName);
                            break;
                        case 2:
                            System.out.println("Nhập vào tuổi của sinh viên");
                            int updateAge = Integer.parseInt(scanner.nextLine());
                            studentManagements[updateIndex].setStudentAge(updateAge);
                            break;
                        case 3:
                            System.out.println("Nhập vào chuyên ngành của sinh viên");
                            String updateMajor = scanner.nextLine();
                            studentManagements[updateIndex].setMajor(updateMajor);
                            break;
                        case 4:
                            updateCheck=false;
                            break;
                        default:
                            System.err.println("Vui long nhap lua chon tu 1-4");
                    }
                } while (updateCheck==true);

            }
        }
            if (updateIndex==-1){
                System.err.println("Khong tim thay gia tri ID nao phu hop");
            }
    }
    public static void deleteStudent(Scanner scanner) {
        System.out.println("Nhap vao ID sinh vien can xoa");
        String deleteId = scanner.nextLine();
        int deleteIndex=-1;
        for (int i = 0; i < counter; i++) {
            if (studentManagements[i].getId().equals(deleteId)) {
                deleteIndex = i;
                for (int j=deleteIndex; j<counter; j++) {
                    studentManagements[j]=studentManagements[j+1];
                }
                counter--;
            }
        }
        if (deleteIndex==-1){
            System.err.println("Khong tim thay ID nao phu hop");
        }
    }
    public static void findStudent(Scanner scanner) {
        System.out.println("Nhap vao ten sinh vien ban muon tim kiem");
        String findName = scanner.nextLine();
        int findIndex=0;
        for (int i = 0; i < counter; i++) {
            if (studentManagements[i].getStudentName().toLowerCase().contains(findName.toLowerCase())) {
                studentManagements[i].display();
                findIndex++;
            }
            }
        if(findIndex!=0){
            System.out.printf("Tim duoc %d ten sinh vien phu hop \n", findIndex);
        }else {
            System.err.println("Khong tim thay ten sinh vien nao phu hop");
        }
    }
}