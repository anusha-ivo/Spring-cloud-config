import java.util.concurrent.CompletableFuture;

public class Exceptions2 {
    public static void main(String[] args){
        CompletableFuture<Integer> c=CompletableFuture.supplyAsync(()->{
            int c1= 2/10;
            throw new RuntimeException("not by zero");


        });
        c.exceptionally(e->{
            System.out.println(e.getMessage());
            return 0;
        }).thenAccept(re->System.out.println(re));

    }
}
