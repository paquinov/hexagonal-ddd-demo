package pe.scotiabank.onebank.loans.adapters.in.web.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class LoanDTO {

    private String id;
    private BigDecimal initialAmount;
    private int feesAmount;
    private double interestRate;

}
