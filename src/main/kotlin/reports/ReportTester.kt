package reports.kotlin

class ReportTester() {
}
fun main(){
    val healthReport:Report = HealthReport()
    val financeReport:Report = FinanceReport()
    val reports:MutableList<Report> = mutableListOf()
    reports.add(healthReport)
    reports.add(financeReport)
    for (item in reports){
        item.load()
        item.read()
    }
}