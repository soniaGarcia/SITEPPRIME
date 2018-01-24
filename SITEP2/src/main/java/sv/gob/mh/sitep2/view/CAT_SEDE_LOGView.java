package sv.gob.mh.sitep2.view;

import javax.faces.event.ActionEvent;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import sv.gob.mh.sitepcommon.domain.CAT_SEDE_LOG;
import sv.gob.mh.siteputil.service.CAT_SEDE_LOGService;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.siteputil.view.BaseView;


@Named(value= "cat_sede_logView")
@ViewScoped
@Getter
@Setter
public class CAT_SEDE_LOGView extends BaseView<CAT_SEDE_LOG, Double> {

    @Inject
    private transient CAT_SEDE_LOGService cAT_SEDE_LOGService;

    @Override
    public BaseService<CAT_SEDE_LOG, Double> getService() {
        return cAT_SEDE_LOGService;
    }

    @Override
    public void prepareView(ActionEvent e) {
        super.prepareView(e);

    }
}