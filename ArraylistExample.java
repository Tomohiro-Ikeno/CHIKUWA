import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class ArrayListExample {
  public static void main(String[] arguments){

    // Integerのインスタンス(リスト型)を用意
    long start1 = System.currentTimeMillis();
    ArrayList<Integer> list = new ArrayList<Integer>();
    System.out.printf("要素をListに追加する%n");
    list.add(1000); //list.get(0);
    list.add(2000); //list.get(1);
    list.add(3000); //list.get(2);
    list.add(4000); //list.get(3);
    list.add(5000); //list.get(4);
    list.add(6000); //list.get(5);
    list.add(7000); //list.get(6);
    for(Integer i = 0; i < list.size() ; i++){
      System.out.println(list.get(i));
    }

    System.out.printf("要素1を取り除く%n");
    list.remove(1);

    for(Integer i = 0; i < list.size() ; i++){
      System.out.println(list.get(i));
    }


    System.out.printf("ArrayList合計処理時間%n");
    System.out.println(list.get(2));
    long end1 = System.currentTimeMillis();
    System.out.println((end1 - start1)  + "ms");

    System.out.printf("---ArrayList---%n%n");
    System.out.printf("---LinkedList---%n");

    long start2 = System.currentTimeMillis();
    LinkedList<Integer> list2 = new LinkedList<Integer>();
    System.out.printf("要素をListに追加する%n");
    list2.add(1000); //list.get(0);
    list2.add(2000); //list.get(1);
    list2.add(3000); //list.get(2);
    list2.add(4000); //list.get(3);
    list2.add(5000); //list.get(4);
    list2.add(6000); //list.get(5);
    list2.add(7000); //list.get(6);
    for(Integer i = 0; i < list2.size() ; i++){
      System.out.println(list2.get(i));
    }

    System.out.printf("要素1を取り除く%n");
    list2.remove(1);

    for(Integer i = 0; i < list2.size() ; i++){
      System.out.println(list2.get(i));
    }

    System.out.printf("LinkedList合計処理時間%n");
    System.out.println(list2.get(2));
    long end2 = System.currentTimeMillis();
    System.out.println((end2 - start2)  + "ms");


    System.out.printf("---LinkedList---%n");


  /*  List<Object> anArrayOfObjects = new ArrayList<Object>();
		anArrayOfObjects.add('a');
		anArrayOfObjects.add('d');
    System.out.println(anArrayOfObjects.get(0)+ ":" +anArrayOfObjects.get(1));*/
  }
}
