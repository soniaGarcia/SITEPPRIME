package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.ING_DECOMISO_DELITO_LOG;
import sv.gob.mh.sitepcommon.repository.ING_DECOMISO_DELITO_LOGRepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;

@Stateless
public class ING_DECOMISO_DELITO_LOGService extends BaseService<ING_DECOMISO_DELITO_LOG, Double> {

    @Inject
    private ING_DECOMISO_DELITO_LOGRepository iNG_DECOMISO_DELITO_LOGRepository;

    @Override
    public BaseRepository<ING_DECOMISO_DELITO_LOG, Double> getRepository() {
        return iNG_DECOMISO_DELITO_LOGRepository;
    }

}