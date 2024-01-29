package reports.kotlin

class FinanceReport : Report {
    override fun load() = println("載入財務報表")
    override fun read() = println("印出財務報表")

}