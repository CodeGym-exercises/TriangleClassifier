public class TriangleClassifier {
    public static String getTypeTriangle(int ca, int cb, int cc){
        boolean isTriangle = (ca+cb>cc)&&(ca+cc>cb)&&(cb+cc>ca) ? true : false;
        boolean isIsoscelesTriangle = ca == cb || cb == cc || ca == cc ? true : false;
        boolean isEquilateralTriangle = ca == cb && cb == cc ? true : false;
        if (isTriangle){
            if (isEquilateralTriangle){
                return "tam giac deu";
            }
            if (isIsoscelesTriangle){
                return "tam giac can";
            }
            return "tam giac thuong";
        }
        return "khong phai tam giac";
//        throw new UnsupportedOperationException();
    }
}
