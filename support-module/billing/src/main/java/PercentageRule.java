import java.math.BigDecimal;

/**
 * 收费规则：按比例计收
 *
 * @author Zhang Yi
 */
public class PercentageRule extends FeeRule {
    private UserType payerType; //付款方类型
    private UserType changerType; //收款方类型
    private BigDecimal percentage; //百分比, 设置时100%就是100，系统会给你处理百分号

    /**
     * 从业务上下文中获取 指定类型的收款方、付款方、收费基础依据，获取具体的配置值，执行计算。
     *
     * @return 费用金额
     */
    public BigDecimal calculate(BizContext context) {
        Transaction tx = context.getTransaction(); //交易明细
        BigDecimal base = tx.getValue(); //收费基础依据

        //todo 指定精度
        return base.multiply(base);
    }

    public static void main(String[] args) {
        //BigDecimal normalNumber = BigDecimal.valueOf(100).multiply(BigDecimal.valueOf(10));
        BigDecimal hugeNumber = BigDecimal.valueOf(Long.MAX_VALUE - 1).multiply(BigDecimal.valueOf(Long.MAX_VALUE - 1));
        System.out.println(hugeNumber.toPlainString());
    }
}
