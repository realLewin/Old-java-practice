package anonymousclass;

public class TestAnonymous {
    public static void main(String[] args) {
    //------------------------------------------------------------------------------------------------------------------
        //don't use anonymous class :
        class TestAge implements Age{
            @Override
            public void getAge() {
                System.out.println("no anonymous : your age is " + age);
            }
        }
        TestAge testAge = new TestAge() ;
        testAge.getAge() ;

        //use anonymous class :

        //Compare to above , TestAge is hidden inner class of Age interface
        // whose name is not written but an object to it is created
        Age myAge = new Age() {
            @Override
            public void getAge() {
                System.out.println("anonymous : your age is " + age);
            }
        } ;
        myAge.getAge() ;

        //--------------------------------------------------------------------------------------------------------------
        //based on declaration and behavior , there are three types of anonymous inner class :
        //1 . anonymous inner class that extends from a class :
        Thread testThread = new Thread(){
            @Override
            public void run(){
                System.out.println("message from three types of first .");
            }
        } ;
        testThread.start() ;

        //2 . anonymous inner class that implements a interface :
        //Runnable is a interface ;
        Runnable testRunnable = new Runnable(){
            @Override
            public void run (){
                System.out.println("message from three types of second .");
            }
        } ;
        Thread runnableThread = new Thread(testRunnable) ;
        runnableThread.start() ;

        //anonymous inner class that defines inside method/constructor argument :
        //this is often used in Graphic user interface(GUI) application ;
        Thread typeThreeThread = new Thread(new Runnable(){
            @Override
            public void run (){
                System.out.println("message from three types of third .");
            }
        }) ;
        typeThreeThread.start() ;

    }
/*Difference between Normal/Regular class and Anonymous Inner class:
    1 . A normal class can implement any number of interfaces but anonymous inner class can implement only one interface
        at a time.
    2 . A regular class can extend a class and implement any number of interface simultaneously. But anonymous Inner
        class can extend a class or can implement an interface but not both at a time.
    3 . For regular/normal class, we can write any number of constructors but we cant write any constructor for
        anonymous Inner class because anonymous class does not have any name and while defining constructor class name
        and constructor name must be same.
 */

/*Like local classes, anonymous classes can capture variables; they have the same access to local variables of the
  enclosing scope:
    1 . An anonymous class has access to the members of its enclosing class.
    2 . An anonymous class cannot access local variables in its enclosing scope that are not declared as final or
        effectively final.
    3 . Like a nested class, a declaration of a type (such as a variable) in an anonymous class shadows any other
        declarations in the enclosing scope that have the same name.
 */
/*Note that you can declare the following in anonymous classes:
    1 . Fields
    2 . Extra methods (even if they do not implement any methods of the supertype)
    3 . Instance initializer
    4 . Local classes
 */
}
