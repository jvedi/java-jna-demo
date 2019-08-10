public class Test {

    public static void main(String[] args){
        System.out.println("test");
        int result = TestLibrary.LIBRARY.testdll(1,2);
        System.out.println(result);
        //String re = System.getProperty("java.library.path");
        //String[] arr  = re.split(";");
        //for(int i = 0; i < arr.length; i++){
        //    System.out.println(arr[i]);
        //}
    }

}
