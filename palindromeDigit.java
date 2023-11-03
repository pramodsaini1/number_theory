package number_theory;

public class palindromeDigit {
    int n=121;
    int a,v=0;
    int t=n;
    while(n>0){
        a=n%10;
        v=v*10+a;
        n=n/10;
    }
    if(t==v){
        System.out.println("given digit is palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }
}
