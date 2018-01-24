package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.CAT_SEDE_TELEFONO;
import sv.gob.mh.sitepcommon.repository.CAT_SEDE_TELEFONORepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;


@Stateless
public class CAT_SEDE_TELEFONOService extends BaseService<CAT_SEDE_TELEFONO, Double> {

    @Inject
    private CAT_SEDE_TELEFONORepository cAT_SEDE_TELEFONORepository;

    @Override
    public BaseRepository<CAT_SEDE_TELEFONO, Double> getRepository() {
        return cAT_SEDE_TELEFONORepository;
    }

}