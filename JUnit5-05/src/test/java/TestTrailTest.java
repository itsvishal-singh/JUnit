import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestTrailTest {
    TestTrail testTrail = new TestTrail();
    TestTrailTest(){
        System.out.println("Test Obj is created before test method");
    }
    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All Tests");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("After All Tests");
    }
    @BeforeEach
    void init(){
        System.out.println("Before Test");
    }
    @AfterEach
    void destroy(){
        System.out.println("After Test Clean Up");
    }

    @Test
    void test() {
        assertEquals(6, 6, "Demo");
    }

    @Test
    void testComputeSquareArea() {
        // message evaluate everytime whenever test run.
        assertEquals(576, testTrail.computeSquareArea(24), "Incorrect");
    }

    @Test
    void testComputeCircleArea_Supplier() {
        // Supplier Functional Interface
        // Execute message if the test case is fail
        assertEquals(78.5, testTrail.computeCircleArea(5), () -> "Area of circle Calculation is failed");
    }

    @Test
    void testMoreAssertMethods() {
        // message evaluate everytime whenever test run.
//        assertEquals(576, testTrail.computeSquareArea(24), "Incorrect");
        // pass test case if expectation not matched.
//        assertNotEquals(576, testTrail.computeSquareArea(24), "Incorrect");
        //
        String str = "JUnit";
        assertTrue(str.equals("JUnit"));
        assertFalse(str.length()<3);
    }
    @Test
    void testArrays(){
        int[] expected = {2,3,4,5};
        int[] actual = {4,3,5,2};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual); // pass : check data in the variable
//        assertEquals(expected, actual); // failed : check only reference variable not the data containing.
    }
    @Test
    void testSortingArray_Exception(){
        try {
            int[] unsorted = {2, 4, 3, 7, 1};
//            int[] unsorted = null;
            int[] sortedArray = testTrail.sortingArray(unsorted);
            for (int elem : sortedArray) {
                System.out.print(elem + " ");
            }
            System.out.println();
            System.out.println("Statements Below Exception");
//            fail();
        } catch (NullPointerException e) {
            System.out.println("Exception Generated");
        }


    }
    @Test
    void testSortingArray_Exceptions(){
        int[] unsorted = null;
        assertThrows(NullPointerException.class, ()-> testTrail.sortingArray(unsorted));

    }

    @Test
    void testSortingMethod_Performance(){
        int[] unsorted = {5,4,6};
        assertTimeout(Duration.ofMillis(100), ()-> testTrail.sortingArr(unsorted));
    }


}