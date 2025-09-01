class P{
   P(int x){
      System.out.println("tui dhemna");
   }
   // P(){
   //    System.out.println(this.hashCode()+"ja lskdf");
   // }
}


class C extends P{
   C(){
      super(5);
      System.out.println(this.hashCode()+"rt");
   }
}

class T extends C{
   T(){
      System.out.println(this.hashCode()+"d");
   }
}

class Practice{
     public static void main(String[] args){
        // Object o = new Object();
        // String s = new String("dhemnu");
        // Integer i = new Integer(5);
        T c = new T();
        System.out.println(c.hashCode());
      //   System.out.print(s != o);
     }
}