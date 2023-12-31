import java.util.ArrayList;
public class CustomArrayList {
    private ArrayList <Integer> A;
    private int initial_capacity;
    public CustomArrayList() {
        A=new ArrayList<>(10);
        initial_capacity=10;
    }
    public CustomArrayList(int initialSize) {
        A=new ArrayList <> (initialSize);
        initial_capacity=initialSize;
    }
    public int get_capacity() {
        return initial_capacity;
    }
    public void add(Integer obj)  {
        A.add(obj);
    }
    public void add(int index , Integer x){
        A.add(index,x);
    }
    public Integer get(int index) {
        return A.get(index);
    }

    public int size() {
        return A.size();
    }
    public void affiche_list() {
        for (int i=0;i<A.size();i++) {
            System.out.println(A.get(i));
        }
    }
    public boolean isin(Integer x) {
        return (A.contains(x));
    }
    public boolean isEmpty() {
        return A.isEmpty();
    }

    public int find(Integer x) {
        return A.indexOf(x);
    }

    public void remove(Integer x) throws ElementExistException{
        if (isin(x)==false) throw new ElementExistException(x);
        else A.remove(x);
    }
}
