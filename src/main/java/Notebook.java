public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {

        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {

        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {

        if (this.weight <= 500) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 500 && this.weight <= 1500) {
            System.out.println("This notebook weighs something there");
        } else if (this.weight > 1500) {
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkAllData() {

        if (this.year < 2010 && this.weight > 1500 && this.price < 600) {
            System.out.println("Maybe is old and heavy but is cheap! ");
        } else if (this.year > 2020 && this.weight < 600 && this.price > 1000) {
            System.out.println("New, light and shiny but cost much ");
        } else if (this.year < 2019 && this.year > 2011 && this.weight > 500 && this.weight < 1800 && this.price > 500 && this.price < 1600  ) {
            System.out.println("Good choice, not new but sensible price and weight is reasonable ");

        }
        else {
            System.out.println("We got something interesting here");
        }
    }
}