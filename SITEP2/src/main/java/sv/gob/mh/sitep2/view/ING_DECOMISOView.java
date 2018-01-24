package sv.gob.mh.sitep2.view;

import javax.faces.event.ActionEvent;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import sv.gob.mh.sitepcommon.domain.ING_DECOMISO;
import sv.gob.mh.siteputil.service.ING_DECOMISOService;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.siteputil.view.BaseView;


@Named(value= "ing_decomisoView")
@ViewScoped
@Getter
@Setter
public class ING_DECOMISOView extends BaseView<ING_DECOMISO, Double> {

    @Inject
    private transient ING_DECOMISOService iNG_DECOMISOService;

    @Override
    public BaseService<ING_DECOMISO, Double> getService() {
        return iNG_DECOMISOService;
    }

    @Override
    public void prepareView(ActionEvent e) {
        super.prepareView(e);

    }
}