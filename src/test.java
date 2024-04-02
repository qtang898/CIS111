import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ghost");
        list.add("test");
        list.add("test2");
        list.add("test3");

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).length()>4) {
                System.out.println(list.get(i));
            }
        }
        // >
        System.out.println("Hello World");

    }
}
