package wxx.service.impl;

import org.springframework.stereotype.Service;
import wxx.dao.IReleaseDao;
import wxx.entity.ReleaseEntity;
import wxx.entity.ResultCause;
import wxx.service.IReleaseService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReleaseServiceImpl implements IReleaseService {
    @Resource
    private IReleaseDao releaseDao;

    @Override
    public ResultCause addRelease(ReleaseEntity release) {
        String sql = "insert into release_errand (userID,description,price) values (:userID,:description,:price)";
        releaseDao.saveRelease(sql,release);
        return new ResultCause(ResultCause.SUCCESS_CODE,"添加数据成功");
    }
//
    @Override
    public List<ReleaseEntity> listRelease() {
        String sql = "select * from release_errand where isChecked = 1 and isReceived = 0";
        return releaseDao.listRelease(sql,new Object[]{});
    }

    @Override
    public List<ReleaseEntity> listUcRelease() {
        String sql = "select * from release_errand where isChecked = 0";
        return releaseDao.listRelease(sql,new Object[]{});
    }

    @Override
    public List<ReleaseEntity> listMyRelease(String id) {
        String sql = "select * from release_errand where userID = ?";
        return releaseDao.listRelease(sql,new Object[]{id});
    }

    @Override
    public ResultCause checkRelease(Integer id) {
        ResultCause result = new ResultCause();
        String sql = "update release_errand set isChecked = 1 where releaseID = ?";
        releaseDao.updateReleaseData(sql,new Object[]{getTargetRelease(id).getReleaseID()});
        result.setCode(ResultCause.SUCCESS_CODE);
        result.setDesc("pass");
        return result;
    }

    @Override
    public ResultCause beReceived(Integer id) {
        ResultCause result = new ResultCause();
        String sql = "update release_errand set isReceived = 1 where releaseID = ?";
        releaseDao.updateReleaseData(sql,new Object[]{getTargetRelease(id).getReleaseID()});
        result.setCode(ResultCause.SUCCESS_CODE);
        result.setDesc("pass");
        return result;
    }

    private ReleaseEntity getTargetRelease(Integer id){
        String sql = "select * from release_errand where releaseID = ?";
        List<ReleaseEntity> releaseEntities = releaseDao.listRelease(sql,new Object[]{id});
        return (releaseEntities!=null&&releaseEntities.size()>0)?releaseEntities.get(0):null;
    }

}
