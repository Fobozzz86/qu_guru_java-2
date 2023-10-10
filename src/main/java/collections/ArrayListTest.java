package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args){
        List<String> nameList = new ArrayList<>();
        nameList.add("Artem");
        nameList.add("Jura");
        nameList.add("Dima");
        nameList.add("Bogdan");
        nameList.add("Roman");
        nameList.add("Denis");

        nameList.remove(1);

        nameList.add(1, "Jorik");

        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).contains("Denis")) {
                System.out.println(nameList.get(0) + " " + "ну точно Артём");
                break;

            } else System.out.println(nameList);
                break;
        }
    }
}
