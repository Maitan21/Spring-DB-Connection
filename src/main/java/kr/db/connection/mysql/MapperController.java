package kr.db.connection.mysql;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapperController {

    @Autowired
    TestMapper testMapper;

    @RequestMapping("/")
    public String startPoint() {
        System.out.println(" DB에서 가지고온 현재시간 : " + testMapper.getCurrentTime());
        return "index";
    }

}
