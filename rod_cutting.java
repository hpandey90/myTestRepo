class RodCut{
	public static void main(String args[]){
		Integer[] price = {0,1,5,9,2,17,20,24,30};
		Integer n = 4;
		Integer[] r = {0,0,0,0,0};		
		bottomUpCutRod(price,n,r);
		System.out.println(r[n]);
	}
	static int bottomUpCutRod(Integer[] p, Integer n, Integer[] r){
		int i=0,j=0,q=-1,max=0;
		r[0]=0;
		for(j=1;j<=n;j++){
			q=-1;
			for(i=1;i<=j;i++){
				max = ( q < (p[i]+r[j-i]) ) ? q=(p[i]+r[j-i]) : q;
			}
			r[j]=q;
		}
		return r[n];
	}
}