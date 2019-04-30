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

  }
  private static void pushUp(int[]data,int index)
  public static void heapify(int[])
  public static void heapsort(int[])
}
