
import java.lang.reflect.Array;
import java.util.*;

public class FormMaxNumber {

    public  static Comparator<String> lexicalComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            String XY = o1 + o2;
            String YX = o2 + o1;
            try {
                return XY.compareTo(YX) > 0 ? -1 : 1;
            } catch (Exception exception) {
                System.out.println();
            }
            return  -1;
        }
    };

    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int len = Integer.parseInt(scan.nextLine());
        String [] inputArrayList = new String[len];
        inputArrayList = scan.nextLine().split(" ");
        List<String> listFromArray= Arrays.asList(inputArrayList);
        listFromArray.sort(lexicalComparator);
        StringBuffer output = new StringBuffer();
        for (String value : listFromArray){
            output.append(value);
        }
        System.out.print(output.toString());
    }


}
