package simpleFactory;

public class client {
    public static void main(String[] args){
        AbstractProduct product = ProductFactory.createProduct("A");
        product.method();
    }
}
