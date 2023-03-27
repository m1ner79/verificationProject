package cme;

import java.math.BigDecimal;

public interface ReductionStrategy {
    BigDecimal calculate(BigDecimal totalCost);
}
