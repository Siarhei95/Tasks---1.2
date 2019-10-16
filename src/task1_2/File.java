package task1_2;
import java.io.FileReader;
import java.util.Scanner;

public class File {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("File1.txt");
        Scanner scan = new Scanner(fr);

        int i = 1;

        System.out.println("\nThe file contains the following text: \n");
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }
        System.out.println("\n");

        fr.close();


        String note =  "1 : Tема:            ,    дата создания: ,                   e-mail: ,                             сообщение:\n" +
                       "2 : Посмотреть авто  ,     13.10.2019    ,        avtokoleso@mail.ru ,           Нужно найти хороший вариант;\n" +
                       "3 : Попасть на курсы ,     17.10.2019    ,  Olga_Smolyakova@epam.com ,   Нужно постараться решить все задачи;\n" +
                       "4 : Найти литературу ,     28.11.2019    , s.pashkovskiy08@gmail.com ,  Нужно найти и сбросить себе на почту;\n" +
                       "5 : Спорт            ,     22.10.2019    ,        muayThai@gmail.com ,               Нужно ходить на тренировку;";


        Notebook notebook = new Notebook("Ближайшие планы");
        Note notes = new Note(note);
        Logic logic = new Logic();
        logic.getEmail(note);
        logic.getDate(note);
        logic.getTheme(note);
        logic.getPosts(note);

    }



}