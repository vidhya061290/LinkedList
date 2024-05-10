package linkedlist;



public class LinkedlistMain {
	public static void main(String[] args) {
		LinkedList<Integer> linklist = new LinkedList<>();
		linklist.prepend(2);
		linklist.prepend(3);
		linklist.prepend(6);
		linklist.append(7);
		System.out.println(linklist);
		
		
		Profile user1 = new Profile("xxx" , 35);
		Profile user2 = new Profile("yyy" , 40);
		Profile user3 = new Profile("zzz" , 7);
		LinkedList<Profile> list = new LinkedList<>();
		list.append(user1);
		list.prepend(user2);
		list.append(user3);
		
		
		
	}

}
