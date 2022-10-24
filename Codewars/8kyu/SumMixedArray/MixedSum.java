/* CodeWars 8kyu. Sum Mixed Array

Given an array of integers as strings and numbers, 
return the sum of the array values as if all were numbers.
Return your answer as a number.
*/

import java.util.List;

public class MixedSum {
    public int sum(List<?> mixed) {
        int sum = 0;

        for (Object element : mixed) {
            if (element instanceof Integer) {
                sum += (Integer) element;
            } else if (element instanceof String) {
                sum += Integer.parseInt( (String) element );
            }
        }
        return sum;
    }

    // Objects
    public int sumObjects(List<?> mixed) {
        int s = 0;

        for (Object e : mixed) {
            s += Integer.parseInt(e.toString());
        }
        return s;
    }
    
    // Stream() 
    public int sumStrem(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }

    // ValueOf()
    public int sumValues(List<?> mixed) { 
        int sum = 0;
        for (Object o : mixed) sum += Integer.valueOf("" + o);
        return sum;
      }
}