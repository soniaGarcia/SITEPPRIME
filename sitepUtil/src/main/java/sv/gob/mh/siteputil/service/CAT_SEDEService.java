package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.CAT_SEDE;
import sv.gob.mh.sitepcommon.repository.CAT_SEDERepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;


@Stateless
public class CAT_SEDEService extends BaseService<CAT_SEDE, Double> {

    @Inject
    private CAT_SEDERepository cAT_SEDERepository;

    @Override
    public BaseRepository<CAT_SEDE, Double> getRepository() {
        return cAT_SEDERepository;
    }

}