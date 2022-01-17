package pe.scotiabank.onebank.loans.domain.usecases;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pe.scotiabank.onebank.loans.config.mappers.LoanMapper;
import pe.scotiabank.onebank.loans.domain.ports.in.models.LoanModel;
import pe.scotiabank.onebank.loans.domain.ports.in.GetLoansUseCase;
import pe.scotiabank.onebank.loans.domain.ports.out.GetLoansPort;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class GetLoansUseCaseImpl implements GetLoansUseCase {

    private final GetLoansPort getLoansPort;
    private final LoanMapper loanMapper;

    @Override
    public List<LoanModel> getAllLoans() {
        return getLoansPort.getAllLoans().stream()
                            .map(loanMapper::mapToLoanModel)
                            // TODO : apply some business logic
                            .collect(Collectors.toList());
    }

}
