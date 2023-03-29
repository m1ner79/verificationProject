package cme;

import java.math.BigDecimal;

public class ManagementReduction implements Reduction {
    public BigDecimal calculateReduction(BigDecimal totalCost) {
        BigDecimal minimumAmount = new BigDecimal(5);
        return totalCost.compareTo(minimumAmount) <= 0 ? minimumAmount :totalCost;
    }

}
