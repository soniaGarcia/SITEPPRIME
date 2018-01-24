package sv.gob.mh.sitep2.view;

import javax.faces.event.ActionEvent;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import sv.gob.mh.sitepcommon.domain.ING_DECOMISO_VICTIMA;
import sv.gob.mh.siteputil.service.ING_DECOMISO_VICTIMAService;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.siteputil.view.BaseView;


@Named(value= "ing_decomiso_victimaView")
@ViewScoped
@Getter
@Setter
public class ING_DECOMISO_VICTIMAView extends BaseView<ING_DECOMISO_VICTIMA, Double> {

    @Inject
    private transient ING_DECOMISO_VICTIMAService iNG_DECOMISO_VICTIMAService;

    @Override
    public BaseService<ING_DECOMISO_VICTIMA, Double> getService() {
        return iNG_DECOMISO_VICTIMAService;
    }

    @Override
    public void prepareView(ActionEvent e) {
        super.prepareView(e);

    }
}