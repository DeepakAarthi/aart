package guvi;

public class firstrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={2,3,4,5,2,6};
for(int i=0;i<a.length;i++){
	for(int j=i+1;j<a.length;j++){
		if(a[i]==a[j]){
			System.out.println(a[i]);
		}}
}
	}

}
