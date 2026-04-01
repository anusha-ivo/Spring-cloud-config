import java.util.concurrent.CompletableFuture;

public class Exceptions1 {
    public static void main(String[] args){
        CompletableFuture<Integer>c=CompletableFuture.supplyAsync(()->{
            if(true) throw new RuntimeException("error accured" +Thread.currentThread().getName());
            return 0;

        });
        c.exceptionally(e->{
            System.out.println(e.getMessage() +Thread.currentThread().getName());
            return 0;

        }).thenAccept(re->System.out.println(re));
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println("by main thread"+Thread.currentThread().getName());
    }
}
