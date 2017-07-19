

public class nonrepeat {
public static void main(String[] args){
	int a[]={1,2,3,2,1};
	int x[]=new int[a.length];
	
	for(int i=0;i<a.length;i++){
		int b=a[i];
	x[b]++;
		}
	for( int j=0;j<x.length;j++)
if(x[j]==1){
	System.out.println(j);
}
}
}

