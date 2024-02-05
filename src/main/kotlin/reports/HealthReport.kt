package reports

class HealthReport : Report {
    override fun load() = println("載入健康檢查報告")
    override fun read() = println("印出健康檢查報告")

}