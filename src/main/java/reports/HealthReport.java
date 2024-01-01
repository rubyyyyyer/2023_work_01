package reports;

public class HealthReport implements Report {
    @Override
    public void load() {
        System.out.println("載入健康檢查報告!");
    }

    @Override
    public void read() {
        System.out.println("印出健康檢查報告!");
    }
}
