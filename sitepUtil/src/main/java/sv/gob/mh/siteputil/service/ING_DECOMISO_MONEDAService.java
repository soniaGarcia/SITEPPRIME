package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.ING_DECOMISO_MONEDA;
import sv.gob.mh.sitepcommon.repository.ING_DECOMISO_MONEDARepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;


@Stateless
public class ING_DECOMISO_MONEDAService extends BaseService<ING_DECOMISO_MONEDA, Double> {

    @Inject
    private ING_DECOMISO_MONEDARepository iNG_DECOMISO_MONEDARepository;

    @Override
    public BaseRepository<ING_DECOMISO_MONEDA, Double> getRepository() {
        return iNG_DECOMISO_MONEDARepository;
    }

}