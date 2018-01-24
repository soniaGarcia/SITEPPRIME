package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.CAT_TIPOS_DEVOLUCION;
import sv.gob.mh.sitepcommon.repository.CAT_TIPOS_DEVOLUCIONRepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;

@Stateless
public class CAT_TIPOS_DEVOLUCIONService extends BaseService<CAT_TIPOS_DEVOLUCION, Double> {

    @Inject
    private CAT_TIPOS_DEVOLUCIONRepository cAT_TIPOS_DEVOLUCIONRepository;

    @Override
    public BaseRepository<CAT_TIPOS_DEVOLUCION, Double> getRepository() {
        return cAT_TIPOS_DEVOLUCIONRepository;
    }

}