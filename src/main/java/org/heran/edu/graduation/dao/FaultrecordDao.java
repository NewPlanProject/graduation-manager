package org.heran.edu.graduation.dao;

import org.citic.iiot.app.core.mybaits.MapperDaoTemplate;
import org.heran.edu.graduation.domain.Faultrecord;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FaultrecordDao extends MapperDaoTemplate<Faultrecord> {

    @Autowired
    public FaultrecordDao(SqlSessionTemplate sqlSessionTemplate){
        super(sqlSessionTemplate);
    }

}
