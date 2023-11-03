package number_theory;

public class reverseDigit {
    int n=123;
    int a,v=0;
    while(n>0){
        a=n%10;
        v=v*10+a;
        n=n/10;
    }
    System.out.println(v);
}
