package wxx.dao;

import wxx.entity.ReleaseEntity;

import java.util.List;

public interface IReleaseDao {

    public void saveRelease(String sql, ReleaseEntity release);

    public List<ReleaseEntity> listRelease(String sql, Object[] keys);

    public void updateReleaseData(String sql, Object[] keys);


}