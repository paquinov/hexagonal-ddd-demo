package pe.scotiabank.onebank.loans.config.mappers;

import org.springframework.stereotype.Component;
import pe.scotiabank.onebank.loans.adapters.in.web.models.LoanDTO;
import pe.scotiabank.onebank.loans.domain.ports.in.models.LoanModel;
import pe.scotiabank.onebank.loans.domain.ports.out.models.RawLoan;

@Component
public class LoanMapper {

    public LoanDTO mapToLoanDTO(LoanModel loanModel) {
        return LoanDTO.builder()
                .id(loanModel.getId())
                .initialAmount(loanModel.getAmount())
                .feesAmount(loanModel.getFeesQuantity())
                .interestRate(loanModel.getRate())
                .build();
    }

    public LoanModel mapToLoanModel(RawLoan rawLoan) {
        return LoanModel.builder()
                .id(rawLoan.getId())
                .amount(rawLoan.getAmount())
                .feesQuantity(rawLoan.getFeesQuantity())
                .rate(rawLoan.getRate())
                .build();
    }

}
