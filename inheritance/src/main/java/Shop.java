public class Shop {

    /*Instance Variables*/
    private String name;
    private String description;
    private String priceAverage;

    /*Getters*/
    public String getName() {return name;}
    public String getDescription() {return description;}
    public String getPriceAverage() {return priceAverage;}

    /*Constructors*/
    public Shop(){}

    public Shop(String name, String description, String priceAverage){
        this.name = name;
        this.description = description;
        this.priceAverage = priceAverage;
    }


}
