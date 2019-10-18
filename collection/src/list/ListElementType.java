package list;

import java.util.ArrayList;
import java.util.List;

public class ListElementType {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("package1");
        list.add(1);

        System.out.println(list.get(0) instanceof Object);
        System.out.println(list.get(1) instanceof Integer);
    }
}
