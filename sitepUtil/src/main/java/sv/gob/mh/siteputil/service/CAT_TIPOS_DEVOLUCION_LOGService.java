package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.CAT_TIPOS_DEVOLUCION_LOG;
import sv.gob.mh.sitepcommon.repository.CAT_TIPOS_DEVOLUCION_LOGRepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;

@Stateless
public class CAT_TIPOS_DEVOLUCION_LOGService extends BaseService<CAT_TIPOS_DEVOLUCION_LOG, Double> {

    @Inject
    private CAT_TIPOS_DEVOLUCION_LOGRepository cAT_TIPOS_DEVOLUCION_LOGRepository;

    @Override
    public BaseRepository<CAT_TIPOS_DEVOLUCION_LOG, Double> getRepository() {
        return cAT_TIPOS_DEVOLUCION_LOGRepository;
    }

}