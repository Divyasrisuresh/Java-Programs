public class InsertAnElement
{
	public static void main(String[] args) {
		int a[] = {1,2,3,4,4};
		int n = 4;
		for(int i=0;i<a.length;i++){
		    if(a[i] == n){
		        for(int j=i;j<a.length-1;j++){
		            a[j] = 6;
		        }
		        
		    }
		}
		for(int i=0;i<a.length;i++){
		    System.out.println(a[i]);
		}
	}
}