package task1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {
    ArrayList arrayListEmails = new ArrayList();
    ArrayList arrayListDate = new ArrayList();
    ArrayList arrayListTheme = new ArrayList();
    ArrayList arrayListPost = new ArrayList();


     public void getEmail(String note) {
        Pattern p = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher m = p.matcher(note);
        while (m.find()) {
            arrayListEmails.add(m.group());
            Collections.sort(arrayListEmails);
        }
         System.out.println("\nSorted emails: " + Arrays.toString(new ArrayList[]{arrayListEmails})+"\n");
    }

    public void getDate(String note){
        Pattern p = Pattern.compile("\\d\\d\\.\\d\\d.\\d{4}");
        Matcher m = p.matcher(note);
        while (m.find()) {
            arrayListDate.add(m.group());
            Collections.sort(arrayListDate);
        }
        System.out.println("\nSorted dates: " + Arrays.toString(new ArrayList[]{arrayListDate})+"\n");
    }

    public void getTheme(String note){
        Pattern p = Pattern.compile("[^1]\\d\\s:\\s\\D{16}");
        Matcher m = p.matcher(note);
        while (m.find()) {
            arrayListTheme.add(m.group());
            Collections.sort(arrayListTheme);
        }
        System.out.println("\nSorted themes: " + Arrays.toString(new ArrayList[]{arrayListTheme})+"\n");
    }

    public void getPosts(String note){
        Pattern p = Pattern.compile("Нужно\\s\\D+;");
        Matcher m = p.matcher(note);
        while (m.find()) {
            arrayListPost.add(m.group());
            Collections.sort(arrayListPost);
        }
        System.out.println("\nSorted posts: " + Arrays.toString(new ArrayList[]{arrayListPost})+"\n");
    }
}
