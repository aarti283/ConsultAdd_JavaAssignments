// Java program to demonstrate the
// working of ArrayList
import java.util.*;

class CollectionClass {
	
	// Main Method
	public static void main(String[] args)
	{
        System.out.println("arraylist");
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 1; i <= 5; i++)
			al.add(i);

		System.out.println(al);

		al.remove(3);
		System.out.println(al);
		for (int i = 0; i < al.size(); i++)
			System.out.print(al.get(i) + " ");


        //linkedlist
        System.out.println("linkedlist");

            LinkedList<Integer> ll = new LinkedList<Integer>();
  
            for (int i = 1; i <= 5; i++)
                ll.add(i);
            System.out.println(ll);
            ll.remove(3);
            System.out.println(ll);
            for (int i = 0; i < ll.size(); i++)
                System.out.print(ll.get(i) + " ");



                //vector
                System.out.println("vector");

        Vector<Integer> v = new Vector<Integer>();
        for (int i = 1; i <= 5; i++)
            v.add(i);
        System.out.println(v);
        v.remove(3);
        System.out.println(v);
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");


            //hashset
            HashSet<String> hs = new HashSet<String>();
  
            hs.add("I");
            hs.add("am");
            hs.add("a");
            hs.add("coder");
            Iterator<String> itr = hs.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());}




                //hashmap
                HashMap<Integer, String> hm = new HashMap<Integer, String>();
  
                hm.put(1, "I ");
                hm.put(2, "am");
                hm.put(3, "a coder");
                System.out.println("Value for 1 is " + hm.get(1));
          
                for (Map.Entry<Integer, String> e : hm.entrySet())
                    System.out.println(e.getKey() + " " + e.getValue());

	}
}
