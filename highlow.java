public high{
public static void main(String[] args){
int a[]={1,2,3,4,5,6,7,8};
int c=0,i=0,j=0,d=0;
for(i=0;i<a.length;i++){
for(j=i+1;j<a.length;j++){
if(a[i]>a[j]){
c++;
}
System.out.println(a[i]);
if(a[i]<a[j]){
d++;}
System.out.println(a[i]);
}}
