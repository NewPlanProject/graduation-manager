package org.citic.iiot.diagnosis.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by yxw on 2017/7/19.
 */
@Data
@NoArgsConstructor
public class KnowledgeRelateFaultInVO {

    @ApiModelProperty(value = "故障/预警记录id",hidden = false)
    private String id;
    @ApiModelProperty(value = "现象代码",required = true,example = "TSJYJ001")
    private String code;
    @ApiModelProperty(value = "现象分析",hidden = false)
    private String analyse;
    @ApiModelProperty(value = "解决方案",hidden = false)
    private String solution;
    @ApiModelProperty(value = "设备UUID",hidden = false)
    private String deviceid;
    @ApiModelProperty(value = "类型",required = false,example = "2")
    private String type;
    @ApiModelProperty(value = "知识条目ID",required = false,example = "2")
    private String konwid;

}
