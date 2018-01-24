package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.ING_DECOMISO;
import sv.gob.mh.sitepcommon.repository.ING_DECOMISORepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;


@Stateless
public class ING_DECOMISOService extends BaseService<ING_DECOMISO, Double> {

    @Inject
    private ING_DECOMISORepository iNG_DECOMISORepository;

    @Override
    public BaseRepository<ING_DECOMISO, Double> getRepository() {
        return iNG_DECOMISORepository;
    }

}