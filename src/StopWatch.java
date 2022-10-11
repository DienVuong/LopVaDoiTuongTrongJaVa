

public class StopWatch {
     private long startTime;
     private long endTime;
     public void start(){
          startTime = System.currentTimeMillis();
     }
     public void stop(){
          endTime = System.currentTimeMillis();
     }
     public long getElapsedTime(){
          return (endTime - startTime);
     }
     public void sort(){
          int[] ints = new int[1000];
          for(int i = 0; i < ints.length; i++){
               ints[i] = (int)(Math.random() * 1000);
          }
          for(int i= 0; i < ints.length; i++){
               for(int j = 0; j < ints.length; j++){
                    if(ints[i] < ints[j]){
                         int temp = ints[i];
                         ints[i] = ints[j];
                         ints[j] =temp;
                    }
               }
          }
          for(int i : ints) {
               System.out.print(i + ", ");
          }
          System.out.println();
     }

     public static void main(String[] args) {
          StopWatch stopWatch = new StopWatch();
          stopWatch.start();
          stopWatch.sort();
          stopWatch.stop();
          System.out.println("thoi gian chay cua phuong thuc sort la :" + stopWatch.getElapsedTime());
     }
}
