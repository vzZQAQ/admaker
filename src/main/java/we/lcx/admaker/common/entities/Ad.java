package we.lcx.admaker.common.entities;

import lombok.Data;
import we.lcx.admaker.common.enums.ShowType;

import java.util.List;

/**
 * Created by LinChenxiao on 2019/12/20 16:47
 **/
@Data
public class Ad {
    private Integer flightId;
    private Integer positionId;
    private String flightName;
    private String positionName;
    private String refId;
    private ShowType mainType;
    private String showType;
    private List<Unit> units;
}
