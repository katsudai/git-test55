public class Test2{
    
    public static void main (String[] args){
        
        //問題０５
        String name = "ヤマダタロウ";
        int age = 20;
        double height = 160.0;
        double weight = 55.5;
        boolean healthy = true;
        
        String introduction = "私の名前は" + name + "です。" + age + "才です。";
        String detail = "身長" + height + "cmです。体重" + weight + "kgです。健康であるかというのは" + healthy + "です";
        
        System.out.println(introduction + detail);

    }
}