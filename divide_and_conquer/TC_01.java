package divide_and_conquer;

public class TC_01 {

    public static void printArr(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSrot(int arr[],int si, int ei){
        if (si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSrot(arr,si,mid);
        mergeSrot(arr,mid+1,ei);
        merge(arr,si,mid,ei);

    }
    public static void merge(int arr[],int si, int mid, int ei){
        int tem[]=new int[ei-si+1];
        int i =si;
        int j=mid+1;
        int k=0;
        while (i<=mid &&  j<=ei){
            if(arr[i]<arr[j]){
                tem[k]=arr[i];
                i++;
            }else{
                tem[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            tem[k++]=arr[i++];
        }
        while (j<=ei){
            tem[k++]=arr[j++];
        }
        for (k=0,i=si;k<tem.length;k++,i++){
            arr[i]=tem[k];

        }

    }
    public static void quickSort(int arr[],int si, int ei){
        if (si>=ei){
            return;
        }
        int pindx= partition(arr,si,ei);
        quickSort(arr, si, pindx-1);
        quickSort(arr, pindx-1,ei);

    }
    public static int partition(int arr[], int si, int ei){
        int pivot =arr[ei];
        int i=si-1;
        for (int j=si;j<ei;j++){
            if (arr[j]<=pivot){
                i++;
                int tem=arr[j];
                arr[j]=arr[i];
                arr[i]=tem;
            }
        }
        i++;
        int tem=pivot;
        arr[ei]=arr[i];
        arr[i]=tem;
        return i;
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        //mergeSrot(arr,0,arr.length-1);
        quickSort(arr,0,arr.length-1);
        printArr(arr);

    }



}
