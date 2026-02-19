import java.util.concurrent.CompletableFuture;

public class Parallel {
    public static void main(String[] args){
        CompletableFuture<Integer> c1=CompletableFuture.supplyAsync(()->{System.out.println(Thread.currentThread().getName());
        return 10;
        });
        CompletableFuture<Integer> c2=CompletableFuture.supplyAsync(()->20);
        c1.thenCombine(c2,(a,b)-> a +b).thenAccept(sum->System.out.println(sum+"by"+ Thread.currentThread().getName()));
        System.out.println("main thread doing another job"+Thread.currentThread().getName());
    }
}
