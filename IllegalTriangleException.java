public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        System.out.println("There is one exception");
    }

    public IllegalTriangleException(String ex) {
        System.out.println(ex);
    }

}
