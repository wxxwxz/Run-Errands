package wxx.service;

import wxx.entity.DealEntity;
import wxx.entity.ResultCause;

import java.util.List;

public interface IDealService {

    public ResultCause addDeal(DealEntity deal);

    public List<DealEntity> listMyDeal(String id);

}
