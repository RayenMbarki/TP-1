public class ElementExistException extends Exception{
    public ElementExistException(Object x) {
        System.out.println(x + " already doesn't exist in arraylist");
    }
}
