public class MetodoOrdenamiento{

	public int[] MergeSort(int a[], int prim, int ult){
		int cent;

		if(prim<ult){
			cent=(prim+ult)/2;
			MergeSort(a,prim,ult);
			MergeSort(a,cent+1,ult)
		}
	}

}