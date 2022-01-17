package pe.scotiabank.onebank.loans.adapters.out.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pe.scotiabank.onebank.loans.domain.ports.out.GetLoansPort;
import pe.scotiabank.onebank.loans.domain.ports.out.models.RawLoan;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class LoansPersistenceAdapter implements GetLoansPort {

    @Override
    public List<RawLoan> getAllLoans() {
        return Arrays.asList(
                RawLoan.builder()
                        .id(UUID.randomUUID().toString())
                        .amount(new BigDecimal("34700.00"))
                        .feesQuantity(8)
                        .rate(10.0)
                        .build(),
                RawLoan.builder()
                        .id(UUID.randomUUID().toString())
                        .amount(new BigDecimal("58000.00"))
                        .feesQuantity(14)
                        .rate(12.0)
                        .build(),
                RawLoan.builder()
                        .id(UUID.randomUUID().toString())
                        .amount(new BigDecimal("230000.00"))
                        .feesQuantity(20)
                        .rate(15.0)
                        .build()
        );
    }

}
