package sv.gob.mh.sitep2.view;

import javax.faces.event.ActionEvent;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import sv.gob.mh.sitepcommon.domain.CAT_ESTADO;
import sv.gob.mh.siteputil.service.CAT_ESTADOService;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.siteputil.view.BaseView;

@Named(value= "cat_estadoView")
@ViewScoped
@Getter
@Setter
public class CAT_ESTADOView extends BaseView<CAT_ESTADO, Long> {

    @Inject
    private transient CAT_ESTADOService cAT_ESTADOService;

    @Override
    public BaseService<CAT_ESTADO, Long> getService() {
        return cAT_ESTADOService;
    }

    @Override
    public void prepareView(ActionEvent e) {
        super.prepareView(e);

    }
}