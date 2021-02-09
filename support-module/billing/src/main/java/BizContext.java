import java.util.Collections;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Zhang Yi
 */
@Getter
@Setter
@ToString
public class BizContext {

    private Map<UserType, User> userMap;

    private Transaction transaction;
}
