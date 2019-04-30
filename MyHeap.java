public class MyHeap{

  private static void pushDown(int[]data,int size,int index){
    // need while here
    int LChild = index * 2 + 1;
    int RChild = index * 2 + 2;
    int max = Math.max(Math.max(data[index], data[LChild]), data[RChild]);

  }
  private static void pushUp(int[]data,int index)
  public static void heapify(int[])
  public static void heapsort(int[])
}
