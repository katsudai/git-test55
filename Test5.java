public class Test5{
    
    public static void main (String[] args){
        
        //問題０８
        
        //初期化
        int[] scoreArray = new int[3];
        
        scoreArray[0] = 79;
        scoreArray[1] = 85;
        scoreArray[2] = 60;
        
        //int[] scoreArray = {79, 85, 60};
        
        
        //繰り返し処理と出力
        for(int i =0; i < scoreArray.length; i ++){
            
          System.out.println(scoreArray[i] + "点");
        }
        
    }
}