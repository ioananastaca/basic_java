package processing_files;

public class MyFileUtils {
    public int subtract10FromLargerNumber(int number) throws Exception {
        if (number < 10) {
            throw new FooRuntimeException("Returns negative number");
        }
        return number - 10;
    }
    public class FooRuntimeException extends Exception {
        public FooRuntimeException(String message){
            super(message);
        }
    }
}
