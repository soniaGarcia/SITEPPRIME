package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.ING_DECOMISO_IMAGEN_LOG;
import sv.gob.mh.sitepcommon.repository.ING_DECOMISO_IMAGEN_LOGRepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;

@Stateless
public class ING_DECOMISO_IMAGEN_LOGService extends BaseService<ING_DECOMISO_IMAGEN_LOG, Double> {

    @Inject
    private ING_DECOMISO_IMAGEN_LOGRepository iNG_DECOMISO_IMAGEN_LOGRepository;

    @Override
    public BaseRepository<ING_DECOMISO_IMAGEN_LOG, Double> getRepository() {
        return iNG_DECOMISO_IMAGEN_LOGRepository;
    }

}