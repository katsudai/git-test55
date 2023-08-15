public class Test3{
    
    public static void main (String[] args){
        
        //問題０６
        int number = 100;
        
        boolean result = false;
        if (number % 2 == 0) {
           result = true;
        }
        else{
           result = false;
        }
        
        String answer = number + "です";
        System.out.println(answer);
        
        if (result = true){
            System.out.println("偶数です");
        }
        else{
            System.out.println("奇数です");
        }
    }
}