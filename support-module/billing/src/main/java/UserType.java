/**
 * 参与者类型
 *
 * @author Zhang Yi
 */
public enum UserType {

    //投资者
    INVEST(0),
    //结算参与人
    SETTLE_PARTICIPANT(1),
    //证券公司
    BROKER(2),
    //融入方
    BORROWER(3);

    int val;

    UserType(int val) {
        this.val = val;
    }
}
