import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhang Yi
 */
public class BizFeeConfig {
    //版本号
    private int version = 0;
    //收费项
    private List<FeeItem> feeItems;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public List<FeeItem> getFeeItems() {
        return feeItems;
    }

    public void setFeeItems(List<FeeItem> feeItems) {
        this.feeItems = feeItems;
    }
}
