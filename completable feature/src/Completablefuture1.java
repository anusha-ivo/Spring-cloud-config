import java.util.concurrent.CompletableFuture;

public class Completablefuture1 {
    public static void main(String[] args){
       CompletableFuture<String> c= CompletableFuture.supplyAsync(()->" this is first completable future");
       System.out.println("this is job by main thread");
       c.thenAccept(result->System.out.println(result));
       try{
           Thread.sleep(3000);
       } catch (InterruptedException e) {

       }


    }
}
