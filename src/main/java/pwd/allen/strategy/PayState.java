package pwd.allen.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author lenovo
 * @create 2020-01-31 16:57
 **/
@Data
@AllArgsConstructor
public class PayState {

    private int code;
    private String name;
    private String msg;

}
