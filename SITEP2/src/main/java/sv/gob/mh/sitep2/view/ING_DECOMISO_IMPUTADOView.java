package sv.gob.mh.sitep2.view;

import javax.faces.event.ActionEvent;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import sv.gob.mh.sitepcommon.domain.ING_DECOMISO_IMPUTADO;
import sv.gob.mh.siteputil.service.ING_DECOMISO_IMPUTADOService;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.siteputil.view.BaseView;


@Named(value= "ing_decomiso_imputadoView")
@ViewScoped
@Getter
@Setter
public class ING_DECOMISO_IMPUTADOView extends BaseView<ING_DECOMISO_IMPUTADO, Double> {

    @Inject
    private transient ING_DECOMISO_IMPUTADOService iNG_DECOMISO_IMPUTADOService;

    @Override
    public BaseService<ING_DECOMISO_IMPUTADO, Double> getService() {
        return iNG_DECOMISO_IMPUTADOService;
    }

    @Override
    public void prepareView(ActionEvent e) {
        super.prepareView(e);

    }
}