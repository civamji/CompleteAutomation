import org.testng.annotations.*;

public class TestNGAnnoations {



    @Test
    public void Test1(){
        System.out.println("Test method");
    }
    @Test
    public void Test2()
    {
        System.out.println("Test method2");
    }
    @BeforeSuite
    public void Test3()
    {
        System.out.println("Before Suite");
    }
    @BeforeClass()
    public void Test4()
    {
        System.out.println("Before class");
    }
    @BeforeTest
    public void Test5()
    {
        System.out.println("Before Test");
    }
    @BeforeMethod
    public void Test6()
    {
        System.out.println("Before method");
    }
    @BeforeGroups
    public void Test7()
    {
        System.out.println("Before Group");
    }

//    @afterClass()
//    public void Test8()
//    {
//        System.out.println("after class");
//    }
//    @afterTest
//    public void Test9()
//    {
//        System.out.println("After Test");
//    }
//    @afterMethod
//    public void Test10()
//    {
//        System.out.println("After method");
//    }
//    @afterGroups
//    public void Test11()
//    {
//        System.out.println("after Group");
//    }
}
