package cn.wsxter.service.Impl;

import cn.wsxter.service.AttendService;
import cn.wsxter.dao.AttendMapper;
import cn.wsxter.domain.Attendquestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service("attendService")
public class AttendServiceImp implements AttendService {
    @Autowired
    private AttendMapper attendMapper;

    @Override
    public int findTotalCountbyUserId(Integer user_id) {
        return attendMapper.findTotalCountbyUserId(user_id);
    }

    @Override
    public Attendquestion attendQuery(HashMap<String,Object> map) {
        return attendMapper.attendQuery(map);
    }

    @Override
    public void attendQues(Attendquestion attendquestion) {

        attendMapper.attendQues(attendquestion);
    }

    @Override
    public void delAttend(Attendquestion attendquestion) {

        attendMapper.delAttend(attendquestion);
    }


}
