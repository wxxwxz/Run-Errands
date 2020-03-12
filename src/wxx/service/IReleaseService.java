package wxx.service;

import wxx.entity.ReleaseEntity;
import wxx.entity.ResultCause;

import java.util.List;

public interface IReleaseService {

    public ResultCause addRelease(ReleaseEntity release);

    public List<ReleaseEntity> listRelease();

    public List<ReleaseEntity> listUcRelease();

    public List<ReleaseEntity> listMyRelease(String id);

    public ResultCause checkRelease(Integer id);

    public ResultCause beReceived(Integer id);
}
