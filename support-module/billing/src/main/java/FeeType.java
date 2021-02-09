/**
 * 费用项定义
 *
 * @author Zhang Yi
 */
public enum FeeType {

    //(交易所，交易)经手费
    TRADE_FEE(10),

    //(证监会)监管费
    MANAGEMENT_FEE(20),

    //(税务机关)印花税
    TAX_FEE(30),

    //(登记结算公司)登记过户费
    ACCOUNT_TRANS_FEE(40),

    //(登记结算公司)结算费
    SETTLE_FEE(50),

    //(登记结算公司)证券结算风险基金
    RISK_FEE(60);


    int val;

    FeeType(int val) {
        this.val = val;
    }
    }
