package pe.scotiabank.onebank.loans.adapters.in.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.scotiabank.onebank.loans.adapters.in.web.models.LoanDTO;
import pe.scotiabank.onebank.loans.config.mappers.LoanMapper;
import pe.scotiabank.onebank.loans.domain.ports.in.GetLoansUseCase;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/loans")
@RequiredArgsConstructor
public class LoansApiController {

    private final GetLoansUseCase getLoansUseCase;
    private final LoanMapper loanMapper;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LoanDTO> getLoans() {
        return getLoansUseCase.getAllLoans().stream()
                                .map(loanMapper::mapToLoanDTO)
                                .collect(Collectors.toList());
    }

}
