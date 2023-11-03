package number_theory;

public class digitsum {
    int n=123;
    int a;
    int v=0;
    while(n>0){
        a=n%10;
        v=v*10+a;
        n=n/10;
    }
    System.out.println(v);
}
