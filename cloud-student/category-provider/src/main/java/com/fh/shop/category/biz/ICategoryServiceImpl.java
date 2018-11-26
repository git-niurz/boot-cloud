package com.fh.shop.category.biz;

import com.fh.common.ServerResponse;
import com.fh.shop.category.mapper.ICategoryMapper;
import com.fh.shop.category.po.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("categoryService")
@Transactional(rollbackFor = Exception.class)
public class ICategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryMapper categoryMapper;

    @Transactional(readOnly = true)
    @Override
    public ServerResponse findList(Integer id) {
        List<Category> list = categoryMapper.findList(id);
        return ServerResponse.success(list);
    }
}
