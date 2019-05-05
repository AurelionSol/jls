package com.qpanda.jls.Service;

import com.qpanda.jls.pojo.Wrongitem;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface wrongItemService {
    void addWrongitem(Wrongitem wrongitem);

    void deleteWrongitemById(Integer id);

    void updateWrongitem(Wrongitem wrongitem);

    Wrongitem getWrongitemById(Integer id);

    List<Wrongitem> listAllWrongitem();

    int getWrongitemCount();

    List<Wrongitem> listWrongitemByUserId(Integer userId);
}
