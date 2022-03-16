import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> trees = new ArrayList<String>();
        trees.add("pine");
        trees.add("maple");
        trees.add("frasier fir");
        System.out.println(trees);
        System.out.println(trees.size());
        System.out.println(trees.get(1));
//        System.out.println(trees.get(3));

        ArrayList<String> names = new ArrayList<String>();
        names.add("Benji");
        names.add("Andy");
        String[] moreNames = {"Crystal", "Monica", "Toby"};
        int lengths = names.size() + moreNames.length + names.get(0).length() + moreNames[1].length(); // complete me as described below
        System.out.println(lengths);
    }
}
