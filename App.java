import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        //because List is of type String only strings can be added
        //but addStore still in inferring the type
        List<Bucket<String>> list = new ArrayList<>();
        App.addStore("Matthew", list);
        //type witness
        App.<String>addStore("MATTE", list);

        //using type inference to know that the array list is holding integers
        List<String> list1 = add(new ArrayList<>(), "20", "30");
        System.out.println(list1);


    
    }
    
    public static <T> void addStore(T t, List<Bucket<T>> list){
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString() + " has been added to the list");
    }

    public static <T> List<T> add(List<T> list, T item1, T item2){
        list.add(item1);
        list.add(item2);
        return list;
    }
    
}




