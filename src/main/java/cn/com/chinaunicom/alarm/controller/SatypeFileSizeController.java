package cn.com.chinaunicom.alarm.controller;



import cn.com.chinaunicom.alarm.domain.SatypeFileSize;
import cn.com.chinaunicom.alarm.service.SatypeFileSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class SatypeFileSizeController {

    @Autowired
    private SatypeFileSizeService satypeFileSizeService;

    @RequestMapping("/satypefilesize")
    @ResponseBody
    public List<SatypeFileSize> getAll(){
        System.out.println("satypeFileSize:"+satypeFileSizeService.getAll());
        return satypeFileSizeService.getAll();
    }

}
