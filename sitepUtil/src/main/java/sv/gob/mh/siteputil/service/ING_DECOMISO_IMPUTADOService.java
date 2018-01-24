package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.ING_DECOMISO_IMPUTADO;
import sv.gob.mh.sitepcommon.repository.ING_DECOMISO_IMPUTADORepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;


@Stateless
public class ING_DECOMISO_IMPUTADOService extends BaseService<ING_DECOMISO_IMPUTADO, Double> {

    @Inject
    private ING_DECOMISO_IMPUTADORepository iNG_DECOMISO_IMPUTADORepository;

    @Override
    public BaseRepository<ING_DECOMISO_IMPUTADO, Double> getRepository() {
        return iNG_DECOMISO_IMPUTADORepository;
    }

}