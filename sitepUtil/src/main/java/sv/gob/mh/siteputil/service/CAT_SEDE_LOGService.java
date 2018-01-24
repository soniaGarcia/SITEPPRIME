package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.CAT_SEDE_LOG;
import sv.gob.mh.sitepcommon.repository.CAT_SEDE_LOGRepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;


@Stateless
public class CAT_SEDE_LOGService extends BaseService<CAT_SEDE_LOG, Double> {

    @Inject
    private CAT_SEDE_LOGRepository cAT_SEDE_LOGRepository;

    @Override
    public BaseRepository<CAT_SEDE_LOG, Double> getRepository() {
        return cAT_SEDE_LOGRepository;
    }

}