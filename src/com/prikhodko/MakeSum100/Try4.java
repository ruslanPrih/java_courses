package com.prikhodko.MakeSum100;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.ArrayList;
import java.util.ListIterator;

public class Try4 {
    public static void main(String[] args) throws Exception {

        char[][] ops = new char[Integer.parseInt("44444444",5)][8];

        // Array of possible options
        StringBuilder sb;
        int l;
        for (int i = 0; i < Integer.parseInt("44444444",5); i++) {
            sb = new StringBuilder(Integer.toString(i+1,5));
            l = sb.toString().length();
            for (int k = 0; k < 8 - l; k++) {
                sb.insert(0,'0');
            }
            // System.out.println("sb = " + sb);
            ops[i] = sb.toString().toCharArray();
        }

        // This list will contain options that evaluate to 100
        ArrayList<Integer> results = new ArrayList<Integer>();

        // engine to evaluate expressions
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        Integer lookingFor = new Integer(100);

        // Processing...
        for (int i = 0; i < Integer.parseInt("44444444",5); i++) {
            StringBuilder expression = new StringBuilder("1");
            for (int k = 1; k < 10; k++) {
                int next = k + 1;
                if (k < 9) {
                    switch(ops[i][k-1]) {
                        case '0': expression.append(next); break;
                        case '1': expression.append("+" + next); break;
                        case '2': expression.append("-" + next); break;
                        case '3': expression.append("*" + next); break;
                        case '4': expression.append("/" + next); break;
                    }
                }
            }
            try {
                Double val = (Double)engine.eval(expression.toString());
                if (val.equals(lookingFor.doubleValue())) {
                    results.add(i);
                }
            }catch (ClassCastException e){}
            //Double val = (Double)engine.eval(expression.toString());



        }

        System.out.println(results.size() + " were found:");

        ListIterator<Integer> iter = results.listIterator();
        while (iter.hasNext()) {
            System.out.println(printMe(ops[iter.next()]) + " = 100");
        }

    }

    static String printMe(char[] x) {
        StringBuilder path = new StringBuilder("");
        for (int i = 1; i < 10; i++) {
            path.append(i);
            if (i < 9) {
                switch(x[i-1]) {
                    case '0': break;
                    case '1': path.append("+"); break;
                    case '2': path.append("-"); break;
                    case '3': path.append("*"); break;
                    case '4': path.append("/"); break;
                }
            }
        }
        return path.toString();
    }

}
