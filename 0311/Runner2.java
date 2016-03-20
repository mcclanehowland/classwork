import java.util.ArrayList;

public class Runner2 {
    public static void main(String[] args) {
        ArrayList<Language> languages= new ArrayList<Language>();
        languages.add(new English());
        languages.add(new French());
        languages.add(new Hebrew());
        for(Language each : languages) {
            System.out.println(each.getAuthor());
            System.out.println(each.getHello());
            System.out.println(each.getBye());
            System.out.println(each.getThankYou());
        }
    }
}

