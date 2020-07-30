package refactory.java.assignment.model;

public class Model05 {
    private static Model05 model;
    public static Model05 instance(){
        if (model == null) model = new Model05();
        return model;
    }
    public static class CsvModel{
        String name, category, price;

        public CsvModel(String name, String category, String price){
            this.name = name;
            this.category = category;
            this.price = price;
        }
        public String convertString() {
            return "{"+
                    "\"name\":\"" + name + '\"' +
                    ",\"category\":\"" + category + '\"' +
                    ",\"price\":" + price +
                    '}';
        }

    }

}
