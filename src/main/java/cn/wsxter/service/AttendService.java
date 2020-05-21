package cn.wsxter.service;

import cn.wsxter.domain.Attendquestion;

import java.util.HashMap;


public interface AttendService {

    int findTotalCountbyUserId(Integer user_id);

    Attendquestion attendQuery(HashMap<String,Object> map);

    void attendQues(Attendquestion attendquestion);

    void delAttend(Attendquestion attendquestion);
}
