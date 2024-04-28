interface A
{
    int show(int i,int j);
}
public class Dem{
    public static void main(String[] args) {
        A obj =(i,j)->i+j;
        int res=obj.show(5,8);
        System.out.println("sum is: "+res);
    }
}
