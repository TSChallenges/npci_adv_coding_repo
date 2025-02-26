public class GenericClassDemo {

    public static void main(String[] args) {
        MathOperations mop = new MathOperations(3,5);
        mop.print();

        MathOperations mop2 = new MathOperations(3.5,5.2);
        mop2.print();


//        MathOperations mop3 = new MathOperations("x","y");
//        mop3.print();
//
//        Rectangle r = new Rectangle(1,2);
//        Rectangle r2 = new Rectangle(5,4);
//
//        MathOperations mop4 = new MathOperations(r,r2);
//        mop4.print();

//        System.out.println("Sum = " + mop.sum());
//        System.out.println("Product = " + mop.product());
//        System.out.println("Diff = " + mop.diff());

    }

}

class MathOperations<T extends Number>{
    T a;
    T b;

    public MathOperations(T a, T b){
        this.a = a;
        this.b = b;
    }

    public void print(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }


//    public T sum(){
//        return a + b;
//    }
//
//    public T diff(){
//        return a ;
//    }
//
//    public T product(){
//        return a ;
//    }


    // <T extends Number>
    // <T super Class>

}
