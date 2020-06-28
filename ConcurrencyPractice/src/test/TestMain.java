package test;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("This is from main method .");

        //new thread use class that extends from thread .
        Thread testThread1 = new TestThread () ;
        testThread1.start() ;

        //new thread use anonymous class
        new Thread(){
            @Override
            public void run() {
                System.out.println("this is from anonymous class .");
            }
        }.start() ;

        System.out.println("this is the end of main method .");
    }
}
