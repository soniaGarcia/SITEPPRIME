package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.domain.CAT_MUNICIPIO;
import sv.gob.mh.sitepcommon.repository.CAT_MUNICIPIORepository;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;


@Stateless
public class CAT_MUNICIPIOService extends BaseService<CAT_MUNICIPIO, Double> {

    @Inject
    private CAT_MUNICIPIORepository cAT_MUNICIPIORepository;

    @Override
    public BaseRepository<CAT_MUNICIPIO, Double> getRepository() {
        return cAT_MUNICIPIORepository;
    }

}