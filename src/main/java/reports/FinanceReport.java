package reports;

public class FinanceReport implements Report{
    @Override
    public void load() {
        System.out.println("載入財務報表!");
    }

    @Override
    public void read() {
        System.out.println("印出財務報表!");
    }
}
