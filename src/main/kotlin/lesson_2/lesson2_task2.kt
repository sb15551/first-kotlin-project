package ru.behavior.lesson_2

fun main() {

    val permanentEmployeesCount: Int = 50
    val permanentEmployeeSalary: Int = 30_000

    val internsCount: Int = 30
    val internSalary: Int = 20_000

    val permanentEmployeesSalaryExpenses = permanentEmployeesCount * permanentEmployeeSalary
    val totalSalaryExpensesAfterInterns = permanentEmployeesSalaryExpenses + internsCount * internSalary
    val averageSalaryAfterInterns = totalSalaryExpensesAfterInterns / (permanentEmployeesCount + internsCount)

    println(permanentEmployeesSalaryExpenses)
    println(totalSalaryExpensesAfterInterns)
    println(averageSalaryAfterInterns)

}