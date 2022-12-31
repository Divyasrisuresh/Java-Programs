class RemoveDuplicateElement
{
	public static void main(String[] args) {
		int a[] = {1,2,3,4,4};
		for(int i=0;i<a.length;i++){
		    if(a[i] == a[i+1]){
		        for(int j=i;j<a.length-1;j++){
		            a[j] = a[j+1];
		        }
		        break;
		    }
		}
		for(int i=0;i<a.length-1;i++){
		    System.out.println(a[i]);
		}
	}
}