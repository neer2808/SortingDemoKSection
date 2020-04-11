public class MyMergeSort {

  int arr1[];

  public MyMergeSort(int size)
  {
    arr1 = new int[size];

  }
  public void mergesort(int arr[],int lb,int ub)
  {
    if(lb<ub) {
      int mid = (lb + ub) / 2;
      // left side array
      mergesort(arr, lb, mid);
      // right side array
      mergesort(arr, mid + 1, ub);
      merge(arr, lb, mid , ub);
    }
    }// end of the mergesort method
  public void merge(int arr[],int lb, int mid, int ub)
  {
    int i = lb;
    int j = mid+1;
    int k = lb;
    while(i<=mid && j<=ub )
    {
      if(arr[i]<= arr[j])
      {
        arr1[k]= arr[i];
        i++;

      }
      else
      {
        arr1[k] = arr[j];
        j++;
      }
      k++;
    } // end of while loop
    if(i>mid)
    {
      while(j<=ub)
      {
        arr1[k] = arr[j];
        j++;
        k++;
      }
    }
    else
    {
      while(i<=mid)
      {
        // here i mistakely mention arr instead of arr1
        arr1[k] = arr[i];
        i++;
        k++;

      }
    }// end of else block

    for(k=lb;k<= ub;k++)
    {
      arr[k]= arr1[k];

    }
  }

}


