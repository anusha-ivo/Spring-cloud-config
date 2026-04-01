import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CombineAll {
    public static void main(String[] args){
        CompletableFuture<Integer> c=CompletableFuture.supplyAsync(()->10);
        CompletableFuture<Integer> ch=CompletableFuture.supplyAsync(()->10);
        CompletableFuture sum=CompletableFuture.allOf(c,ch);
        sum.thenRun(()->{
            int total= 0;
            try {
                total = c.get()+ch.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
            System.out.println(total);
        });



    }
}
