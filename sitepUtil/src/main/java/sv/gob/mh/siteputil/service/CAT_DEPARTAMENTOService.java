package sv.gob.mh.siteputil.service;


import javax.ejb.Stateless;
import javax.inject.Inject;
import sv.gob.mh.sitepcommon.repository.util.BaseRepository;
import sv.gob.mh.siteputil.service.base.BaseService;

import sv.gob.mh.sitepcommon.domain.CAT_DEPARTAMENTO;
import sv.gob.mh.sitepcommon.repository.CAT_DEPARTAMENTORepository;


@Stateless
public class CAT_DEPARTAMENTOService extends BaseService<CAT_DEPARTAMENTO, Double> {

    @Inject
    private CAT_DEPARTAMENTORepository cAT_DEPARTAMENTORepository;

    @Override
    public BaseRepository<CAT_DEPARTAMENTO, Double> getRepository() {
        return cAT_DEPARTAMENTORepository;
    }

}