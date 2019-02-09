package com.example.SeriesTest;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);
        for(String s: stockList.Items().keySet()){
            System.out.println(s);
        }

        Basket timsBask = new Basket("Tim");
        sellItem(timsBask, "car", 1);
        System.out.println(timsBask);

        if(sellItem(timsBask,"car",1) !=1){
            System.out.println("there are no more cars in stock");
        }

        sellItem(timsBask, "car", 1);
        sellItem(timsBask,"spanner",5);
        sellItem(timsBask,"cup",12);
        sellItem(timsBask,"bread",1);
        sellItem(timsBask,"juice",4);
        System.out.println(timsBask);
    }
    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) !=0){
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
