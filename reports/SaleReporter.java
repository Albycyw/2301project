package reports;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.*;
import java.sql.*;

/**
 * This SaleReporter is a control object that provide service to the UI. Its
 * generateReport method will create a text file that contains a sale report
 * with the path name specified. If the end date of the report provided from the
 * UI is later than the date of generating the report, an exception will be thrown.
 *
 * IMPORTANT: Albert: since constructing the SaleReport is very time consuming,
 * please make a process bar for this service.
 * @author kevin
 */
public class SaleReporter
{
    public SaleReporter(){}

    /**
     * This method generate a sale report to a text file. The report period is
     * specified by the parameters. Also its destination file path name is passed
     * to the parameter.
     * @post the text file that contains the sale report will be created in the
     * path name identified.
     * @param startDate The start date of the report.
     * @param endDate The end date of the report.
     * @param patbooleanhName The destination path name.
     * @throws SQLException from the database error while construcing the SaleReport
     * object.
     * @throws IOException If the endDate of the report is later than the date
     * of reporting, this exception will be thrown.
     */
    public void generateReport(GregorianCalendar startDate, GregorianCalendar endDate,
                                String pathName)
            throws SQLException, IOException, ClassNotFoundException
    {
        SaleReport report = new SaleReport(startDate, endDate);
        File reportFile = new File(pathName);
        if(!reportFile.exists())
            reportFile.createNewFile();
        PrintWriter reportWriter = new PrintWriter(reportFile);
        String startDateString = "" + startDate.get(startDate.YEAR) + "-" +
                                (startDate.get(startDate.MONTH) + 1 ) + "-" +
                                startDate.get(startDate.DATE);
        String endDateString = "" + endDate.get(endDate.YEAR) + "-" +
                               (endDate.get(endDate.MONTH) + 1) + "-" +
                               endDate.get(endDate.DATE);
        reportWriter.print("Sale Report from " + startDateString + " to "
                + endDateString);
        reportWriter.println("\n" +
                "INCOME:\n" +
                "Rentals            $" + report.getRentalsIncome() + "\n" +
                "Sales:             $" + report.getSalesIncome() + "\n" +
                "Penalty            $" + report.getPenalty() + "\n" +
                "Sub Total:         $" + report.getTotalIncome() + "\n" +
                "Tax:               $" + report.getIncomeTax() + "\n" +
                "\n" +
                "Discounts and Refunds:\n" +
                "Discounts:         $" + report.getDiscount() + "\n" +
                "Refunds:           $" + report.getRefund() + "\n" +
                "Total detuctable:  $" + report.getDiscRefTotal() + "\n" +
                "Returned tax:      $" + report.getReturnTax() + "\n"+
                "\n" +
                "REVENUE:           $" + report.getRevenue() + "\n" +
                "TAX SHOULD PAY:    $" + report.getTaxShouldPay() + "\n"+
                "\n" +
                "Cash credit:       $" + report.getCashCredit() + "\n" +
                "Cash debit:        $" + report.getCashDebit() + "\n" +
                "CASH BALANCE:      $" + report.getCashBalance()+ "\n" +
                "Debit credit:      $" + report.getDebitCredit() + "\n" +
                "Debit debit:       $" + report.getDebitDebit()+ "\n" +
                "DEBIT BALANCE:     $" + report.getDebitBalance() +"\n" +
                "Credit credit:     $" + report.getCreditCredit() + "\n" +
                "Credit debit:      $" + report.getCreditDebit() + "\n" +
                "CREDIT BALANCE:    $" + report.getCreditBalance() + "\n" +
                "TOTAL BALANCE:     $" + report.getTotalBalance() + "\n" +
                "\n" +
                "Money          +/- $_______" + "\n\n" +
                "FINAL REVENUE OF THIS REPORT PERIOD:" + "\n" +
                "$_________");
        reportWriter.close();
    }

    /**
     * This private method is to check the validation of the end date of the report.
     * It is not allowed to generate report for the future.
     * @param date the date that wanted to be examined.
     * @return true if the date is not later than "today", false otherwise.
     */
    private boolean isDateValid(GregorianCalendar date)
    {
        GregorianCalendar now = new GregorianCalendar();
        if(date.before(now))
            return true;
        else
            return false;
    }
}
