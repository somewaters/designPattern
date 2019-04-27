package strategy;

public class client {
    public static void main(String[] args){
        Context context = new Context(new StrategyA());
        context.method();
    }
}
