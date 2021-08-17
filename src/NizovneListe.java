import java.util.ArrayList;

public class NizovneListe {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(1,7);
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove(1);
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Нулти елемент: " + arrayList.get(1));
        int zbir = 0;
        for (Integer el : arrayList) {
            zbir += el;
        }
        System.out.println(zbir);

        // int[] x = new int[]{2,5,1,4,7};
        // // forEach
        // int n = 5;
        // int sum = 0;
        // for(int el : x){
        //     sum += el;
        // }
        // System.out.println(sum);
    }
}
