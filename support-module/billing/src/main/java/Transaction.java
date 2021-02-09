import java.math.BigDecimal;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 交易明细
 *
 * @author Zhang Yi
 */
@Getter
@Setter
@ToString
public class Transaction {

    //业务类型
    private BizType bizType;

    //标的买方
    private User buyer;

    //标的卖方
    private User seller;

    //标的金额
    private BigDecimal value;
}
