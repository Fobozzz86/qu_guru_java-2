package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetTest {

 /*   static CountryOfAfrica countryOfAfrica0 = new CountryOfAfrica("Alger", 32, "Desert");
    static CountryOfAfrica countryOfAfrica1 = new CountryOfAfrica("Niger", 32, "Tree");
    static CountryOfAfrica countryOfAfrica2 = new CountryOfAfrica("Somali", 15, "Perates");
    static CountryOfAfrica countryOfAfrica3 = new CountryOfAfrica("Marocco", 3, "Sea");
*/
    public static void main(String[] args) {

        Set<String> setCountries = new HashSet<>();

        setCountries.add("Niger");
        setCountries.add("Somali");
        setCountries.add("Marocco");
        setCountries.add("Alger");

        System.out.println(setCountries);

        Iterator<String> iterator = setCountries.iterator();

        while (iterator.hasNext())

            System.out.println(iterator.next());

        setCountries.add("Russia");
        setCountries.remove("Somali");

        System.out.println(setCountries);

    }

}
