
/**
 * Write a description of class A2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

package A;

public class A2 {
    A1 a1 ;
    public A2()
    {
        a1 = new A1() ;
    }
    
    public void accessPublicA1() {}
    public void accessProtectedA1() {
        System.out.println( a1.packageA1 ) ;
    }
    public void accessPackageA1(){}
    public void accessPrivateA1() {
         System.out.println( a1.privateA1 ) ;
    }
}