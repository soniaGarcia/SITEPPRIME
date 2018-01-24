package sv.gob.mh.sitep2.view;

import javax.faces.event.ActionEvent;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import sv.gob.mh.sitepcommon.domain.ING_DECOMISO_IMAGEN;
import sv.gob.mh.siteputil.service.ING_DECOMISO_IMAGENService;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.siteputil.view.BaseView;

@Named(value= "ing_decomiso_imagenView")
@ViewScoped
@Getter
@Setter
public class ING_DECOMISO_IMAGENView extends BaseView<ING_DECOMISO_IMAGEN, Double> {

    @Inject
    private transient ING_DECOMISO_IMAGENService iNG_DECOMISO_IMAGENService;

    @Override
    public BaseService<ING_DECOMISO_IMAGEN, Double> getService() {
        return iNG_DECOMISO_IMAGENService;
    }

    @Override
    public void prepareView(ActionEvent e) {
        super.prepareView(e);

    }
}