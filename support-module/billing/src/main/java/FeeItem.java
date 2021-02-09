import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 收费项=业务类型+费用类型+收费标准
 *
 * 一个收费项是最细粒度的配置，如果是双边收取，则必须拆分为2条FeeItem.
 *
 * todo 如果收费项有依赖关系，比如 FeeC = FeeA+FeeB >threshold: X : Y;
 * 考虑使用组合模式
 *
 * @author Zhang Yi
 */
@Getter
@Setter
@ToString
public class FeeItem {
    private int version; //版本号
    private BizType bizType; //业务类型
    private FeeType feeType; //费用类型
    private FeeRule feeRule; //收费标准
}
