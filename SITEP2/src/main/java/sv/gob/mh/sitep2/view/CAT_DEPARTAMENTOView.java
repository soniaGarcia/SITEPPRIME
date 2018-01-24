package sv.gob.mh.sitep2.view;

import javax.faces.event.ActionEvent;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import sv.gob.mh.sitepcommon.domain.CAT_DEPARTAMENTO;
import sv.gob.mh.siteputil.service.CAT_DEPARTAMENTOService;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.siteputil.view.BaseView;


@Named(value= "cat_departamentoView")
@ViewScoped
@Getter
@Setter
public class CAT_DEPARTAMENTOView extends BaseView<CAT_DEPARTAMENTO, Double> {

    @Inject
    private transient CAT_DEPARTAMENTOService cAT_DEPARTAMENTOService;

    @Override
    public BaseService<CAT_DEPARTAMENTO, Double> getService() {
        return cAT_DEPARTAMENTOService;
    }

    @Override
    public void prepareView(ActionEvent e) {
        super.prepareView(e);

    }
}