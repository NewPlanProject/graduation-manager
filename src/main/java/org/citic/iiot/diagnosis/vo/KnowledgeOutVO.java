package org.citic.iiot.diagnosis.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by yxw on 2017/7/19.
 */
@Data
@NoArgsConstructor
public class KnowledgeOutVO implements Serializable{

    private static final long serialVersionUID = -1L;
    private String knowid;
    private String code;
    private String knowname;
    private String type;
    private String relationid;
    private String relationname;
    private String devicemodelid;
    private String devicemodelname;
    private String userid;
    private String disindex;
}
