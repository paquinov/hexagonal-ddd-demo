package pe.scotiabank.onebank.loans.domain.ports.out;

import pe.scotiabank.onebank.loans.domain.ports.out.models.RawLoan;

import java.util.List;

public interface GetLoansPort {

    List<RawLoan> getAllLoans();

}
