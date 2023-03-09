package org.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Clientt {
	
	public static void main(String[] args) {
		
		Bussinesss b = new Bussinesss();
		
		b.setPassword(987654);
		b.setAccno(9876543123L);
		b.setName("arnold");
		
		Bussinesss b1 = new Bussinesss();
		
		b1.setPassword(123456);
		b1.setAccno(12345678901L);
		b1.setName("tom curse");
		
		Bussinesss b2 = new Bussinesss();
		
		b2.setPassword(938475);
		b2.setAccno(6578439021L);
		b2.setName("jay cuttler");
		
//USER DEFINE LIST:
		
		List<Bussinesss> l = new ArrayList();
		
		l.add(b);
		l.add(b1);
		l.add(b2);
		
		System.out.println(".....forloop.....");
	
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i).getPassword());
			System.out.println(l.get(i).getAccno());
			System.out.println(l.get(i).getName());
		}
		System.out.println("......enhance for loop......");
		
		for(Bussinesss x:l) {
			System.out.println(x.getPassword());
			System.out.println(x.getAccno());
			System.out.println(x.getName());
			
		}
		
//USER DEFINE SET:
		
		Set<Bussinesss> s = new HashSet();
		
		s.add(b);
		s.add(b1);
		s.add(b2);
		
		System.out.println(".....enhance for.....");
		
		for(Bussinesss y:s) {
			System.out.println(y.getPassword());
			System.out.println(y.getAccno());
			System.out.println(y.getName());
		}	
		
//USER DEFINE MAP:---> map works based on keys and values so generics based on keys ans values
		
		Map<Integer,Bussinesss> m = new TreeMap();
		
		m.put(10, b);
		m.put(20, b1);
		m.put(30, b2);

// first we need  to combine the keys and values as a unit using  "EntrySet" method
	
		Set<Entry<Integer, Bussinesss>> entrySet = m.entrySet();
		
		System.out.println("......enhance for loop......");
		
		for(Entry<Integer,Bussinesss> z:entrySet) {
			System.out.println(z.getKey());
			System.out.println(z.getValue().getPassword());
			System.out.println(z.getValue().getAccno());
			System.out.println(z.getValue().getName());
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


