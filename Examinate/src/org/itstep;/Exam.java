import org.itstep.Dir;
import org.itstep.Pwd;
import org.itstep.Cat;
import org.itstep.Cd;
import java.io.File;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String consScan;
        String [] sp;

        System.out.println("Манул: \n" +
                "       - dir — выводит список файлов в текущей директории\n" +
                "       - cd «путь» — перейти в директорию, путь к которой задан первым аргументом\n" +
                "       - pwd — вывести полный путь до текущей директории\n" +
                "       - cat «имя_файла» - выводит содержимое текстового файла «имя_файла»\n");

        while (true){

            System.out.printf("Введите команду: ");
            consScan = scanner.nextLine();
            sp = consScan.split(" "); // TODO: лучше было использовать trim

            switch (sp[0]){
                case "dir": {
                    Dir out = new Dir();
                    out.perform();
                    break;
                }
                case "pwd": {
                    Pwd absp = new Pwd();
                    absp.abspath();
                    break;
                }
                case "cat": {
                    Cat outText = new Cat();
                    System.out.println(outText.textOut(sp[1]));
                }
                case "cd": {
                    Cd sda = new Cd();
                    sda.changeDir(sp[1]);

                    break;
                }

            }

        }
    }
}
