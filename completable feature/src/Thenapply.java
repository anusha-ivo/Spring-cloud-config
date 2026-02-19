import java.util.concurrent.CompletableFuture;

public class Thenapply {
    public static void main(String[] args){
        CompletableFuture c=CompletableFuture.supplyAsync(()->"this is demonstration");
        System.out.println("main thead doing another job");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        c.thenApply(result->result +  "  with then apply")
        .thenAccept(result ->System.out.println(result));

    }
}
