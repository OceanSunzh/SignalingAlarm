package cn.com.chinaunicom.alarm.serviceimpl;



import cn.com.chinaunicom.alarm.domain.SatypeFileSize;
import cn.com.chinaunicom.alarm.mapper.SatypeFileSizeMapper;
import cn.com.chinaunicom.alarm.service.SatypeFileSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class SatypeFileSizeServiceImpl implements SatypeFileSizeService {

    @Autowired
    private SatypeFileSizeMapper satypeFileSizeMapper;

    @Override
    public List<SatypeFileSize> getAll() {
        return satypeFileSizeMapper.getAll();
    }
}
