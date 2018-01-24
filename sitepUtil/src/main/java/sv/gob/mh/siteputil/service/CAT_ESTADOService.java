package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.CAT_ESTADO;
import sv.gob.mh.sitepcommon.repository.CAT_ESTADORepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;

@Stateless
public class CAT_ESTADOService extends BaseService<CAT_ESTADO, Long> {

    @Inject
    private CAT_ESTADORepository cAT_ESTADORepository;

    @Override
    public BaseRepository<CAT_ESTADO, Long> getRepository() {
        return cAT_ESTADORepository;
    }

}