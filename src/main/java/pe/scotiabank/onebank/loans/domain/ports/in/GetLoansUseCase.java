package pe.scotiabank.onebank.loans.domain.ports.in;

import pe.scotiabank.onebank.loans.domain.ports.in.models.LoanModel;

import java.util.List;

public interface GetLoansUseCase {

    List<LoanModel> getAllLoans();

}
