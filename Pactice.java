// class Pactice{
//     static  class Test{
//         // public  void say(){
//         //     System.out.print("Hey i am static");
//         // }
//          static int x;
//     }      
//     public static void main (String[] args){
//         // Test t = new Test();
//         // // Pactice.Test.say();
//         // t.say();
//         System.out.print("df");
//     }
class P{
    private void m(){
        System.out.println("p");
    }
}

class C extends P{
    private void m(){
        System.out.println("c");
    }
    
    public static void main(String[] args){
        C c1 = new C();
        c1.m();
        
    }
}
 
    
// }


 