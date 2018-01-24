package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.CAT_TIPO_SEDE;
import sv.gob.mh.sitepcommon.repository.CAT_TIPO_SEDERepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;


@Stateless
public class CAT_TIPO_SEDEService extends BaseService<CAT_TIPO_SEDE, Double> {

    @Inject
    private CAT_TIPO_SEDERepository cAT_TIPO_SEDERepository;

    @Override
    public BaseRepository<CAT_TIPO_SEDE, Double> getRepository() {
        return cAT_TIPO_SEDERepository;
    }

}