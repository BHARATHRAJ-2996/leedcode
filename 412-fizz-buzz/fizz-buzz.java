import java.util.*;
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list= new ArrayList<>();
        for(int i =1 ;i<=n;i++){
        if(i%15==0) list.add("FizzBuzz");
       else if(i%3==0) list.add("Fizz");
         else if(i%5==0) list.add("Buzz");
         else list.add(String.valueOf(i));
        }
        return list;
    }
}

/*class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            l.add(i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : "" + i);
        return l;
    }
}*/