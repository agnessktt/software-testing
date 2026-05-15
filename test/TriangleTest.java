import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    // TC1 - Invalid (a <= 0)
    @Test
    public void testInvalidTriangle() {
        assertEquals("Invalid", Triangle.classify(0, 2, 3));
    }

    // TC2 - Invalid (b <= 0)
    @Test
    public void testInvalidB() {
        assertEquals("Invalid", Triangle.classify(2, 0, 3));
    }

    // TC3 - Invalid (c <= 0)
    @Test
    public void testInvalidC() {
        assertEquals("Invalid", Triangle.classify(2, 3, 0));
    }

    // TC4 - Not a triangle (a + b <= c)
    @Test
    public void testNotTriangle() {
        assertEquals("Not a triangle", Triangle.classify(1, 2, 3));
    }

    // TC5 - Not a triangle (a + c <= b)
    @Test
    public void testTriangleCondition2() {
        assertEquals("Not a triangle", Triangle.classify(1, 5, 1));
    }

    // TC6 - Not a triangle (b + c <= a)
    @Test
    public void testTriangleCondition3() {
        assertEquals("Not a triangle", Triangle.classify(5, 1, 1));
    }

    // TC7 - Additional not triangle case
    @Test
    public void testAnotherNotTriangle() {
        assertEquals("Not a triangle", Triangle.classify(2, 1, 3));
    }

    // TC8 - Equilateral triangle
    @Test
    public void testEquilateral() {
        assertEquals("Equilateral", Triangle.classify(3, 3, 3));
    }

    // TC9 - Isosceles triangle (a == b)
    @Test
    public void testIsosceles() {
        assertEquals("Isosceles", Triangle.classify(3, 3, 4));
    }

    // TC10 - Isosceles triangle (b == c)
    @Test
    public void testIsosceles2() {
        assertEquals("Isosceles", Triangle.classify(4, 5, 5));
    }

    // TC11 - Isosceles triangle (a == c)
    @Test
    public void testIsosceles3() {
        assertEquals("Isosceles", Triangle.classify(5, 4, 5));
    }

    // TC12 - Scalene triangle
    @Test
    public void testScalene() {
        assertEquals("Scalene", Triangle.classify(3, 4, 5));
    }
}