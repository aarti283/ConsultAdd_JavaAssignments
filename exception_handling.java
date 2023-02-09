class TestExceptionPropagation1{  

  
    void m(){  
      int data=50/0;  
      System.out.println(data);
    }  
    void n(){  
      m();  
    }  
    void p(){  
     try{  
      n();  
     }catch(Exception e){System.out.println("exception handled");}  
    }  
    public static void main(String args[]){  
      System.out.println("exception Propogation Example");
     TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
     obj.p();  
     System.out.println("normal flow...");  
    }  
  }  