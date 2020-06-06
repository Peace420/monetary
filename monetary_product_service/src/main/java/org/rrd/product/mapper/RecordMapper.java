package org.rrd.product.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.rrd.system.pojo.Record;

@Mapper
public interface RecordMapper  {

    void insert(Record record);
}
