//Stock Account Management

class Stock {
    static int Stock_A(int no_of_shares ,int share_price){
        return no_of_shares*share_price;
    }
    static int Stock_B(int no_of_shares , int share_price){
        return no_of_shares*share_price;
    }
}
class StockPortfolio {
    public static void main(String[] args){
        System.out.println("Total Share Of A:"+Stock.Stock_A (25,50));
        System.out.println("Total Share Of B:"+Stock.Stock_B(50,60));

    }
}

