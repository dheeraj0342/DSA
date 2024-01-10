package GLA.Interface;

interface marks{
    int getMarks(int a);
}

public class Test implements marks{
    @Override
    public int getMarks(int a) {
        return a;
    }


}
