package ashik.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class StrongVertices {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    long a[]=new long[n];
		    Integer in[]=new Integer[n];
		    for(int i=0; i<n; i++){
		        a[i]=sc.nextLong();
		        in[i]=i;
		    }
		    for(int i=0; i<n; i++){
		        a[i]-=sc.nextLong();
		    }
		    Arrays.sort(in, (p,q)->Long.compare(a[q], a[p]));
		    int cnt=1;
		    for(int i=1; i<n; i++){
		        if(a[in[i]]==a[in[0]]) cnt++;
		        else break;
		    }
		    System.out.println(cnt);
		    for(int i=0; i<cnt; i++) System.out.print(in[i]+1+" ");
		    System.out.println();
		}
	}

}
