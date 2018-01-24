package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.ING_DECOMISO_IMAGEN;
import sv.gob.mh.sitepcommon.repository.ING_DECOMISO_IMAGENRepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;

@Stateless
public class ING_DECOMISO_IMAGENService extends BaseService<ING_DECOMISO_IMAGEN, Double> {

    @Inject
    private ING_DECOMISO_IMAGENRepository iNG_DECOMISO_IMAGENRepository;

    @Override
    public BaseRepository<ING_DECOMISO_IMAGEN, Double> getRepository() {
        return iNG_DECOMISO_IMAGENRepository;
    }

}