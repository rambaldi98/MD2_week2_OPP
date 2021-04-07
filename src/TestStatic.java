class Test{
    static void display3() {
        System.out.println("hello");
    }
}
public class TestStatic {
//     khoi tao lop Test2 ben trong lop TestStatic
    static class Test2 {
        public void display(){
            System.out.println("hello");
        }
    }
    int a = 2;
    // khoi tao phuong thuc display2() trong lop TestStatic
    public void display2(){
        System.out.println("codegym");
    }

    public static void main(String[] args) {
        TestStatic.Test2 oop = new TestStatic.Test2();

        oop.display(); // goi phuong thuc display
//        oop.display2(); // error khong the truy cap phuong thuc


    }



}

