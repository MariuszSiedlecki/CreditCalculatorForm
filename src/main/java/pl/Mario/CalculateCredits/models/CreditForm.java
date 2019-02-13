package pl.Mario.CalculateCredits.models;

import lombok.Data;

@Data
public class CreditForm {
    private int salary;
    private int costs;
    private int creditAmount;
    private int loanPeriod;
}
