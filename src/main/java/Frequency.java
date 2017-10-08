import java.net.Inet4Address;
import java.util.HashMap;

public class Frequency {
    //Rules

    private static HashMap<String,Integer> rules = new HashMap<String,Integer>(26);
    public static void init(){
        rules.put("1",0);
        rules.put("2",1);
        rules.put("3",2);
        rules.put("4",3);
        rules.put("5",4);
        rules.put("6",5);
        rules.put("7",6);
        rules.put("8",7);
        rules.put("9",8);
        rules.put("10#",9);
        rules.put("11#",10);
        rules.put("12#",11);
        rules.put("13#",12);
        rules.put("14#",13);
        rules.put("15#",14);
        rules.put("16#",15);
        rules.put("17#",16);
        rules.put("18#",17);
        rules.put("19#",18);
        rules.put("20#",19);
        rules.put("21#",20);
        rules.put("22#",21);
        rules.put("23#",22);
        rules.put("24#",23);
        rules.put("25#",24);
        rules.put("26#",25);
    }

    static String frequency(String s) {
        init();
        int [] outputArray = new int[26];
       StringBuffer output = new StringBuffer();
        doOperationOnString(new StringBuffer(s).reverse().toString(),outputArray);
        for (int index =0;index<26;index ++){
            output.append(outputArray[index]);
        }
        return  output.toString();

    }

    static void doOperationOnString(String s, int[] outputArray){
        StringBuilder buff = new StringBuilder();
        StringBuffer itemBetweenParentheis = new StringBuffer();
        String currentKey = null, lastKey =null;
        int index =0;
        while(index < s.length()){
            buff.append(s.charAt(index));
            lastKey = currentKey;
            currentKey = buff.reverse().toString();

            if(rules.containsKey(currentKey)){

                outputArray[rules.get(currentKey)] += itemBetweenParentheis.toString().equals("") ? 1 : Integer.valueOf(itemBetweenParentheis.reverse().toString()) ;
                buff.replace(0,currentKey.length(),"");
                itemBetweenParentheis.replace(0,itemBetweenParentheis.length(),"");

            } else if (currentKey.equals(")")){
                buff.replace(0,1,"");
                index ++;
                while (s.charAt(index) != '('){
                    itemBetweenParentheis.append(s.charAt(index));
                    index++;
                }

            }
            buff.reverse();
            index ++;
        }
    }


}
