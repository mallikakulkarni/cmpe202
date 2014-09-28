package PackageB;


/**
 * Write a description of class B1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B1
{
    // instance variables - replace the example below with your own
    package PackageB;
    import PackageA.A1;
    
    public class B1 extends A1 {

    A1 a1 ;
    public B1()
    {
        a1 = new A1() ;
    }
    
    public void accessProtectedA1() {
        System.out.println( this.protectedA1 ) ;
    }
     
}

}
