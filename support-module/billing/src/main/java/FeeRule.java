import java.math.BigDecimal;

/**
 *
 *
 * @author Zhang Yi
 */
public abstract class FeeRule {
    /**
     * 从业务上下文中获取 指定类型的收款方、付款方、收费基础依据，获取具体的配置值，执行计算。
     * @return 费用金额
     */
    public abstract BigDecimal calculate(BizContext context);
}
