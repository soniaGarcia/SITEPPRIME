package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.repository.CAT_EMBALAJE_LOGRepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.sv.gob.mh.sitep.model.CAT_EMBALAJE_LOG;

@Stateless
public class CAT_EMBALAJE_LOGService extends BaseService<CAT_EMBALAJE_LOG, Double> {

    @Inject
    private CAT_EMBALAJE_LOGRepository cAT_EMBALAJE_LOGRepository;

    @Override
    public BaseRepository<CAT_EMBALAJE_LOG, Double> getRepository() {
        return cAT_EMBALAJE_LOGRepository;
    }

}