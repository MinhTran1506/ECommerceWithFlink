package Dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesPerDay {

    public SalesPerDay(Date transactionDate, double totalSales) {
        this.transactionDate = transactionDate;
        this.totalSales = totalSales;
    }
    private Date transactionDate;
    private Double totalSales;

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }
}
