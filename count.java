package number_theory;

public class count {
    public static void main(String []arr){
        int n=9765;
        int even=0,odd=0;
        while(n>0){
            int a=n%10;
            if(a%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even digit is:"+even+" ---odd digit is---->"+odd);
    }
}
