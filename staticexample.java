public class staticexample{
    static int count = 0;
    staticexample(){
        count++;
    }
    void show() {
        System.out.print(count);
    }

    public static void main(String[] args){
        staticexample st = new staticexample();
        st.show();


    }
}
