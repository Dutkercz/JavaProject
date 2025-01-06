package Exercises.ApplicationEight;

import Exercises.ApplicationEight.Entities.Contract;
import Exercises.ApplicationEight.Entities.Installments;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract (Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double tax = onlinePaymentService.paymentFee(basicQuota + interest);

            double totalQuota = basicQuota + interest + tax;

            contract.getInstallments().add(new Installments(dueDate, totalQuota));
        }
    }
}
