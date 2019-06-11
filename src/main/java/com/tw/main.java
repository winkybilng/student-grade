package com.tw;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Library library=new Library();
        library.showMainMenu();
        Scanner scanner=new Scanner(System.in);

        while(scanner.hasNext()){
            switch (scanner.nextLine()) {
                case "1":
                    System.out.print("请输入学生信息（格式：姓名, 学号, 学科: 成绩, ...），按回车提交：\n");
                    library.addStudent(scanner.nextLine());
                    break;
                case "2":
                    System.out.print("请输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：\n");
                    library.showReport(scanner.nextLine());
                    break;
                case "3":
                    System.exit(0);
                default:
                    library.showMainMenu();
                    break;

            }
        }
    }
}
