package train.station;

public class Cashier {
    int oneWayPrice;
    int oneWayNum;
    int roundTripNum;
    float discount;

    public Cashier(int oneWayPrice, int oneWayNum, int roundTripNum, float discount) {
        this.oneWayPrice = oneWayPrice;
        this.oneWayNum = oneWayNum;
        this.roundTripNum = roundTripNum;
        this.discount = discount;
    }

    public int count() {
        int count = (int) ((oneWayPrice * oneWayNum) + (oneWayPrice * roundTripNum * 2 * discount));
        System.out.println("單程票總費用:" + oneWayNum * oneWayPrice + "\t" + "雙程票總費用:" +
                (int) (roundTripNum * 2 * oneWayPrice * discount) + "\t" + "加總:" + count + "\t" +
                "共" + (oneWayNum + roundTripNum) + "張票");

        return count;
    }
}
