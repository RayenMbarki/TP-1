import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CustomArrayList L=new CustomArrayList();
        System.out.println("-----arraylist capacity is : " + L.get_capacity() );


            L.add(1);
            L.add(2);
            L.add(3);
            L.add(1);
            L.add(3);
            L.add(2);
            System.out.println("-----arraylist size is : " + L.size());
            System.out.println("-----arraylist elements are : ");
            if (L.isEmpty()==true) System.out.println("arraylist is empty ");
            else L.affiche_list();

            System.out.println("-------");

            Scanner s=new Scanner(System.in);
            System.out.println("enter an object to remove from array list ");
            Integer a=s.nextInt();
            try {
                L.remove(a);
            }
            catch (ElementExistException e) {}

            System.out.println("after removing element from arraylist");
            L.affiche_list();




    }
}