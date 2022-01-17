package pe.scotiabank.onebank.loans.domain.ports.out.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class RawLoan {

    private String id;
    private BigDecimal amount;
    private int feesQuantity;
    private double rate;

}
