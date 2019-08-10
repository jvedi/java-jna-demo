import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.ptr.IntByReference;
import jdk.nashorn.internal.objects.*;

public interface TestLibrary extends Library {
        int testdll(int a,int b);
        TestLibrary LIBRARY = (TestLibrary)Native.loadLibrary("testdll",TestLibrary.class);
}


