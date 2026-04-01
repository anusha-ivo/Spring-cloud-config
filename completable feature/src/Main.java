import java.util.concurrent.CompletableFuture;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CompletableFuture<String> c=CompletableFuture.supplyAsync(()->"hi hello");
        System.out.println("main thread doing another activity");
        c.thenAccept(result-> System.out.println(result));
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }


    }
}