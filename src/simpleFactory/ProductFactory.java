package simpleFactory;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private static Map<String, AbstractProduct> productMap;

    static {
        productMap = new HashMap<String, AbstractProduct>();
        productMap.put("A",new ProductA());
        productMap.put("B",new ProductA());
        productMap.put("C",new ProductA());
    }


    public Map<String, AbstractProduct> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<String, AbstractProduct> productMap) {
        this.productMap = productMap;
    }


    public  static AbstractProduct createProduct(String param){
        return productMap.get(param);
    }


}
