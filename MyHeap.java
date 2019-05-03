public class MyHeap{

  private static void pushDown(int[]data,int size,int index){
    // need while here
    int LChild = index * 2 + 1;
    int RChild = index * 2 + 2;
    int max = Math.max(Math.max(data[index], data[LChild]), data[RChild]);
    if (max != data[index]){
      if (max == data[LChild]){
        data[LChild] = data[index];
        data[index] = max;
        index = LChild;
      }
      if (max == data[RChild]){
        data[RChild] = data[index];
        data[index] = max;
        index = RChild;
      }
    }
    if (max == data[index]){
      break;
    }
  }
  private static void pushUp(int[]data,int index){
    boolean isDone = true;
    int Parent = data[index];
    if (data[index] > data[index - 1]){

    }
  }
  public static void heapify(int[]){
    for (int i = data.length - 1; i >= 0; i--){
      pushDown(data,data.length,i);
    }
  }
  public static void heapsort(int[]){
    heapify(data);
    for (int i = data.length - 1; i >= 0; i--){
      int temp = data[0];
      data[0] = data[i];
      data[i] = temp;
      size--;
      pushDown(data, size, 0);
    }
  }
}
