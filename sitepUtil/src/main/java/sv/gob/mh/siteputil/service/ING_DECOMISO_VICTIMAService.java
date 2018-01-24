package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.ING_DECOMISO_VICTIMA;
import sv.gob.mh.sitepcommon.repository.ING_DECOMISO_VICTIMARepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;


@Stateless
public class ING_DECOMISO_VICTIMAService extends BaseService<ING_DECOMISO_VICTIMA, Double> {

    @Inject
    private ING_DECOMISO_VICTIMARepository iNG_DECOMISO_VICTIMARepository;

    @Override
    public BaseRepository<ING_DECOMISO_VICTIMA, Double> getRepository() {
        return iNG_DECOMISO_VICTIMARepository;
    }

}