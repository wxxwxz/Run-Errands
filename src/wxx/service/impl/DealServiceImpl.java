package wxx.service.impl;

import org.springframework.stereotype.Service;
import wxx.dao.IDealDao;
import wxx.entity.DealEntity;
import wxx.entity.ResultCause;
import wxx.service.IDealService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DealServiceImpl implements IDealService {
    @Resource
    private IDealDao dealDao;

    @Override
    public ResultCause addDeal(DealEntity deal) {
        String sql = "insert into deal (releaseID,receiver) values (:releaseID,:receiver)";
        dealDao.saveDeal(sql,deal);
        return new ResultCause(ResultCause.SUCCESS_CODE,"添加数据成功");
    }

    @Override
    public List<DealEntity> listMyDeal(String id) {
        String sql = "select * from deal where receiver = ?";
        return dealDao.listDeal(sql,new Object[]{id});
    }
}
