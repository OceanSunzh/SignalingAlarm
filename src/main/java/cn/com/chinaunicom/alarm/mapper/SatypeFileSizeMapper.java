package cn.com.chinaunicom.alarm.mapper;

import cn.com.chinaunicom.alarm.domain.SatypeFileSize;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SatypeFileSizeMapper {
    public List<SatypeFileSize> getAll();
}
