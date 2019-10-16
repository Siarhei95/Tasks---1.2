package task1_2;
import java.io.FileReader;
import java.util.Scanner;

public class File {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("File1.txt");
        Scanner scan = new Scanner(fr);

        int i = 1;

        System.out.println("\nThe file contains the following text: \n");
        while (scan.hasNextLine()) {                                    //выводит содержимое файла.txt
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

        Scanner scanner = new Scanner(System.in);
        Notebook notebook = new Notebook("Ближайшие планы");
        Note notes = new Note(note);
        Logic logic = new Logic();
        logic.getEmail(note); //выводит сортированные e-mails
        logic.getDate(note); //выводит сортированные даты
        logic.getTheme(note); //выводит сортированные по нумерациям темы
        logic.getPosts(note); //выводит сортированные сообщения
        System.out.print("\nWhat word do you want to find in the text? Enter it: ");
        String finder = scanner.next();
        logic.getWord(note,finder); //выводит требуемое выражения с требуемым словом(или несколько слов) из текста, если таковы есть

        System.out.println("\nAdd a new entry to the note:\n");

        System.out.println("Add theme: ");
        String addTheme = scanner.next();
        System.out.println("Add date: ");
        String addDate = scanner.next();
        System.out.println("Add e-mail: ");
        String addEmail = scanner.next();
        System.out.println("Add post : ");
        String addPost = scanner.next();  //нужно использовать nextLine(), чтобы вводилось несколько слов,
                                          // но почему nextLine путает всплывающие System.out.println

        logic.add(note,addTheme,addDate,addEmail,addPost); //добавит новую строку в тексте


    }
}