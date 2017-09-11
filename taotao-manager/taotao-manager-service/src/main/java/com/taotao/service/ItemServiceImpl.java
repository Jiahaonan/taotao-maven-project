package com.taotao.service;


import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by M6800 on 2017/8/27.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;


    @Override
    public TbItem getItemById(Long id) {
        return tbItemMapper.selectByPrimaryKey(id);
    }
}
