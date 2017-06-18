class C {
public void test(){
System.out.println("class c");
}
}

class B extends C{

public void test(){
super.test();    // //use of super keyword to call parent class A


System.out.println("class b");
}
}

class A extends B{
public void test(){
super.test();   //use of super keyword to call parent class B

System.out.println("class a");
}


public static void main(String args[]){

A obj = new A();
obj.test();
}
}


// option b --super.test()
//Therefore by calling super.test() we can invoke test() method defined in C from a method in A