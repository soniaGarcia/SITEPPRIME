package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.ING_DECOMISO_DELITO;
import sv.gob.mh.sitepcommon.repository.ING_DECOMISO_DELITORepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;


@Stateless
public class ING_DECOMISO_DELITOService extends BaseService<ING_DECOMISO_DELITO, Double> {

    @Inject
    private ING_DECOMISO_DELITORepository iNG_DECOMISO_DELITORepository;

    @Override
    public BaseRepository<ING_DECOMISO_DELITO, Double> getRepository() {
        return iNG_DECOMISO_DELITORepository;
    }

}