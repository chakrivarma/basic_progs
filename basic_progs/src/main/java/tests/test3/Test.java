package tests.test3;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.IOException;
public class Test {
	public static void main(String args[]) {
		int m=0,n=0;
		String msg="yes";
		System.out.println("please enter N and M");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int[] g1=new int[m];
		int[] g2=new int[m];
		HashSet<Integer> hs1=new HashSet<Integer>();
		HashSet<Integer> hs2=new HashSet<Integer>();
		for(int i=0;i<m;i++) {
			g1[i]=sc.nextInt();
			g2[i]=sc.nextInt();
			if(hs1.contains(g1[i]) || hs1.contains(g2[i])) {
				if(!hs2.contains(g1[i])) {
					hs1.add(g1[i]);
				}if(!hs1.contains(g2[i])) {
					hs2.add(g2[i]);
				}
			}
			else if(hs2.contains(g1[i]) || hs2.contains(g2[i])) {
				if(!hs1.contains(g1[i])) {
					hs2.add(g1[i]);
				}if(!hs2.contains(g2[i])) {
					hs1.add(g2[i]);
				}
			}else{
				hs1.add(g1[i]);
				hs2.add(g2[i]);
			}		
			if(g1[i]>n || g1[i]<0 || g2[i]>n || g2[i]<0) {
				msg="no";
			}			
		}
		System.out.println(hs1);
		System.out.println(hs2);
		if(msg.equals("yes")) {
			HashMap hm=new HashMap();
			Iterator<Integer> it1=hs1.iterator();
			int k=0;
			while(it1.hasNext()) {
				int x=it1.next();
				Iterator<Integer> it2=hs2.iterator();
				while(it2.hasNext()) {
					int y=it2.next();
					hm.put(k++,x+","+y);
				}
			}
			System.out.println(hm);
			Set set=hm.keySet();
			for(int i=0;i<m;i++) {
				int counter=0;
				Iterator it3=set.iterator();
				while(it3.hasNext()) {
					String[] x=hm.get(it3.next()).toString().split(",");
					int x1=Integer.parseInt(x[0]);
					int x2=Integer.parseInt(x[1]);
					if(x1==g1[i] && x2==g2[i]) {
						++counter;
					}
					if(x1==g2[i] && x2==g1[i]) {
						++counter;
					}
				}
				if(counter==0) {
					msg="no";
				}
			}
		}
		System.out.println(msg);		
	}
}
