package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.sitepcommon.domain.CAT_EMBALAJE;
import sv.gob.mh.sitepcommon.repository.CAT_EMBALAJERepository;

@Stateless
public class CAT_EMBALAJEService extends BaseService<CAT_EMBALAJE, Long> {

    @Inject
    private CAT_EMBALAJERepository cAT_EMBALAJERepository;

    @Override
    public BaseRepository<CAT_EMBALAJE, Long> getRepository() {
        return cAT_EMBALAJERepository;
    }

}