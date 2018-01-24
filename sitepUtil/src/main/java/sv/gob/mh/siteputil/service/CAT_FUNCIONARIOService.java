package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.CAT_FUNCIONARIO;
import sv.gob.mh.sitepcommon.repository.CAT_FUNCIONARIORepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;


@Stateless
public class CAT_FUNCIONARIOService extends BaseService<CAT_FUNCIONARIO, Double> {

    @Inject
    private CAT_FUNCIONARIORepository cAT_FUNCIONARIORepository;

    @Override
    public BaseRepository<CAT_FUNCIONARIO, Double> getRepository() {
        return cAT_FUNCIONARIORepository;
    }

}