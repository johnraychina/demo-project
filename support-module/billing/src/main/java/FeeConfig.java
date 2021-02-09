import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zhang Yi
 */
public class FeeConfig {


    private static Map<BizType, List<FeeItem>> bizFeeTable = new HashMap<BizType, List<FeeItem>>();

    static {
        List<FeeItem> aTradeList = new ArrayList<FeeItem>();

        bizFeeTable.put(BizType.A_TRADE, aTradeList);
    }
}
