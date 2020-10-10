package kr.db.connection.mysql;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    String getCurrentTime();
}
