package Dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesPerCategory {

    public SalesPerCategory(Date transactionDate, String category, double totalSales) {
        this.transactionDate = transactionDate;
        this.category = category;
        this.totalSales = totalSales;
    }
    private Date transactionDate;
    private String category;
    private Double totalSales;

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }
}
