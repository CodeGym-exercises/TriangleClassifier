import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

//    @Test
//    void getTypeTriangle() {
//    }
    @Test
    void testCase2and2and2(){
        int a = 2;
        int b = 2;
        int c = 2;
        String expect = "tam giac deu";
        String result = TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expect,result);
    }

    @Test
    void testCase2and2and3(){
        int a = 2;
        int b = 2;
        int c = 3;
        String expect = "tam giac can";
        String result = TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expect,result);
    }

    @Test
    void testCase3and4and5(){
        int a = 3;
        int b = 4;
        int c = 5;
        String expect = "tam giac thuong";
        String result = TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void testCase8and2and3(){
        int a = 8;
        int b = 2;
        int c = 3;
        String expect = "khong phai tam giac";
        String result = TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void testCaseNative1and2and1(){
        int a = -1;
        int b = 2;
        int c = 1;
        String expect = "khong phai tam giac";
        String result = TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void testCase0and1and1(){
        int a = 0;
        int b = 1;
        int c = 1;
        String expect = "khong phai tam giac";
        String result = TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expect,result);
    }
}