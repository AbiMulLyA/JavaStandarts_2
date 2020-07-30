package refactory.java.assignment.model;

import java.util.List;

public class Model03 {
    private static Model03 model03;
    public static Model03 instance(){
        if (model03 == null) model03 = new Model03();
        return model03;
    }
    private static class CustomerModel {
        public int id;
        public String name;

        public CustomerModel(int id, String name) {
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return "{" + "\"id\":" + id + ", \"name\":\"" + name + '\"' + '}';
        }
    }

    private static class ItemModel {
        public int id, qty, price;
        public String name;

        public ItemModel(int id, String name, int qty, int price) {
            this.price = price;
            this.qty = qty;
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "{" + "\"id\":" + id + ", \"qty\":" + qty + ", \"price\":" + price + ", \"name\":\"" + name + "\"}";
        }
    }

    private static class PurchaseModel {
        public String orderId, createdAt;
        public CustomerModel customer;
        public List<ItemModel> items;

        PurchaseModel(String orderId, String createdAt, CustomerModel customer, List<ItemModel> items) {
            this.createdAt = createdAt;
            this.orderId = orderId;
            this.customer = customer;
            this.items = items;
        }

        @Override
        public String toString() {
            return "{" + "\"orderId\":\"" + orderId + '\"' + ", \"createdAt\":\"" + createdAt + '\"' + ", \"customer\":" + customer +
                    ", \"items\":" + items + '}';
        }
    }
}
