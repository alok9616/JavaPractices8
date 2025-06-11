import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class StreamDemo{
    public static void main(String[] args) {
       ArrayList<Integer> l = new ArrayList<>();
       l.add(10);
       l.add(15);
       l.add(30);
       l.add(20);
       l.add(40);
       System.out.println(l);

       List<Integer> l2 =l.stream().filter(i ->i%2==0).collect(Collectors.toList());
       System.out.println(l2);
       
       List<Integer> l3 =l.stream().sorted().collect(Collectors.toList());
       System.out.println(l3);
        
        List<Integer> l4=l.stream().sorted((i1,i2) ->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
        System.out.println(l4);

        List<Integer> l5=l.stream().sorted((i1,i2) ->i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(l5);

        List<Integer> i6=l.stream().sorted((i1,i2) ->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(i6);

        List<Integer> l7 = l.stream().sorted(Comparator.reverseOrder()) .collect(Collectors.toList());
         System.out.println(l4);


    }
}